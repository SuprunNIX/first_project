package Programming.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class task4_5 {
    //Массивы
    /**
     * task 5.
     */


    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);

        BufferedReader reader = new BufferedReader(r);

        //большой массив на 20 чисел
        int[] list1 = new int[20];

        for (int i = 0; i < list1.length; i++) {
            int s = Integer.parseInt(reader.readLine());

            list1[i] = s;
        }
        //2 маленьких массива на 10 чисел каждый
        int[] list2 = new int[10];
        int[] list3 = new int[10];

        //заполнение второго массива
        String sub1 = list1.toString().substring(0, (list1.toString().length()-5));
        for (int i=0; i < sub1.length(); i++) {
            int j = Integer.parseInt(sub1);

            list2[i] = j;
        }

        //заполнение третьего массива
        String sub2 = list1.toString().substring(5);
        for (int i=0; i < sub2.length(); i++) {
            int j = Integer.parseInt(sub2);

            list3[i] = j;
        }

        System.out.println(list3[0]);
        System.out.println(list3[1]);
        System.out.println(list3[2]);
        System.out.println(list3[3]);
        System.out.println(list3[4]);
    }
}
