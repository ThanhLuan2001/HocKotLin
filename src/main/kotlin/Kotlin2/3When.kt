package Kotlin2


fun main() {
    println("Mời bạn nhập số")
    val so = readLine()!!.toInt()
    when (so) {
        1, 3, 5, 7 -> println("Số lẻ")
        2, 4, 6, 8 -> println("Số chẵn")
        0 -> println("Số 0")
        else -> println("Từ 0 đến 8 cmm")
    }
}