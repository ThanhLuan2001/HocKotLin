package Kotlin1

fun main() {


//    toán tử	Ý nghĩa	Biểu thức	Dịch sang ngôn ngữ lập trình Kotlin
//    >	lớn hơn	a> b	a.compareTo (b)> 0
//    <	bé hơn	a<b	    a.compareTo (b) <0
//    > =	lớn hơn hoặc bằng	a> = b	a.compareTo (b)> = 0
//    <=	nhỏ hơn hoặc bằng	a <= b	a.compareTo (b) <= 0
//    ==	bằng	a == b	a? .equals (b) ?: (b === null)
//    ! =	không bằng	a! = b	!(a?.equals(b) ?: (b === null))


//    toán tử	Mô tả	Biểu thức	Hàm tương ứng
//    ||	trả về true nếu một trong các biểu thức Boolean là true	(a>b)||(a<c)	(a>b)or(a<c)
//    &&	trả về true nếu tất cả các biểu thức Boolean là true	(a>b)&&(a<c)	(a>b)and(a<c)

    val so1 = 10
    val so2 = 8
    val so3 = 6

    if (so1 > so2) {
        println("Số 1 lớn hơn số 2")
    } else {
        println("Số 2 lớn hơn số 1")
    }

    var result: Boolean

    result = (so1 > so2) && (so1 > so3)//cả 2 điều kiện phải đúng mới trả giá trị true
    println("Kết quả: " + result)

    result = (so1 > so2) || (so1 > so3)//chỉ cần 1 điều kiện đúng sẽ trả giá trị true
    println("Kết quả: " + result)

    result = (so2 > so1) && (so2 > so3)//cả 2 điều kiện phải đúng mới trả giá trị true
    println("Kết quả: " + result)


}