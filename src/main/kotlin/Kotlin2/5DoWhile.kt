package Kotlin2


fun main(){
    var diem = 0;

    do {
        println("Mời bạn nhập điểm")
        diem = readLine()!!.toInt();
    }while (diem<0||diem>10)
}