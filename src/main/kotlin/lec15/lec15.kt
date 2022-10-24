package main.kotlin.lec15

fun main() {
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("${i} ${array[i]}")
    }

    println("=================")

    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }

    println("=================")

    array.plus(300) // ?? 되는거 맞나...?
    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }

    println("=================")

    val array2 = array.plus(300)
    for ((idx, value) in array2.withIndex()) {
        println("$idx $value")
    }

    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>() //emptyList는 타입이 무엇인지 미리 정해줘야 한다

    printNumbers(emptyList()); // 타입추론으로 인해 emptylist를 바로 넣어줄수 있음

    numbers.get(0)
    numbers[0]

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }

    val numbers2 = mutableListOf(100, 200)
    numbers2.add(300)

    //집합
    val numbers3 = setOf(100, 200)

    //가변집합
    val numbers4 = mutableSetOf(100, 200)

    //map
    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "MONDAY")
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }


}

private fun printNumbers(numbers: List<Int>) {

}