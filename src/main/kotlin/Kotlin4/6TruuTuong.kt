package Kotlin4

abstract class TruuTuong(){
    abstract var ten:String
}

class ThucThi:TruuTuong(){
    override var ten: String = "ĐÃ THỰC THI"
    init {
        println(ten)
    }
}

fun main(){
    var tt = ThucThi()
}