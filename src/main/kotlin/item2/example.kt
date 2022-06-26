package item2

import java.math.BigInteger

const val a = 1
private fun fizz() {
    val b = 2
    println(a + b)
}
private val buzz = {
    val c = 3
    println(a + c)
}

// 해당 위치에서 b 와 c 를 사용할 수 없다.

private data class User(
    val id: BigInteger,
    val fullName: String
)

private fun badExampleOfUser() {
    var user: User
    val users = listOf(User(BigInteger.ONE, "ndg"))
    for (i in users.indices) {
        user = users[i]
        println("user at $i is $user")
    }
}

private fun improveExampleOfUser() {
    val users = listOf(User(BigInteger.ONE, "ndg"))
    for (i in users.indices) {
        val user = users[i]
        println("user at $i is $user")
    }
}

private fun improveExampleOfUser2() {
    val users = listOf(User(BigInteger.ONE, "ndg"))
    for ((i, user) in users.withIndex()) {
        println("user at $i is $user")
    }
}

private fun getValue() = User(BigInteger.TWO, "user2")

private fun badExampleOfIf(hasValue: Boolean) {
    val user: User
    if (hasValue) {
        user = getValue()
    } else {
        user = User(BigInteger.ONE, "user1")
    }
}

private fun improveExampleOfIf(hasValue: Boolean) {
    val user = if (hasValue) getValue() else User(BigInteger.ONE, "user1")
}

enum class Color {
    RED,
    YELLOW,
    BLUE
}

private fun badExampleUpdateWeather(degrees: Int) {
    val description: String
    val color: Int
    if (degrees < 5) {
        description = "cold"
        color = Color.BLUE.ordinal
    } else if (degrees < 23) {
        description = "mild"
        color = Color.YELLOW.ordinal
    } else {
        description = "hot"
        color = Color.RED.ordinal
    }
    println("$degrees, $description, $color")
}

private fun improveExampleUpdateWeather(degrees: Int) {
    val (description, color) = when {
        degrees < 5 -> "cold" to Color.BLUE.ordinal
        degrees < 23 -> "mild" to Color.YELLOW.ordinal
        else -> "hot" to Color.RED.ordinal
    }
    println("$degrees, $description, $color")
}

fun main(args: Array<String>) {
    fizz()
    println(buzz)

    badExampleOfUser()
    improveExampleOfUser()
    improveExampleOfUser2()

    badExampleOfIf((0..1).random() == 1)
    improveExampleOfIf((0..1).random() == 1)

    badExampleUpdateWeather((0..50).random())
    improveExampleUpdateWeather((0..50).random())
}