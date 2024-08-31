package com.example.kotlin_basic_2024

class WhenCondition {
    companion object{
        @JvmStatic
        fun main (array: Array<String>) {
            var num: Int = 1;
//            var num = 40;
//check only number
            when (num) {

                1 -> {
                    println("This is 1 ")
                }

                40 -> {
                    println("This is 40")
                }
            }


            var num1: Int = 290;

//        check number using condition
            when {
                num1 < 10 -> {
                    println("This number Less then 10")
                }
                num1 < 20 && num1 >10 ->{
                    println("This number will be 10 to 20")
                }
                num1 <30 && num1 > 20 ->{
                    println("This number will be below 30 getter 20")
                }

//                not found

                else ->{
                    println(" number not found")
                }
            }
        }
    }
}