package com.example.kotlin_basic_2024

class ForandForEachLoop {

    companion object{
        @JvmStatic

        fun main(array: Array<String>){
            println("this is my for and forEach loop")

            var num:Int = 0;
//increment value
            for (i in 0..10){
                println("This loop increment variable value + ${num++}")
            }

//           ................. 0 to 9 value print using until......................
             var num1:Int = 0

            for (i in 0 until 10){
                println("This loop increment value of num variable print up to 0 to 9 when no of loop will be 10 ${num1++}")
            }
//           ................. reverse loop.................

            for(i in 10 downTo 0){
                println("This loop increment value reverse order ")
            }
           var a:Int = 0
//            increment loop not number  in 2 step
            for(i in 10 downTo 0 step 2){
                println("adding 2 each number + ${a++}")
            }
        }
    }


}