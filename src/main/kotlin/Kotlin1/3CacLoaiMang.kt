package Kotlin1

fun main() {

    //MẢNG BẮT ĐẦU CHẠY TỪ 0

    var arr1 = arrayOf(10, "BeginnersBook", 10.99, 'A')//Mảng không định kiểu.
    // vị trí phần tử  0          1           2     3
    println("Phần tử vị trí thứ 0 của mảng: " + arr1[0])

    arr1[2] = 1000 // thay đổi giá trị của phần tử ở vị trí số 2 trong mảng
    println("Xuất phần tử thứ 2 của mảng: " + arr1[2])


    var arr3 = arrayOf<String>("ab", "bc", "cd")//Mảng có kiểu dữ liệu String
    var arr2 = arrayOf<Int>(11, 22, 55, 66, 88)//Mảng có kiểu dữ liệu Int

    //sử dụng get set
    val sdget = arr2.get(2)//lấy ra giá trị của phần tử thứ 2 trong mảng arr2
    println(sdget)
    val sdset = arr2.set(4,100)//thay đổi giá trị của phần tử ở vị trí số 4 trong mảng arr2
    println(arr2[4])

    //sử dụng hàm size để kiểm tra số lượng phần tử trong mảng
    println("số lượng phần tử trong mảng: " + arr2.size)


    //sử dụng hàm contains để kiểm tra phần tử trong mảng có tồn tại hay không
    println("Sự tồn tại của 'bc' trong mảng arr3 là : ${arr3.contains("bc")}")
    println("Sự tồn tại của '2' trong mảng arr2 là : ${arr2.contains(2)}")
    println("Sự tồn tại của '11' trong mảng arr2 là : ${arr2.contains(11)}")


    //sử dụng hàm first() và last() để lấy ra phần tử đầu tiên và phần tử cuối cùng của mảng
    println("Phần tử đầu tiên trong mảng : " + arr2.first())
    println("Phần tử cuối cùng trong mảng : " + arr2.last())

    //sử dụng hàm indexOf() để lấy ra vị trí của phần tử được chỉ định trong mảng
    //nếu phần tử không tồn tại thì sẽ in ra giá trị là -1

    println("Vị trí của phần tử 11 trong mảng là : " + arr2.indexOf(11))
    println("Vị trí của phần tử 121 trong mảng là : " + arr2.indexOf(125341))


}