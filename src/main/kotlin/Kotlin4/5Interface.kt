package Kotlin4



interface MyInterface{
    val age:Int
    fun thongbao():String
}


class InterfaceImp:MyInterface {
    override val age: Int = 100

    override fun thongbao(): String = "Thu 2 di lam"
}
//------------------------------
interface AA{
    val soA :Int
        get() = 23
    fun tb() ="AAA"
}
class BB:AA{
}
//------------------------------
interface MOT{
    fun callA(){
        println("DAY LA A")
    }
}

interface HAI{
    fun callB(){
        println("DAY LA B")
    }
}

class AB:MOT,HAI
//---------------------------------
fun main(){
    val it = InterfaceImp()
    println("${it.age}")
    println("${it.thongbao()}")
    //----------------
    val b = BB()
    println(b.soA)
    println(b.tb())
    //----------------
    val ab = AB();
    ab.callA()
    ab.callB()
}
