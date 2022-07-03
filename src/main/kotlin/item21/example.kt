package item21

import kotlin.properties.Delegates




private fun lazy() {
    val lazyValue: String by lazy {
        println("computed!")
        "Hello"
    }

    println(lazyValue)
    println(lazyValue)
}


private fun observable() {
    class User {
        var name: String by Delegates.observable("<no name>") {
                _, old, new ->
            println("$old -> $new")
        }
    }

    val user = User()
    user.name = "first"
    user.name = "second"
}

private fun vetoable() {
    var max: Int by Delegates.vetoable(0) { _, oldValue, newValue ->
        newValue > oldValue
    }

    println(max) // 0

    max = 10
    println(max) // 10

    max = 5
    println(max) // 10


    var max2: Int by Delegates.vetoable(0) { _, oldValue, newValue ->
        if (newValue > oldValue) true else throw IllegalArgumentException("New value must be larger than old value.")
    }

    println(max2) // 0

    max2 = 10
    println(max2) // 10

    try {
        max2 = 5 // will fail with IllegalArgumentException
    } catch (e: IllegalArgumentException) {
        println(e)
    }
}

private fun notnull() {
    var max3: Int by Delegates.notNull()

    try {
        println(max3) // will fail with IllegalStateException
    } catch (e: IllegalStateException) {
        println(e)
    }

    max3 = 10
    println(max3) // 10
}

fun main() {
    lazy()
    observable()
    vetoable()
    notnull()
}