package Kotlin1


fun main() {
    print("Nguyễn ")
    println("Thành ")
    print("Luận ")
    println("20 ")

    var so = 15;
    println(so)
    println("so")
    println("$so")
    println("$so" + "$so")//cộng kiểu này là 15+15 = 1515 =))))
    println("${so + so}")

    println("Mời bạn nhập tên : ")
    var name = readLine();
    println("Mời bạn nhập tuổi : ")
    var age = readLine()!!.toInt();

    println("tên " + name)
    println("Tuổi " + age)

}