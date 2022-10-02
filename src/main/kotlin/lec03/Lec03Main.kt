package main.kotlin.lec03

import main.java.lec03.Person

fun main() {
    //자동으로 값을 보고 타입 추론
    val number1 = 3 //int
    var number2 = 10L //long

    //number2 = number1 //타입에 따른 에러 발생
    number2 = number1.toLong() //같은 타입으로 변환 후 가능

    val number3: Int? = 3
    val number4: Long = number3?.toLong() ?: 0L

    printAgeIgPerson2(null)
    printAgeIgPerson2(Person("홍길동", 100))

    /**
     * Strong interpolation / String indexing
     */
    val person = Person("홍길동", 100)
    System.out.println(String.format("이름 : %s", person.name))
    println("이름 : ${person.name}")

    val str = """
        ABCD
        EFGH
        ${person.name}
    """.trimIndent()
    println(str)

    val str2 = "ABCD"
    println(str2[0])
}

fun printAgeIgPerson(obj: Any) {
    if (obj is Person) { // is == instanceof
        val person = obj as Person // obj 변수를 Person 타입으로 지정
        println(person.age)

        println(obj.age) // 바로 사용도 가능함(스마트캐스트)
    }

    //instanceof 의 반대
    if (obj !is Person) {
        //println(obj.age)
    }
}

//null이 들어오는 obj
fun printAgeIgPerson2(obj: Any?) {
    val person = obj as? Person
    println(person?.age)
}