package com.kotlin.learn.infix

/**
 * 中缀表达式
 */
class InfixDemo {

    companion object {

        /**
         * 主入口函数
         * @JvmStatic
         */
        @JvmStatic
        fun main(args: Array<String>) {
            val infixDemo = InfixDemo()
            infixDemo.test("我是一个主入口函数")
        }

    }

    /**
     * 外部调用的方法
     */
    fun test(t:String){
        println(t)
    }


}