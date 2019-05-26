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
        


    }

    companion object {
        const val TAG: String = "MainActivity"
    }
}
