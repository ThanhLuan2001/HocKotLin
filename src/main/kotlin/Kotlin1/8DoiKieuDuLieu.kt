package Kotlin1

fun main() {

    val so: Double = 10.6;//biến số có dữ liệu kiểu double
    val chuoi: Int = so.toInt();//ép số từ kiểu double về kiểu int

    println(chuoi)

    //ngoài ra còn rất nhiều hàm
    //toByte()
    //toShort()
    //toInt()
    //toLong()
    //toFloat()
    //toDouble()
    //toChar()
    //Lưu ý, kiểu Boolean không thể chuyển sang bất cứ kiểu dữ liệu nào khác.

    val number1: Int = 545344
    val number2: Byte = number1.toByte()
    println("number1 = $number1")
    println("number2 = $number2")

}