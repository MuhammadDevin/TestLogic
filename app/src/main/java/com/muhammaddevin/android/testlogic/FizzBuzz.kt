package com.muhammaddevin.android.testlogic

fun main() {
    fizzBuzz(15)
}

fun fizzBuzz(n: Int){
    (1..n).forEach {
        when{
            it % 3 == 0 && it % 5 == 0 -> println("fizzbuzz")
            it % 3 == 0 -> println("fizz")
            it % 5 == 0 -> println("buzz")
            else -> println(it)
        }
    }
}



