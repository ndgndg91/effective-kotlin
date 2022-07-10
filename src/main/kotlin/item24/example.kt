package item24

private fun covariant() {
    class Cup<out T>
    open class Dog
    class Puppy: Dog()

    val b: Cup<Dog> = Cup<Puppy>()
//    val a: Cup<Puppy> = Cup<Dog>() compile error

    val anys: Cup<Any> = Cup<Int>()
//    val nothings: Cup<Nothing> = Cup<Int>() compile error
}

private fun contravariant() {
    class Cup<in T>
    open class Dog
    class Puppy: Dog()

//    val b: Cup<Dog> = Cup<Puppy>() compile error
    val a: Cup<Puppy> = Cup<Dog>()

//    val anys: Cup<Any> = Cup<Int>() compile error
    val nothings: Cup<Nothing> = Cup<Int>()
}

fun main() {
    covariant()
    contravariant()
}