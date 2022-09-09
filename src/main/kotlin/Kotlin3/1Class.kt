package Kotlin3


class LightBulb{
    var isOn = true
    fun turnOn(){
        isOn = true
    }
    fun turnOff(){
        isOn = false
    }
    fun Status(bd:String){
        if(isOn==true){
            println("$bd đang bật")
        }else{
            println("$bd đang tắt")

        }
    }

}

open class A{
    open var ten:String ="";
}

class B:A(){
    override var ten:String ="";
}

fun main(){
    val lb1 = LightBulb();
    val lb2 = LightBulb();

    lb1.turnOff()
    lb2.turnOn()

    lb1.Status("Bóng đèn 1")
    lb2.Status("Bóng đèn 2")

    val b = B();
    b.ten ="Văn bản thay thế"
    println(b.ten)

}