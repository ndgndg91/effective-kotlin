package item1

private data class User(
    val name: String,
    val surname: String
)

fun main(args: Array<String>) {
    var user = User("Maja", "Markiewicz")
    user = user.copy(surname = "Moska")
    println(user)
}