package Kotlin1

fun main() {
    val number1 = 12.5
    val number2 = 3.5
    var result: Double

    result = number1 + number2
    println("number1 + number2 = $result")

    result = number1 - number2
    println("number1 - number2 = $result")

    result = number1 * number2
    println("number1 * number2 = $result")

    result = number1 / number2
    println("number1 / number2 = $result")

    result = number1 % number2 // chia lấy dư
    println("number1 % number2 = $result")

    val firstName = "Nguyễn Thành"
    val lastName = "Luận"

    val name = firstName + lastName//nối chuỗi
    println("$name")

    //Biểu thức Tên hàm	Dịch sang ngôn ngữ lập trình Kotlin
    //a + b	cộng	a.plus (b)
    //a – b	trừ	    a.minus (b)
    //a * b	nhân	a.times (b)
    //a / b	phép chia lấy phần nguyên	a.div (b)
    //a % b	phép chia lấy phần dư	a.mod (b)

}