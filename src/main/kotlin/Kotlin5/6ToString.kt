package Kotlin5

data class U(val name: String, val age: Int)

fun main(args: Array<String>) {
    val u1 = U("John", 29)
    println(u1.toString())

}