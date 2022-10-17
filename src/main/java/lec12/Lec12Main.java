package main.java.lec12;

import main.kotlin.lec12.Person;

public class Lec12Main {

    public static void main(String[] args) {
        //Person.Factory.newBaby("ABC"); // kt 의 companion object 접근 방법

        //@JvmStatic 이 선언되어 있는 경우
        Person.newBaby("ABC");


        moveSomthing(new Movable() {
            @Override
            public void move() {
                System.out.println("움직인다");
            }

            @Override
            public void fly() {
                System.out.println("난다");
            }
        });
    }
    private static void moveSomthing(Movable movable) {
        movable.move();
        movable.fly();
    }
}

