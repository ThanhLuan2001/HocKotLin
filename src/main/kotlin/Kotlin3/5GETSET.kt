package Kotlin3

fun main(){

    val ct =CTY();
    ct.name ="Thành luận"

    println(ct.name)


}


class CTY(){
    var name:String = "Vĩnh Hưng"

    get() = field

    set(value){
        field = value
    }
}