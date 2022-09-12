package Programming.ConditionalStatementsAndLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class task2 {

    /**
     * Ввести с клавиатуры четыре числа, и вывести максимальное из них.
     */

    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(r);

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        if (a > b && a > c && a > d) {
            System.out.println("Максимальное значение - a");
        } else if (b > a && b > c && b > d) {
            System.out.println("Максимальное значение - b");
        } else if (c > a && c > b && c > d) {
            System.out.println("Максимальное значение - c");
        } else if (d > a && d > b && d > c) {
            System.out.println("Максимальное значение - d");
        }
    }
}
