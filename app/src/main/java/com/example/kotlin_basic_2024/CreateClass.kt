package com.example.kotlin_basic_2024


fun main(){

    val kb = CreateClass()
    println("Acess class variable  kotlin   " + kb.SomeInteger)


    val add = CreateClass().add(5,20)
    println("my add number is " + add)


}


class CreateClass {
    var SomeInteger = 20


fun add(a:Int, b:Int): Int{
    return a + b
}

}


