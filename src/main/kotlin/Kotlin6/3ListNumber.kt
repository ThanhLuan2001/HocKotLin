package Kotlin6

fun main(){
    val numbers = mutableListOf(1, 2, 3, 4)
    println(numbers)
    numbers.add(5)//thêm phần tử 5 vào mảng
    println(numbers)
    numbers.removeAt(1)//xóa phần tử ở vị trí thứ 1 trong mảng
    println(numbers)
    numbers[0] = 0//thay đổi giá trị ở vị trí thứ 0
    println(numbers)
    numbers.shuffle()//xáo trộn
    println(numbers)
}