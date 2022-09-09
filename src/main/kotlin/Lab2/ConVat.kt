package Lab2

class ConVat {

    var ten: String  = ""
    var mausac: String  = ""



    fun Nhap(){
        println("Nhập tên :")
        ten = readLine().toString()
        println("Nhập màu sắc :")
        mausac = readLine().toString()
    }
    fun Xuat(){
        println("tên  là $ten")
        println("màu sắc  $mausac")
    }
}

fun main(){
    val cv1 = ConVat()
    cv1.Nhap()
    cv1.Xuat()


    val cv2 = ConVat()
    cv2.Nhap()
    cv2.Xuat()
}