package Kotlin5


data class HS(val ten:String,val tuoi:Int,val lop:String){

}



fun main(){
    val hs1 = HS("Nguyễn Văn A",16,"12A4")

    val hs2 = hs1.copy(ten = "Nguyễn Văn B")

    println("Tên : ${hs1.ten} Tuổi : ${hs1.tuoi} Lớp : ${hs1.lop}")
    println("Tên : ${hs2.component1()} Tuổi : ${hs2.component2()} Lớp : ${hs2.component3()}")
}