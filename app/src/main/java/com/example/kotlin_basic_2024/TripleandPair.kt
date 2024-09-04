package com.example.kotlin_basic_2024

class TripleandPair {
    companion object{
        @JvmStatic
        fun main (array: Array<String>){
            println("how to work triple and pair")

            var (a,b)= Pair("A", 1)
            println("$a, $b")

//            2nd example of pair

            var (x,y)=Pair("sourav", 32)
            println("$x,$y")
//      3rd example of pair

            var name = Pair("sourav",54);
            println("${name.first}, ${name.second} ")
//            nested pair

            var nested = Pair("Sourav" ,Pair("akash", Pair("nill", 1)))
            println(nested.second.first)
//            akash


        }
    }
}