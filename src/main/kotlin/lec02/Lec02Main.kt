package main.kotlin.lec02

import main.java.lec02.Person

fun main() {

    //safe fall
    val str: String? = "ABC"
    //str.length //불가능
    str?.length //가능

    //elvis 연산자
    val str2: String? = "ABC"
    println(str2?.length ?: 0)

    val person = Person("홍길동")
    //startsWithAA(person.name) //@Nullable 어노테이션 떄문에 사용 하지 못함
}

fun startsWithAA(str: String): Boolean {
    return str.startsWith("A")
}

/**
 * input : null/string
 * output : true/false
 */
fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어옴")

//    if (str == null) {
//        throw IllegalArgumentException("null이 들어옴")
//    }
//    return str.startsWith("A")
}

/**
 * input : null/string
 * output : null/true/false
 */
fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
//    if (str == null) {
//        return null
//    }
//    return str.startsWith("A")
}

/**
 * input : null/string
 * output : ture/false
 */
fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
//    if (str == null) {
//        return false
//    }
//
//    return str.startsWith("A")
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A") //null이 아님을 표현
}