package com.example.kotlin_basic_2024

class ConditionalOperator {

    companion object{

        @JvmStatic
        fun main(array: Array<String>){
            println("conditional operator")
//         1st type used it
            var num:Int = 110
            if (num>100){
                println("num is bigger then 100")


            }else{
                println("num is less 100")
            }

//            2nd type used
            var mesage:String = ""

            mesage = if (num>200) "num is less " else "num is big"

            print("my num is ${mesage}")

//       if-else-if used


            if(num > 50){
                println("number is bigger then 50")
            }else if (num < 50){
                println("number is less then 50")

            }else if(num == 50){
                println("number is equal to 50 ")

            }else if(num != 50) {
                println("number not equal 50")
            }



        }

    }
}