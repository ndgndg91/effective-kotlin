package item1

import kotlin.properties.Delegates

private fun pointOfChange() {
    val list: MutableList<Int> = mutableListOf()
    var list2: List<Int> = listOf()

    list.add(1)
    list2 = list2 + 1

    list += 2 // list.plusAssign(2)
    list2 = list2 + 2  // list2.plus(2)

    println(list)
    println(list2)

    var names by Delegates.observable(listOf<String>()) { _, old, new -> println("Names changed from $old to $new") }

    names = names + "Fabio" // Names changed from [] to [Fabio]
    names = names + "Bill" // Names changed from [Fabio] to [Fabio, Bill]
}

fun main(args: Array<String>) {
    pointOfChange()
}