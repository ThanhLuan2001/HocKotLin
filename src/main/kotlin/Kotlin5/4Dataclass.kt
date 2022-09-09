package Kotlin5

data class User(val name: String, val age: Int)

fun main() {
    val jack = User("jack", 29)
    println("name = ${jack.name}")
    println("age = ${jack.age}")
}