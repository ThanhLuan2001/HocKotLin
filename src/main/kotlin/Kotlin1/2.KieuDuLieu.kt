package Kotlin1

fun main() {

    // kiểu var có thể thay đổi giá trị
    //kiểu val không thể thay đổi giá trị
    // ví dụ

    var so = 5
    so = 6

    println("Số: $so")

    val chu = "A"
  //    chu ="B"      chương trình sẽ báo lỗi vì kiểu val không thể thay đổi giá trị

    // khi khai báo biến bạn có thể chỉ định kiểu dữ liệu cho nó hoặc không cũng được
    // nếu không chỉ định kiểu dữ liệu thì chương trình sẽ tự suy luận kiểu dữ liệu cho biến

    var bien1: Int = 1;//biến có chỉ định kiểu dữ liệu sẵn là int
    var bien2 = "Nguyễn Thành Luận"//biến tự suy luận kiểu dữ liệu là string

    //-----------------------------------------------------------------------------------------

    val i: Int = 1; //kiểu int -2^31 đến 2^31-1
    println(i)

    val d: Double = 1.4;//kiểu double là dấu phẩy động 64 bit chính xác kép
    println(d)

    val f: Float = 10.5F;//kiểu float là một điểm nổi 32 bit có độ chính xác hơn
    println(f)

    val s: String = "ABCD";//kiểu String là chuỗi
    println(s)

    val b: Byte = 100;//kiểu byte -128 đến 127
    println(b)

    val sh: Short = 10000;//kiểu short -32768  đến 32767
    println(sh)

    val bl: Boolean = true;//kiểu boolean giá trị true/false
    println(bl)

    val l: Long = 1000L;//kiểu long -2^63 đến 2^63-1
    println(l)

    val c: Char = 'h';//kiểu char chỉ nhận 1 ký tự và phải dùng dấu ''
    println(c)


}