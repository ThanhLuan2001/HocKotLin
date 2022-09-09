package Kotlin1

fun main() {
    var a = 10

    a = a + 10;
    println(a)

    var b = 5
    b -= 3
    println(b)

    var c = 9
    c *= 3
    println(c)

    var d = 12
    d /= 3
    println(d)

//    Biểu thức	Tương đương với	Dịch sang ngôn ngữ lập trình Kotlin
//    a + = b	a = a + b	a.plusAssign (b)
//    a – = b	a = a – b	a.minusAssign (b)
//    a * = b	a = a * b	a.timesAssign (b)
//    a / = b	a = a / b	a.divAssign (b)
//    a % = b	a = a % b	a.modAssign (b)

    val v = 1
    val l = true
    var m = 6
    var so = 5

    var result: Int
    var booleanResult: Boolean

    result = -v
    println("-v = $result")

    booleanResult = !l
    println("!l = $booleanResult")

    --m
    println("--m = $m")

    so++
    println(so)
}