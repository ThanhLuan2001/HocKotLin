package Lab2

class NhapDanhSach {

}


fun main() {
    var list = arrayListOf<Int>()
    var tong = 0

    while (true) {
        var nb = readLine()!!.toInt()
        list.add(nb)

        tong = tong + nb

        println("Bạn có muốn nhập tiếp không Y/N")


        var yn :String = readLine().toString()

        if (yn.equals("N")||yn.equals("n")) {
            break
        }

    }

    println("danh sach vua nhap la $list")

    println("Tổng:$tong")
}