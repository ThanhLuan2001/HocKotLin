package Kotlin3

open class Infor(ten :String, tuoi:Int){

}

class BacSi(ten :String, tuoi:Int,nghenghiep:String):Infor(ten, tuoi){
    init {
        println("tên tôi là :$ten")
        println("năm nay tôi $tuoi tuổi")
        println("nghề nghiệp hiện tại của tôi là $nghenghiep")
    }
}


fun main(){
    val bs = BacSi("vũ xuân bắc",25,"Bác sĩ")
}