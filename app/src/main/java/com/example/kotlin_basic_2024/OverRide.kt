package com.example.kotlin_basic_2024

import java.util.jar.Attributes.Name


fun main (){
    val OverRide = OverRide()
    val subClass = SubClass()
    println("my name is " + OverRide.name + " " + subClass.name)
    println("my fun value is " + OverRide.Add(5,7) + " ," + subClass.Add(10,10))
}

open class OverRide {

  open  var name = "Sourav"

   open fun Add (a:Int, b:Int):Int{
        return  a+ b
    }
}


open class SubClass : OverRide() {

    override var name = "Chongrey"

    override  fun  Add(a: Int, b: Int):Int{
        val sum = super.Add(a, b)
        val sqr = sum * sum
        return  sqr

    }

}