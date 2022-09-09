package Kotlin5

object Test{
    var number:Int = 0
    val maxNumber  = 30


    fun NB():Int{
        number = 20

        return number

    }
}

fun main(){
    val t = Test
    println("Số ban đầu ${t.number}")
    println("Số lớn nhất ${t.maxNumber}")
    println("Số thay đổi ${t.NB()}")

}