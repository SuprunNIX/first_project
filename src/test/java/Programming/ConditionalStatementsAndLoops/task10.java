package Programming.ConditionalStatementsAndLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class task10 {
    /**
     * Ввести с клавиатуры строку и число N.
     */

    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(r);

        String str = reader.readLine();
        int n = Integer.parseInt(reader.readLine());

        int i = n;
        while (i >= 1) {

            System.out.println(str);

            i--;
        }
    }
}
