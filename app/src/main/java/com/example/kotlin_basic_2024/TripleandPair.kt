package com.example.kotlin_basic_2024

class TripleandPair {
    companion object{
        @JvmStatic
        fun main (array: Array<String>){
            println("how to work triple and pair")

            var (a,b)= Pair("A", 1)
            println("$a, $b")

        }
    }
}