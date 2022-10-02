package main.kotlin.lec04

import main.java.lec04.JavaMoney

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) { // > 연산자가 compareTo
        println("Money1이 Money2보다 금액이 큽니다")
    }

    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    //주소가 같은가?
    println(money3 === money4)

    //값이 같은가?
    println(money3 == money4)

    /**
     * Lazy 연산
     */
    if (fun1() || fun2()) {
        println("본문") // 출력 순서 :  본문 -> fun 1 -> fun 2
    }

    if (fun2() && fun1()) {
        println("본문 ") // 출력 없음
    }

    /**
     * 연산자 오버로딩
     */
    val money6 = Money(1_000L)
    val money7 = Money(2_000L)
    println(money6 + money7)

}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}