package Kotlin3

open class Hinh(tenHinh:String){

    init {
        println("Tên hình : $tenHinh")
    }

}

class HinhChuNhat(tenHinh: String,chieudai:Int,chieurong:Int):Hinh(tenHinh){
    init {
        println("Chu vi : ${(chieudai+chieurong)*2}")
        println("Diện tích : ${chieudai*chieurong}")
    }
}

class HinhVuong(tenHinh: String,canh:Int):Hinh(tenHinh){
    init {
        println("Chu vi : ${(canh)*4}")
        println("Diện tích : ${canh*canh}")
    }
}

fun main(){
    val HCN = HinhChuNhat("Hình chữ nhật",10,5);
    val HV = HinhVuong("Hình vuông",10)
}

