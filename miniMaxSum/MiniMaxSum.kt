package com.example.hellokotlin.Practice.veinte23.miniMaxSum

//ver video

//https://www.youtube.com/watch?v=HNvI9A79XbU

fun main() {
    miniMaxSum(arrayOf(1, 3, 5, 7, 9))
    miniMaxSum(arrayOf(1, 2, 3, 4, 5))
    miniMaxSum(arrayOf(7, 69, 2, 221, 8974))
    miniMaxSum(arrayOf(256741038, 623958417, 467905213, 714532089, 938071625))

}
/*
fun miniMaxSum(arr: Array<Int>) {
    var sum = 0L
    arr.forEach { sum += it }
    println("${sum - arr.max()} ${sum - arr.min()}")
}
*/
fun miniMaxSum(arr: Array<Int>) {
    var min = arr[0]
    var max = 0
    var sum = 0L
    arr.forEach {
        sum+=it
        if(it<min){ min= it}
        if(it>max){ max= it}
    }
    println("${sum-max} ${sum-min}")
}

//Time Complexity: O(1)