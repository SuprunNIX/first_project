package Programming.ConditionalStatementsAndLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class task6 {
    /**
     * Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно»
     */
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(r);

        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        if (age > 18) {
            System.out.println("И 18-ти достаточно");
        }
    }
}
