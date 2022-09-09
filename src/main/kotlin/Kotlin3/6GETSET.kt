package Kotlin3

fun main(){

    val hs1 = HocSinh()
    hs1.diem = 10

    println("Điểm hs 1 : ${hs1.diem}")

    val hs2 = HocSinh()
    hs2.diem = 20

    println("Điểm hs 2 : ${hs2.diem}")

}


class HocSinh{
    var diem:Int = 0


    get() = field// field là điểm

    set(value){
        if(value>=0&&value<=10){ //nếu giá trị nhập vào đúng với điều kiện
            field = value        // thì điểm sẽ bằng giá trị nhập
        }else{                   //nếu giá trị nhập vào sai điều kiện
            field = -1          // thì điểm sẽ bằng -1
        }
    }
}