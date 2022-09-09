package Kotlin2

import java.util.*

fun main(){
    for (i in 1..10){
        println("kkk")
        if (i>6){
            break
        }
        println("hello")
    }


    //----------------------------
    var so: Int
    var tong = 0
    for (i in 1..6){
        println("Mời bạn nhập số lớn hơn 0")
        so = readLine()!!.toInt()
        if (so<=0)
            continue
        tong +=so
    }
    println("Tổng = $tong")

    println("--------------------------")

    here@ for (i in 1..5) {
        for (j in 1..4) {
            if (i == 3 || j == 2)
                continue@here
            println("i = $i; j = $j")
        }
    }

}
