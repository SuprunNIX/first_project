package Programming.Arrays;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class task4_4 {
    //Массивы
    /**
     * task 4.
     */

    @Test
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(r);

        int[] list = new int[10];

        //ввод дынных в массив
        for (int i = 0; i < list.length; i++) {

            int s = Integer.parseInt(reader.readLine());

            list[i] = s;

        }

        for (int i = 0; i < list.length; i++) {
            int min = list[i];
            int min_i = i;


            //нахождение значений, расположенных не в своем порядке

            for (int j = i + 1; j < list.length; j++) {

                if (list[j] < min) {
                    min = list[j];
                    min_i = j;
                }
            }


            //расположение чисел в массиве в обратном порядке
            if (i != min_i) {
                int tmp = list[i];
                list[i] = list[min_i];
                list[min_i] = tmp;
            }
        }
        System.out.println(list[0]);
        System.out.println(list[1]);
        System.out.println(list[2]);
        System.out.println(list[3]);
        System.out.println(list[4]);
        System.out.println(list[5]);
        System.out.println(list[6]);
        System.out.println(list[7]);
        System.out.println(list[8]);
        System.out.println(list[9]);
    }
}
