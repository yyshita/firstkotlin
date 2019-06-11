package com.example.first_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val s = "Kotlin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print("$s length is ${s.length}")

        val str = "64"
        val intVal: Int? = str.toIntOrNull()

        val num = 128
        val intStr: String = num.toString()

        val i:Int = 100
        val l:Long = i.toLong()

        val arrayOfInt: Array<Int> = arrayOf(1,2,3,5,8)
        for(i in arrayOfInt) println(i)

        var a = 10
        val b = 20
        val max = if(a > b){
            println("a is greater than b")
            Log.e("MainActivity", "a = $a")
            a // return
        }else{
            println("a is less than b")
            Log.e("MainActivity", "b = $b")
            b //return
        }

        Log.e("MainActivity","max = $max")

        a = 30

        val c : Float = when(a){
            in 1..10 -> {
                println("a is in the range")
                Log.e(TAG, "a is in the range, a == $a")
                (a/4).toFloat()
            }
            !in 10..20 ->{
                println("a is outside the range")
                Log.e(TAG, "a is outside the range, a == $a")
                (a/4).toFloat()
            }
            else -> {
                println("otherwise")
                Log.e(TAG, "otherwise a == $a")
                (a/4).toFloat()
            }
        }

        println("print c = $c")
        Log.e(TAG, " c = $c")

        val d:Any = "Kotlin"
        when(d) {
            is Int -> println("d*d = ${d*d}")
            is String -> println("d =${d.toUpperCase()}")
        }

        val e: Int? = null
        val text = "Kotlin"
        when{
            e != null && text.startsWith("Kot") ->
                println("starts with a prefix 'Kot'")
            e == null && text.endsWith("lin")->
                println("ends with suffix 'lin'")
            else -> println("otherwise")
        }

        val array = arrayOf(1, 2, 4, 10, 100, 1000)
        for(a in array) println("a == $a")

        for(i in 1..100) println("i == $i")

        for(j in 100 downTo 50)println("j == $j")

        for(i in 1..100 step 3) println("step i == $i")

        for(j in 100 downTo 50 step 6)println("step j == $j")

        var x = 0
        while(x < 10) {
            x++
            println("x == $x")
        }

        var y = 7
        do {
            println("y = " + y-- + ",")
        }while(y >4)

        val items : List<Int> = listOf(1, 3, 4)
        println(items)

        val orderList: List<String> = listOf("First", "Second", "Third")
        println("orderList.get(0) = ${orderList.get(0)}")
        println("orderList[1] = ${orderList[1]}")
        println("orderList.size = ${orderList.size}")

        //mutable list
        val numbers: MutableList<Int> = mutableListOf(2, 3, 4, 7)
        println("numbers = $numbers")
        numbers.add(4)
        println("numbers = $numbers")
        numbers.remove(4)
        println("numbers = $numbers")

        //Set
        var strings: Set<String> = setOf("A", "B", "C")
        println("strings = $strings")

        //mutable Set
        var mSet: MutableSet<String> = mutableSetOf("x", "y", "z")
        mSet.add("A")
        println("mSet = $mSet")
        mSet.remove("x")
        println("mSet = $mSet")
        mSet.add("y")
        println("mSet = $mSet")

        //Map
        val fruits: Map<String, Int> = mapOf("apple" to 1, "orange" to 2, "banana" to 3)
        println("fruits = $fruits")

        //mutable Map
        val vegetables: MutableMap<String, Int> = mutableMapOf("green pepper" to 1, "potato" to 2, "eggplant" to 3)
        println("vegetables.get('potato') = ${vegetables.get("potato")}")
        println(",")
        println("vegetables[\"eggplant\"] = ${vegetables["eggplant"]}")
        vegetables.put("carrot", 4)
        println("vegetables = $vegetables")
        vegetables.remove("potato")
        println("vegetables = $vegetables")

        //declare and call function
        fun times(a: Int, b: Int): Int{
            return a*b
        }
        println("times ${times(2, 5)}\n")
        Log.e(TAG, "times ${times(2, 5)}\n")

        //declare and call function with no return
        fun logTimes(a: Int, b: Int): Unit{
            Log.e(TAG, "log times ${a * b}")
        }
        logTimes(3,10)


        //omit function declaring and call
        fun omitTimes(a: Int, b: Int = 2) = a*b
        Log.e(TAG, "omitTimes = ${omitTimes(2)}")

        //omit function declaring and call with argument name
        fun calc(a: Int, b:Int=1, c:Int =1, d:Int=1) = a*b - c/d
        Log.e(TAG, "calc = ${calc(4, c= 3)}")


        //lambda
        var minus = {x: Int , y: Int -> x - y}
        Log.e(TAG, "minus = ${minus(3, 8)}")


        //lambda
        var lambda:(Int)->Int =  {it * 3}
        Log.e(TAG, "lambda = ${lambda(3)}")

        //do lambda
        fun doLambda(x: Int, l:(Int)->Int) = l(x)
        var inDoLambda:(Int)->Int = {it *10000}
        doLambda(5, inDoLambda)

        //first class
        val dog = Dog()
//        dog.set = "Pes"
//        Log.e(TAG, "dog name = ${dog.name}")
    }

    //first class
    inner class Dog{
        val name: String
            get() {return name}
//            set(name) {this.name = name}
    }


    interface Hound{
        fun hunt()
    }

    companion object {
        const val TAG: String = "MainActivity"
    }
}
