package Kotlin4

open class Base() {
    var a = 1                 // public truy cập được tất cả mọi nơi
    private var b = 2         // private chỉ truy cập được trong class Base
    protected open val c = 3  // protected truy cập được ở class Base và các class kế thùa class Base
    internal val d = 4        // internal truy cập được trong 1 file 1MucDoHienThi.kt
    protected fun e() { }     // protected truy cập được ở class Base và các class kế thùa class Base
}
class Derived: Base() {

    // a, c, d, and e() of the Base class are visible
    // b is not visible

    //muốn sử dụng override cần phải ghi open ở đằng trước đối tượng mà mình muốn ghi đè
    override val c = 9    // c is protected
}

fun main(){//vì thằng này không kế thừa class Base nên protected không thể sử dụng
    val base = Base()
    println(base.a)
    println(base.d)

    // base.a and base.d are visible
    // base.b, base.c and base.e() are not visible

    val derived = Derived()
    // derived.c is not visible
    println(base.a)
    println(base.d)
}