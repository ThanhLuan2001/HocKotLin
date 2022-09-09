package Kotlin3

open class ConNguoi( ten :String, tuoi:Int){
    init {
        println("Tên tôi là : $ten")
        println("Tuổi tôi là : $tuoi")
    }
}

class GiaoVien(ten :String,tuoi:Int):ConNguoi(ten,tuoi){
    fun GioiThieuGV(){
        println("Tôi đang là giáo viên")
    }
}

class CauThu(ten: String,tuoi: Int): ConNguoi(ten,tuoi){
    fun GioiThieuCT(){
        println("Tôi đang là cầu thủ")
    }
}

fun main(){
    val gv = GiaoVien("NTN",18);
    gv.GioiThieuGV()
    val ct = CauThu("NVC",20);
    ct.GioiThieuCT()
}

