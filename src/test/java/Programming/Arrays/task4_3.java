package Programming.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class task4_3 {
    //Массивы
    /**
     * test 3.
     */

    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(r);

        String[] strList = new String[10];
        int[] intList = new int[10];

        //ввод дынных в массив строк
        for (int i = 0; i < strList.length; i++)

        {

            String s = reader.readLine();

            strList[i] = s;

        }

        //ввод данных в интовый массив числами от 0 до 9
        for (int j = 0; j < intList.length; j++)

        {

            intList[j] = j;

        }

        //вывод массива

        for (int i = 0; i < intList.length; i++)

        {

            int j = intList.length - i - 1;

            System.out.println( intList[j] );

        }
    }
}
