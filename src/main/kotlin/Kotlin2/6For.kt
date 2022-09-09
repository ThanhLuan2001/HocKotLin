package Kotlin2

fun main(){
    for (i in 3..5)
        println(i)
    println("--------------------------------")
    //
    for (i in 5 downTo 1)
        println(i)
    println("--------------------------------")
    //
    for (i in 1..10 step 3)
        println(i)
    println("--------------------------------")
    //
    for(i in 20 downTo 1 step 5)
        println(i)
    println("--------------------------------")

    //lặp qua 1 mảng với for

    val tuong = arrayOf("Butterfly","Florentino","Veres","Elan d'orr","Hayate","Zuka");
    println(tuong)
    for (item in tuong) { //lấy ra từng tướng ở trong mảng
        println(item)
    }
    println("--------------------------------")

    for (item in tuong.indices){ //lấy ra vị trí từng tướng ở trong mảng
        if(item%2==0){//nếu item chia2 dư 0
            println(tuong[item])//thì in ra những tướng ở vị trí chia2 dư0
        }
    }
    println("--------------------------------")
    val  text = "Luận"
    for (item in text){
        println(item)
    }
    println("--------------------------------")


    val username = "NGUYENTHANHLUAN"
    for (item in username.indices){//lấy ra vị trí từng chữ cái ở trong mảng
        println(item+1)//in ra vị trís
    }
}