package Programming.ConditionalStatementsAndLoops;

import dorkbox.util.Sys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class task5 {
    /**
     * Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись «Подрасти еще»
     */

    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(r);

        String name = reader.readLine();
        int age = Integer.parseInt(reader.readLine());

        if (age < 18) {
            System.out.println("Подрасти еще");
        }
    }
}
