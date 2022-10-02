package main.kotlin.lec01

import main.java.lec01.Person

fun main() {
    var number1 = 10L
    number1 = 5L

    val number2 = 10L
    // val 은 불변 하위는 에러
    // number2 = 5L

    println(number1)

    //변수 선언 키워드
    var number3: Long = 10L

    val number4: Long
    //println(number4) //초기화 되지 않은 변수 사용시 에러

    val number6: Long
    number6 = 10L // 불면의 변수지만 최초 1번은 선언 가능
    println(number6)

    //kotlin primitive type
    var number7 = 10L
    var number8 = 1_000L

    //nullable
    var number9 = 1_000L
    //number9 = null // 기본적으로 null은 불가

    var number10: Long? = 1_000L
    number10 = null //null 가능

    //코틀린에서는 new 를 사용 하지 않음
    var person = Person("홍길동")

}