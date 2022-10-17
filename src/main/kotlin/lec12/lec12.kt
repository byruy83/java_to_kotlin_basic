package main.kotlin.lec12

import main.java.lec12.Movable

fun main() {
    moveSomthing(object : Movable {
        override fun move() {
            println("move")
        }

        override fun fly() {
            println("fly")
        }
    })
}

private fun moveSomthing(movable: Movable) {
    movable.move()
    movable.fly()
}