package com.kotlin.learn.cl

class BirdDemo {

    companion object {

        /**
         * 主入口函数
         * @JvmStatic
         */
        @JvmStatic
        fun main(args: Array<String>) {
            val birdImpl = BirdImpl()
            birdImpl.fly()
        }

    }


}