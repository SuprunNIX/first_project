package exceptions.practice;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class exceptions {
    /**
     * Исключения практическое задание
     */

    public static void main(String[] args) throws IOException, InterruptedException {
        Reader r = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(r);
        try {
            int a = Integer.parseInt(reader.readLine());;
            int b = Integer.parseInt(reader.readLine());;
            Thread.sleep(3000);
            int zero = 5/0;
            if (a < b) {
                System.out.println("Минимальное значение - a");
            } else {
                System.out.println("Минимальное значение - b");
            }
        } catch (ArithmeticException e) {
            System.out.println("You shall not fall!");
        }
    }
}
