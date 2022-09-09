package Kotlin4

open class Personn() {
    open fun displayAge(age: Int) {
        println("My actual age is $age.")
    }
}

class Girll: Personn() {

    override fun displayAge(age: Int) {

        // calling function of base class
        super.displayAge(age)

        println("My fake age is ${age - 5}.")
    }
}

fun main(args: Array<String>) {
    val girl = Girll()
    girl.displayAge(31)
}