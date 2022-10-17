package main.kotlin.lec12

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

class Person private constructor(
    var name: String,
    var age: Int,
) {

    //java static - 클래스와 동행하는 유일한 오브젝트
//    companion object Factory : Log {
//        private const val MIN_AGE = 1 //const 상수, 기본 타입과 String에만 붙일수 잇음
//        fun newBaby(name: String): Person {
//            return Person(name, MIN_AGE)
//        }
//
//        override fun log() {
//            println("나는 Person 클래스의 동행객체 Factory에요")
//        }
//    }

    companion object {
        private const val MIN_AGE = 1 //const 상수, 기본 타입과 String에만 붙일수 잇음

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }
}

//싱글톤 생성방식
object Singleton {
    var a: Int = 0
}