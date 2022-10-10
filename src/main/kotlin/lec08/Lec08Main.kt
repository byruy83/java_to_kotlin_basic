package main.kotlin.lec08

import com.sun.org.apache.xpath.internal.operations.Bool

fun main() {
    repeat("hello world")
    repeat("hello world", 3, true)

    /**
     * named argument
     * 매개변수 이름을 통해 직접 값을 지정
     * 지정되지 않은 매개변수는 기본값 사용
     */
    repeat(str = "hello world", useNewLine = false)

    printNameAndGender(gender = "FEMALE", name = "홍길동")

    printAll("A", "B", "C")

    val array = arrayOf("A", "B", "C")
    printAll(*array) //spread 연산자가 필요함
}

//todo 1 convert
fun max(a: Int, b: Int): Int {
//    if (a > b) {
//        return a
//    }
//    return b

    return if (a > b) {
        a
    } else {
        b
    }
}

//expression으로 간주하기 때문에 이렇게 표현도 가능
fun maxV2(a: Int, b: Int): Int =
    if (a > b) {
        a
    } else {
        b
    }

//타입추론으로 인해 return type 생략 가능
fun maxV3(a: Int, b: Int) = if (a > b) a else b

//todo 2 convert
//default parameter 사용 가능
fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true,
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

//todo 3 convert
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}