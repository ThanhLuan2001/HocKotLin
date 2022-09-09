package Kotlin2


fun main() {
    println("Mời nhập số : ")
    val so = readLine()!!.toInt()
    if (so > 0) {
        println("Số dương")
    } else if (so < 0) {
        println("Số âm")
    } else {
        println("Số 0")
    }

    println("Mời nhập số thứ 2: ")
    val so2 = readLine()!!.toInt()
    println("Mời nhập số thứ 3: ")
    val so3 = readLine()!!.toInt()

    val max =
       if (so2 > so3)
        "${so2}"
       else
        "${so3}"

    println("Số lớn nhất là : " + max)
}