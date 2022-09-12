package Programming.ConditionalStatementsAndLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class task17 {
    /**
     * Ввести с клавиатуры имя и, используя цикл for 10 раз, вывести: [*имя* любит меня.]
     */

    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(r);

        String name = reader.readLine();
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " любит меня.");
        }
    }
}
