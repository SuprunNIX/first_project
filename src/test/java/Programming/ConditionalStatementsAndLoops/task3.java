package Programming.ConditionalStatementsAndLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class task3 {
    /**
     * Ввести с клавиатуры три числа, и вывести их в порядке убывания.
     */

    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(r);

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if (a > b && a > c && b > c) {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        } else if (a > b && a > c && c > b) {
            System.out.println(a);
            System.out.println(c);
            System.out.println(b);
        } else if (b > a && b > c && a > c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if (b > a && b > c && c > a) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else if (c > a && c > b && a > b) {
            System.out.println(c);
            System.out.println(a);
            System.out.println(b);
        } else if (c > a && c > b && b > a) {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
    }
}
