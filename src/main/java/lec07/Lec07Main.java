package main.java.lec07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

public class Lec07Main {
    public static void main(String args[]) throws IOException {
        JavaFilePrinter printer = new JavaFilePrinter();
        printer.readFile();
    }

    //todo 1
    private int parseIntOrThrow(@NotNull String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("주어진 %s는 숫자가 아닙니다", str));
        }
    }

    //todo 2
    private Integer parseIntOrThrowV2(String str) {
        try {
            return Integer.parseInt(str);
        } catch(NumberFormatException e) {
            return null;
        }
    }
}
