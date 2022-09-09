package Kotlin3

open class ConNguoii{
    open var ten:String = ""
    open var tuoi:Int = 0

    get() = field

    set(value) {
        field = value
    }
}

class Peter : ConNguoii(){

    override var ten:String = ""
    override var tuoi:Int = 0

        get() = field

        set(value) {
            field = value-10
        }
}

fun main(){
    val peter = Peter();
    peter.ten = "Peter"
    peter.tuoi = 25

    println("Tên của anh ấy là  ${peter.ten}")
    println("10 năm trước anh ấy ${peter.tuoi} tuổi")
}