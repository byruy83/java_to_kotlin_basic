package main.java.lec06;

import java.util.Arrays;
import java.util.List;

public class Lec06Main {
    public static void main(String args[]) {

        //todo 1
        List<Long> numbers = Arrays.asList(1L, 2L, 3L);
        for (Long number : numbers) {
            System.out.println(number);
        }

        //todo 2
        for (int i = 1; i <=3; i++) {
            System.out.println(i);
        }

        //todo 3
        for (int i = 3; i >= 1; i--) {
            System.out.println(i);
        }

        //todo 4
        for (int i = 1; i <= 5; i+=2) {
            System.out.println(i);
        }
    }
}
