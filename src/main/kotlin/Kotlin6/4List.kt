package Kotlin6

fun main(){
    val numbers = (1..10).toList()
    println(numbers.subList(3,8))

    println("vị trí của phần tử 2 trong mảng là : ${numbers.indexOf(2)}")
    println(numbers.lastIndexOf(6))
}