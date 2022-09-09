package Kotlin3

fun main(){
    val dt1 = People("Nguyễn Văn A",20)

    println("Họ và tên : ${dt1.ten}")
    println("Tuổi : ${dt1.tuoi}")

}

class People(var ten:String,var tuoi:Int){

}