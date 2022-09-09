package Kotlin4

abstract class C_h_a(){
    abstract val ten:String

    abstract fun hanh_dong(hanhdong:String)
}


class C_o_n : C_h_a() {
    override val ten: String = "so 1"

    init {
        println("$ten")
    }

    override fun hanh_dong(hanhdong:String) {
        println("$hanhdong")
    }
}

fun main(){
    val con = C_o_n();
    con.hanh_dong("ĐANG CHẠY NHẢY")
}