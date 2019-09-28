package com.kotlin.learn.arr

class ArrDemo {

    companion object {

        /**
         * 主入口函数
         * @JvmStatic
         */
        @JvmStatic
        fun main(args: Array<String>) {
            var arrDemo = ArrDemo()
            var array = arrDemo.createArray()
            array[3][2].value = 8
            array[2][2].value = 4
            arrDemo.dumpArray(array, "初始化以后数组情况")
            arrDemo.rotateArray(array, "top")
            arrDemo.dumpArray(array, "旋转以后数组情况")
            arrDemo.rotateArray(array, "bottom")
            arrDemo.dumpArray(array, "旋转回来数组情况")
            arrDemo.rotateArray(array, "left")
            arrDemo.dumpArray(array, "对调以后数组情况")

        }
    }

    /**
     * 功能描述： 构建二维数组
     */
    fun createArray() = Array(4) { y -> Array(4) { x -> Blob(x, y, 0) } }

    /**
     * 功能描述： 实现数组方向的旋转
     * @param array 待旋转的数组
     * @param direction 当前移动的方向
     */
    fun rotateArray(array: Array<Array<Blob>>, direction: String) {
        when (direction) {
            "left" ->{
                covery(array, { x: Int, y: Int, size: Int -> size - 1 - x }, { x: Int, y: Int, size: Int -> y });
            }
            "top" -> {
                covery(array, { x: Int, y: Int, size: Int -> size - 1 - y }, { x: Int, y: Int, size: Int -> x })
            }
            "bottom" -> {
                covery(array, { x: Int, y: Int, size: Int -> y }, { x: Int, y: Int, size: Int -> size - 1 - x })
            }
        }
    }

    /**
     * 功能描述： 实现数组的旋转
     * @param array 待旋转的数组
     * @param coverX 实现x轴上的方法
     * @param coverY 实现y轴上的方法
     */
    fun covery(
        array: Array<Array<Blob>>,
        coverX: (x: Int, y: Int, size: Int) -> Int,
        coverY: (x: Int, y: Int, size: Int) -> Int
    ) {
        var changeArray = Array(4) { y -> Array(4) { 0 } }
        var size = array.size
        for (y in 0 until size) {
            for (x in 0 until size) {
                if (changeArray[y][x] == 1) {
                    continue
                }
                var temp = array[y][x]
                array[y][x] = array[coverY(x, y, size)][coverX(x, y, size)]
                array[coverY(x, y, size)][coverX(x, y, size)] = temp
                changeArray[coverY(x, y, size)][coverX(x, y, size)] = 1

            }
        }
    }

    /**
     * 功能描述： 实现显示的加载数组数据
     */
    fun dumpArray(array: Array<Array<Blob>>, msg: String) {
        println("============$msg============")
        for (y in 0 until array.size) {
            for (x in 0 until array.size) {
                print("${array[y][x].value}(${array[y][x].pX},${array[y][x].pY}) ")
            }
            println()
        }
    }

    class Blob(
        var x: Int,
        var y: Int,
        var value: Int,
        var pX: Int = x,
        var pY: Int = y
    )

}