package Collections.SetAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class task2 {
    /**
     * Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
     * Удалить из множества все числа больше 10.
     */

    public static void main(String[] args) throws IOException {
        Set<Integer> set = new HashSet();
        Scanner in = new Scanner(System.in);

        Integer value;
        for(int i = 0; i < 20; ++i) {
            value = in.nextInt();
            set.add(value);
            if (value > 10) {
                set.remove(value);
            }
        }
    }
}
