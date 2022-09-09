package Kotlin2


fun main() {
    println("Nhập số a")
    val a = readLine()!!.toInt()

    println("Nhập phép tính")
    val pheptinh = readLine()

    println("Nhập số b")
    val b = readLine()!!.toInt()


    when (pheptinh) {
        "+" -> println("Tổng 2 số là: " + (a + b))
        "-" -> println("Hiệu 2 số là: " + (a - b))
        "*" -> println("Tích 2 số là: " + (a * b))
        "/" -> println("Thương 2 số là: " + (a / b))
        else -> println("phép tính không hợp lệ : " + pheptinh)
    }
}