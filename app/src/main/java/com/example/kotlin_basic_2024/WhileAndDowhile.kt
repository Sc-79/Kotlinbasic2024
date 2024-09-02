package com.example.kotlin_basic_2024

class WhileAndDowhile {

     companion object{
         @JvmStatic
         fun main (array: Array<String>){
             println("print my do while")

//                 ..........................
//           while loop simple example
             var n:Int = 0
             while (n<10){
                 println("print my number ut to 9 ${n}")
                 n++;
             }
//             .....................

//             do-while-loop
//             print at least one time when condition is false


             var num:Int = 12
             do{
                 println("print number ${num}")
                 num++

             }while(num<10)



         }
     }
}