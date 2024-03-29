package com.kotlin.learn.main


/**
 * 主入口的demo例子
 */
class MainDemo {

    companion object {

        /**
         * 主入口函数
         * @JvmStatic 只有加了这个注解我们才可以实现类似Java的静态方法的效果
         */
        @JvmStatic
        fun main(args: Array<String>) {
            println("主入口方法")
        }

    }

}