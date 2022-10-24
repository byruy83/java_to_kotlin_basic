package main.java.lec15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lec15Main {

    public static void main(String[] args) {
        int[] array = {100, 200};

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s %s", i, array[i]);
        }


        final List<Integer> numbers = Arrays.asList(100, 200);

        //하나 가져오기
        System.out.println(numbers.get(0));

        for (int number: numbers) {
            System.out.println(number);
        }

        for (int i=0; i<numbers.size(); i++) {
            System.out.printf("%s %s", i, numbers.get(i));
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "MONDAY");
        map.put(2, "TUESDAY");
    }
}
