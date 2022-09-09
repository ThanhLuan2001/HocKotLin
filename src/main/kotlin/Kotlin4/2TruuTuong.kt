package Kotlin4

abstract class Person{
    fun Name(ten:String){
        println("Tên : $ten")
    }

    fun Age(tuoi:Int){
        println("Tuổi : $tuoi")
    }
    abstract fun HanhDong(hanhdong:String)
}

class Butterfly:Person(){
    override fun HanhDong(hanhdong: String) {
        println("Hành động : $hanhdong")
    }
}

fun main(){
    val btf = Butterfly()
    btf.Name("Butterfly")
    btf.Age(18)
    btf.HanhDong("Đang ngủ")
}