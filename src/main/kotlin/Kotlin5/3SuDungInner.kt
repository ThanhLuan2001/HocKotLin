package Kotlin5

class AA{
    val ten = "Nguyễn thành luận"

    inner class BB{
        fun text() = ten
    }
}


fun main(){
    val a = AA()
    println(a.ten)
    val b = AA().BB()
    println(b.text())
}