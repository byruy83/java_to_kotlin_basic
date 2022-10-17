package main.kotlin.lec09

import main.java.lec09.JavaPerson

//public class = 기본이 public 이여서 생략 가능
class Person (val name: String, var age: Int) { // construct(name: String, age: Int) construct 생략 가능
    //프로퍼티 선언과 생성자를 동시에 사용이 가능함

    //custom getter
//    val name: String = name
//        get() = field.uppercase() //field 자기 자신을 가리키는 의미(backing field)

    val uppercaseName: String
        get() = this.name.uppercase()

//    val name: String = name
//    var age: Int = age

    //getter, setter 가 자동으로 만들어주기 떄문에 없어도 됨

    //아래와 같이 사용해도 문제 없음
//    val name = name
//    var age = age

    //클래스가 초기화 되는 시점에 한번 호출
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다 ")
        }
        println("초기화 블록")
    }

    //추가 생성자
    //주 생성자를 호출함
    //body를 가질 수 있음
    constructor(name: String): this(name, 1) {
        println("첫 번째 부생성자")
    }

    constructor(): this("홍길동") {
        println("두 번째 부 생성자")
    }

//    fun isAdult(): Boolean {
//        return this.age >= 20
//    }

    //custom getter
    val isAdult: Boolean
        get() = this.age >= 20
}


fun main() {
    val person = Person("홍길동", 0)

    println(person.name)
    person.age = 10 //setter
    println(person.age)

    val javaPerson = JavaPerson("홍길동_java", 10)
    println(javaPerson.name)
    println(javaPerson.age)

    val person2 = Person("홍길동")

    val person3 = Person()
}