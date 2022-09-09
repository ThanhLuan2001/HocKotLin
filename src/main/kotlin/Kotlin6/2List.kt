package Kotlin6

fun main(){
    val ls = listOf(1,2,3,4,5,"54",43)

    for (i in ls){ //in ra tất cả phần tử trong mảng
        println(i)
    }
    println("------------------------------")
    println("${ls[1]}")// lấy ra phần tử ở vị trí số 1 trong mảng-->2

    println("${ls.get(2)}")// lấy ra phần tử ở vị trí số 2 trong mảng-->3

    println("${ls.indexOf("54")}")// kiểm tra phần tử "54" nằmở vị trí số mấy-->5

    println(ls)// in ra cả mảng

    println(ls.getOrNull(5))             // null
    println(ls.getOrElse(5,{it}))


}


