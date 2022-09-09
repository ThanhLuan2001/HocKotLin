package Lab1

fun main() {
    println("Mời bạn nhập tháng")
    val month = readLine()!!.toInt()
    println("Mời bạn nhập năm")
    val year = readLine()!!.toInt()

    if (year % 4 == 0) {
        when (month) {
            1, 3, 5, 7, 8, 10, 12 -> println("Tháng $month có 31 ngày")
            4, 6, 9, 11 -> println("Tháng $month có 30 ngày")
            2 -> println("Tháng $month có 29 ngày")
        }
    } else {
        when (month) {
            1, 3, 5, 7, 8, 10, 12 -> println("Tháng $month có 31 ngày")
            4, 6, 9, 11 -> println("Tháng $month có 30 ngày")
            2 -> println("Tháng $month có 28 ngày")
        }
    }
}