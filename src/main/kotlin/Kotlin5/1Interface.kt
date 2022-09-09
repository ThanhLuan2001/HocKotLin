package Kotlin5

interface ConVat{
    val ten:String
    val tuoi:Int
}

class Meo : ConVat{
    override val ten: String = "Con mèo"
    override val tuoi: Int = 2
    init {
        println("Tên : $ten")
        println("Tuổi : $tuoi")
    }
}


fun main(){
    val meo = Meo();
}