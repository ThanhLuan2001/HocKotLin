package Kotlin3




class People2(ten:String, tuoi:Int){

    val name = ten.capitalize()//hàm này để in thành chữ hoa
    val age = tuoi

    init{

        println("Tên : $name")
        println("Tuổi : $age")
    }
}

fun main(){
    val DT = People2("ntn",20)
}