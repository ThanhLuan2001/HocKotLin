package Kotlin4

abstract class A(){
    abstract var a:String
}

class B:A(){
    override var a:String = "Văn bản ban đầu"
}

fun main(){
    val  b = B()
    println(b.a)
}