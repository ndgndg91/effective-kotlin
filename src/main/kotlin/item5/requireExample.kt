package item5

private fun factorial(n: Int): Long {
    require(n >= 0) {
        "Cannot calculate factorial of $n because it is smaller than 0"
    }
    return if (n <= 1) 1 else factorial(n - 1) * n
}

private interface Cluster

private interface Point

private fun findClusters(points: List<Point>): List<Cluster> {
    require(points.isNotEmpty())
    // do something
    return listOf()
}

private interface User {
    fun email(): String?
}

private fun sendEmail(user: User, message: String) {
    requireNotNull(user.email())
    require(isValidEmail(user.email()))
    // send email
}

fun isValidEmail(email: String?): Boolean {
    TODO("check email is valid")
}

fun main(args: Array<String>) {
    try {
        factorial(-1)
    } catch (e: IllegalArgumentException) {
        println(e)
    }

    try {
        findClusters(listOf())
    } catch (e: IllegalArgumentException) {
        println(e)
    }
}