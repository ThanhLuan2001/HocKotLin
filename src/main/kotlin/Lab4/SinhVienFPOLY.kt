package Lab4

abstract class SinhVienFPOLY {

    abstract var ten : String
    abstract var nganhHoc : String
    abstract fun getDiemTB():Double
    fun getHocLuc(){
        if(getDiemTB()<5) println("Yếu")
        else if(getDiemTB()>=5&&getDiemTB()<6.5) println("Trung bình")
        else if(getDiemTB()>=6.5&&getDiemTB()<8) println("Khá")
        else if(getDiemTB()>=8&&getDiemTB()<9) println("giỏi")
        else if(getDiemTB()>=9) println("Xuất sắc")
    }
    abstract fun Nhap()
    abstract fun Xuat()
}

class SinhVienIT :SinhVienFPOLY(){

    var java = 0.0
    var html = 0.0
    var css = 0.0

    override var ten: String= ""

    override var nganhHoc: String =""

    override fun getDiemTB(): Double {
        return (java + html + css)/3
    }

    override fun Nhap() {
        println("Nhập tên sinh viên")
        ten= readln()
        println("Nhập ngành học")
        nganhHoc= readln()
        println("Nhập điểm java")
        java= readln().toDouble()
        println("Nhập điểm html")
        html= readln().toDouble()
        println("Nhậpđiểm css")
        css= readln().toDouble()
    }

    override fun Xuat() {
        println("Tên sinh viên it: $ten")
        println("Ngành học: $nganhHoc")
        println("Điểm trung bình: ${getDiemTB()}")
    }
}

fun main(){
    val svit = SinhVienIT()
    svit.Nhap()
    svit.Xuat()
    svit.getHocLuc()

}