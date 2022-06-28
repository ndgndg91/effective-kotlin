package item8

class Printer {
    fun print() {

    }
}

fun main(args: Array<String>) {
    getPrinter()?.print() // safe call
    val printer = getPrinter()
    if (printer != null) printer.print() // smart casting

    val printer2 = getPrinter()?: Printer() // Elvis
    printer2.print()
    try {
        getPrinter()?: throw IllegalStateException()
    } catch (e: IllegalStateException) {
        e.printStackTrace()
    }
}

private fun getPrinter(): Printer? {
    return null
}