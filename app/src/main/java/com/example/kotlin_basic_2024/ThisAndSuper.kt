package com.example.kotlin_basic_2024


fun main (){
var Audi = Audi()
    Audi.interior(1234)
}
open class Car {

}


class Audi : Car (){
    var chasisNo =10

    fun interior (chasisNo:Int){
//        ans 1234
        println("ChasisNo is " +chasisNo )

//        now using This ans:- 10
        println("ChasisNo is " + this.chasisNo)

    }

}