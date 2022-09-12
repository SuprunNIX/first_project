package Programming.TypeСonversions;

import org.junit.Test;

public class task2_2 {
    //Преобразование типов
    /**
     *  task 2.
     *  В переменной n хранится натуральное двузначное число. Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n.
     */

    @Test
    public void test2_2() {
        int n = 24;

        String number = Integer.toString(n);

        int first = Integer.parseInt(number.substring(0, number.length()-1));
        int second = Integer.parseInt(number.substring(1));

        int a = Integer.parseInt(String.valueOf(first + second));

        System.out.println("Сумма числа n" + " = " + a);
    }
}
