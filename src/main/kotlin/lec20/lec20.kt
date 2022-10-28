package main.kotlin.lec20

import main.kotlin.lec09.Person

fun main() {


}

fun printPerson(person: Person?) {
//    if (person != null) {
//        println(person.name)
//        println(person.age)
//    }

    person?.let {
        println(it.name)
        println(it.age)
    }

    val numbers = listOf("one", "two", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let {
            firstItem -> if(firstItem.length >= 5) firstItem else "!$firstItem!"
        }.uppercase()
    println(modifiedFirstItem)

    //val person = Person("홍길동", 100).run(personRepository::save)
//    val person = Person("홍길동", 100).run {
//        hobby = "독서"
//        personRepository.save(this)
//    }

    mutableListOf("one", "two", "three")
        .also { println("The list elements before adding new one: $it") }
        .add("four")

    val numbers2 = mutableListOf("one", "two", "three")
    println("The list elements before adding new one: $numbers")
    numbers2.add("four")

}

//fun createPerson(
//    name: String,
//    age: Int,
//    hobby: String,
//): Person {
//    return Person(
//        name = name,
//        age = age,
//    ).apply {
//        this.hobby = hobby
//    }
//}