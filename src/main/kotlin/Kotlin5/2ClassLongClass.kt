package Kotlin5

class A{
    val ten:String = "Nguyễn thành luận"

    class B{
        val tuoi:Int = 20
    }
}


fun main(){
    val a = A()
    println(a.ten)
    val b = A.B()
    println(b.tuoi)
}