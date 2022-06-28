package item5

var isOpen = false
var token: String? = null

private fun getUserInfo() {
    checkNotNull(token)
}

private fun next(): String {
    check(isOpen)
    return "next"
}

fun main(args: Array<String>) {
    try {
        getUserInfo()
    } catch (e: IllegalStateException) {
        e.printStackTrace()
    }

    try {
        next()
    } catch (e: IllegalStateException) {
        e.printStackTrace()
    }
}
