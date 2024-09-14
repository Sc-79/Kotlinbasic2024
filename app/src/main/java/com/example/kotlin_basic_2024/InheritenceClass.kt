package com.example.kotlin_basic_2024



fun  main (){
val MyClass = MyClass()
println("This is my name " +MyClass.Add(5,6))
println("This is my func " + MyClass.name)

}

open class InheritenceClass {

    var name = "sourav"

    fun Add (a:Int, b:Int) :Int {
        return a + b
    }

}

class MyClass : InheritenceClass() {

}

