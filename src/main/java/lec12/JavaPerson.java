package main.java.lec12;

public class JavaPerson {

    private static final int MiN_AGE = 1;

    public static JavaPerson newBaby(String name) {
        return new JavaPerson(name, MiN_AGE);
    }

    private String name;

    private int age;

    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
