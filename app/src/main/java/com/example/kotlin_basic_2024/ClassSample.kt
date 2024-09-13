package com.example.kotlin_basic_2024


fun main(){

val kb = ClassSample()
    println("The Integer is " + kb.someInt);
    println("my function return " +kb.Add(4,6) )

}

class ClassSample {
  var someInt = 10;

    fun Add(a:Int, b:Int):Int{
        return  a + b
    }


}