package Programming.ConditionalStatementsAndLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class task1 {
    /**
     * Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
     */

    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(r);

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        if (a < b) {
            System.out.println("Минимальное значение - a");
        } else {
            System.out.println("Минимальное значение - b");
        }
    }
}
