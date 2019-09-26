package com.kotlin.learn.string

class StringDemo {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val str = "hello word"
            println("----访问字符串的字符序列成员----")
            // 访问字符串第一个位置的元素，返回h
            println(str[0])
            // 访问字符的第一个元素，返回h
            println(str.first())
            // 访问字符的最后一个元素，返回d
            println(str.last())
            println("----字符串的相关API----")
            // 判断字符串是否为空或者null，返回true
            println("".isEmpty())
            // 判断字符串是否为空或者null，返回false
            println(" ".isEmpty())
            // 判断字符串是否空或者空字符串，返回true
            println(" ".isBlank())

            var a = "hello"
            var b = "hello"
            var c = "kotlin"
            var d = "kot"
            var e = "lin"
            var f = d + e
            // 返回true
            println(a==b)
            // 返回true
            println(a===b)
            // 返回true
            println(c==f)
            // 返回false
            println(c===f)
        }


    }


}