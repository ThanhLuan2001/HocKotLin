package Kotlin2

fun main(){
    for (i in 1..10){

        if(i%9==0){
            break
        }
        println(i)
    }

    //----------------------


    var sum = 0
    var so:Int
    while (true){
        println("Enter a number: ")
        so = readLine()!!.toInt()
        if(so==0){
            break
        }
        sum+=so
    }
    println(sum)

    //----------------------


    first@ for (i in 1..3){
        second@ for (j in 1..2){
            println("i = $i ; j = $j")
            if(i==2){
                break@first
            }
        }

    }

    println("------------------------------------")

    first@ for (i in 1..3){
        second@ for (j in 1..2){
            println("i = $i ; j = $j")
            if(i==2){
                break@second
            }
        }

    }
}
