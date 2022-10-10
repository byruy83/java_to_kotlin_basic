package main.kotlin.lec06

fun main () {
    //todo 1 convert
    val numbers = listOf(1L, 2L, 3L)
    for (number in numbers) {
        println(number)
    }

    //todo 2 convert
    for (i in 1..3) { // .. 범위 연산자
        println(i)
    }

    /**
     * downTo, step 도 함수(중위함수)
     */

    //todo 3 convert
    for (i in 3 downTo 1) { // 3 downTo 1 : 시작값:3, 끝값:1, 공차가 -1 인 등차수열
        println(i)
    }

    //todo 4 convert
    for (i in 1..5 step 2) { // 1..5 step 2 : 시작값:1, 끝값:5, 공차가 2인 등차수열
        println(i)
    }
}