package main.kotlin.lec13

fun main() {

}

class House(
    private val address: String,
    private val livingRoom: LivingRoom,
) {
    inner class LivingRoom( //바깥 클래스를 참조하고자 할때 inner를 추가
        private val area: Double
    ) {
        val address: String
            get() = this@House.address //바깥 클래스를 참조하고자 할때(권장하지않음)
    }
}