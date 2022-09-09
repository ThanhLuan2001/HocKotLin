package Lab2

class SanPham {
    var ten:String = "";
    var gia:Int = 0;
    var giamGia:Int = 0;



    fun thueNhapKhau(): Double {
        return  gia* 0.1
    }


    fun HienThi(){
        println("tên: $ten")
        println("giá: $gia")
        println("giảm giá: $giamGia")
        println("thuế nhập khẩu: ${thueNhapKhau()}")
    }
}

fun main(){
    val sp1 = SanPham();
    sp1.ten = "iphone xsmax"
    sp1.gia = 10000
    sp1.giamGia = 100

    sp1.HienThi()
}