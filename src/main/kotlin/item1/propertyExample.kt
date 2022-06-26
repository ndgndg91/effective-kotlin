package item1

private fun valProperty() {
    val a = 10
    //a = 20 compile error

    println(a)
}

private fun varProperty() {
    val name = Name("Nam", "Dong Gil")
    println(name.fullName)
    name.firstName = "Gil Dong"
    println(name.fullName)
}

private class Name(var lastName: String,
           var firstName: String) {
    val fullName get() = "$lastName $firstName"
}

private fun mutableList() {
    val list = mutableListOf(1,2,3)
    list.add(4)

    println(list)
}

private fun calculate(): Int {
    print("계산중..")
    return 42
}

val fizz = calculate()
val buzz get() = calculate()


fun main(args: Array<String>) {
    valProperty()
    varProperty()
    mutableList()

    println(fizz)
    println(fizz)
    println(buzz)
    println(buzz)
}