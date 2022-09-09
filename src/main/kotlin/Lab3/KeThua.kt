package Lab3

open class HinhChuNhat(){
    var ten:String = ""
    var cd:Int= 0
    var cr:Int=0

   open fun ChuVi(): Int {
        return (cd+cr)*2
    }

    open fun DienTich(): Int {
        return cd*cr
    }

   open fun Xuat(){
        println("Tên: $ten")
        println("Chiều dài: $cd")
        println("Chiều rộng: $cr")
       println("Chu vi: ${ChuVi()}")
       println("Diện tích: ${DienTich()}")
    }
}

class HinhVuong : HinhChuNhat(){
    var canh : Int = 0

    override fun ChuVi():Int{
        return canh*4
    }

    override fun DienTich(): Int {
        return canh*canh
    }

    override fun Xuat(){
        println("Tên: $ten")
        println("Cạnh : $canh")
        println("Chu vi: ${ChuVi()}")
        println("Diện tích: ${DienTich()}")
    }

}

fun main(){
    val hcn = HinhChuNhat()
    hcn.ten= "Hình chữ nhật"
    hcn.cd = 10
    hcn.cr= 5
    hcn.Xuat()

    val hv = HinhVuong()
    hv.ten= "Hình vuông"
    hv.canh = 10
    hv.Xuat()
}