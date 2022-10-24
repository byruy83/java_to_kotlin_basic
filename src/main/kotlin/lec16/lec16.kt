package main.kotlin.lec16

import main.java.lec16.Person

fun main() {

    val str = "ABC"
    println(str.lastChar()) //호출방법

    val person = Person("A", "B", 100)

    //시그니처가 똑같다면 멤버함수를 먼저 호출함
    person.nextYearAge()

    //해당 변수의 현재타입, 정적인 타입에 의해 어떤 확장함수가 호출될지 결정
    val train: Train = Train()
    train.isExpensive()

    val srt1: Train = Srt()
    srt1.isExpensive()

    val srt2: Srt = Srt()
    srt2.isExpensive()

    3.add(2)
}

//확장함수

/**
 * 확장함수
 *  private, protected는 불가
 */
fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun Person.nextYearAge(): Int {
    println("확장 함수")
    return this.age + 1
}

infix fun Int.add(other: Int): Int {
    return this + other
}