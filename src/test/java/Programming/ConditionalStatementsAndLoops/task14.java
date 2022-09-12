package Programming.ConditionalStatementsAndLoops;

import dorkbox.util.Sys;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class task14 {
    /**
     * Ввести с клавиатуры два числа m и n.
     *
     * Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
     */

    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(r);

        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        for (int j = 0; j < m; j++)
        {
            for (int i = 0; i < n; i++)
            {
                System.out.print("8");
            }
            System.out.println("");
        }
    }
}
