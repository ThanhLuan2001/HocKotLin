package Kotlin4

open class VBBanDau(){
   open var vb = "Cha"
}

class VBThayThe:VBBanDau(){
    override var vb = "Con"
}

fun main(){
    val v = VBThayThe();
    println(v.vb)
}