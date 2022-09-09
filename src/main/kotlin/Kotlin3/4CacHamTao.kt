package Kotlin3

class Game(ten:String= "Lỗi" , nsx :Int = 0){

   val name = ten.capitalize();//in hoa chữ cái đầu tiên


    init {
        println("Tên game : $name")
        println("Năm sản xuất  $nsx")
    }
}


fun main(){
    val g1 = Game("liên quân",2017);
    val g2 = Game("liên minh");
    val g3 = Game();

}