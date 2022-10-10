package main.java.lec08;

public class Lec08Main {
    public static void main(String args[]) {

    }

    //todo 1
    public int max(int a, int b) {
        if (a > b) {
            return a;
        }

        return b;
    }

    //todo 2
    public void repeat(String str, int num, boolean useNewLine) {
        for (int i = 1; i <= num; i++) {
            if (useNewLine) {
                System.out.println(str);
            } else {
                System.out.print(str);
            }
        }
    }

    public void repeat(String str, int num) {
        repeat(str, num, true);
    }

    public void repeat(String str) {
        repeat(str, 3, true);
    }

    //todo 3
    public static void printAll(String... strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }
}
