package com.example.kotlin_basic_2024

class myFun {

    companion object{

        @JvmStatic

        fun main(args: Array<String>){
            println(" The sum of Two numbers ${sum(4,6)}")
        }

        fun sum(a:Int, b:Int) :Any {

            return a + b
        }
    }


}