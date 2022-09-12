package Programming.ConditionalStatementsAndLoops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class task4 {
    /**
     * Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
     */

    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(r);

        String name1 = reader.readLine();
        String name2 = reader.readLine();

        int name1Length = name1.length();
        int name2Length = name2.length();

        if (name1.length() == name2.length()) {
            System.out.println("Именна идентичны.");
        } else {
            System.out.println("Длинна имени " + name1 + " равна " + name1Length + "");
            System.out.println("Длинна имени " + name2 + " равна " + name2Length + "");
        }
    }
}
