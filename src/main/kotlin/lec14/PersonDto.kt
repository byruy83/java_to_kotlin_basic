package main.kotlin.lec14

fun main() {
    var dto1 = PersonDto("홍길동", 100)
    val dto2 = PersonDto("홍길동2", 200)

    println(dto1 == dto2)

}

data class PersonDto(
    val name: String,
    val age: Int,
) {
    //data 클래스는 자동으로 equals, hashCode, toString을 만들어줌
}
