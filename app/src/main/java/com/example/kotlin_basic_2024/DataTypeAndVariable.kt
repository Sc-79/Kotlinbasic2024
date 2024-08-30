package com.example.kotlin_basic_2024

class DataTypeAndVariable {

    var a:Int = 8
    companion object{
        @JvmStatic
//        int
//        string
//        Boolean
//        Float
//        Double
//        Long
//                Char
//        Byte
//        short

        //


        fun main(args: Array<String>) {
//            integer
            val a:Int = 7
            println("my Integer Variable is +  $a " )


//            String
            val myString :String = "my name is sourav chongrey"
            println("hi mr:sourav chongrey $myString")


//            Boolean
            val myBoolean: Boolean = true
            println("are you serious  $myBoolean ")


//           Float (32-bit floating point number
            val myFloat: Float = 10.5f
            println("my floating number is $myFloat")


//            Double (64-bit floating point number)

             val myDouble :Double = 20.5
            println("my double number is $myDouble")

//            long (64-bite signed integer ) ek quintillion
            val myLong : Long = 1000000000000000000L
            println("my Long number  $myLong ")


//           Byte ( 8 - Bit signed integer)
             val myByte : Byte = 1
            println("my Byte number is $myByte")

//            short ( 16 - bit signed integer)
            val myShort : Short = 1000

            println(" my short number is  $myShort")
//
            val myMap: Map<String, Int> = mapOf("A" to 1, "B" to 2)
            println("My Map values are $myMap")












        }
    }
}

