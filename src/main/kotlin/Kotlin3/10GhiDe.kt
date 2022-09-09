package Kotlin3

open class Gamee(ten:String){
    init {
        println("Tên game : $ten")
    }
    open fun TheLoai(name:String){
        println("Đây là thể loại game 1 : $name")
    }
}

 class LienQuan(ten:String):Gamee(ten){
    override fun TheLoai(name:String){
        println("Đây là thể loại game 2 : $name")
    }
}

fun main(){
    val lienquan = LienQuan("Liên quân")
    lienquan.TheLoai("Đồng đội")
}
