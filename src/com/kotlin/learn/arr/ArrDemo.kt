package com.kotlin.learn.arr

class ArrDemo {

    companion object {

        /**
         * 主入口函数
         * @JvmStatic
         */
        @JvmStatic
        fun main(args: Array<String>) {
            var array = Array(4, { y -> Array(4, { x -> Blob(x, y,0) }) })
            array[3][2].value = 8
            array[2][2].value = 4
            for (y in 0 until array.size) {
                for (x in 0 until array.size) {
                    print("${array[x][y].value}($x,$y) ")
                }
                println()
            }
        }
    }

    class Blob(var x: Int, var y: Int,var value: Int);

}