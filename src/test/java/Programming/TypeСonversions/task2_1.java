package Programming.TypeСonversions;

import org.junit.Test;

public class task2_1 {
    //Преобразование типов

    /**
     * task 1.
     * В переменных q и w хранятся два натуральных числа. Создайте программу, выводящую на экран результат деления q на w с остатком. Пример вывода программы (для случая, когда в q хранится 21, а в w хранится 8): 21 / 8 = 2 и 5 в остатке
     */

    @Test
    public void test2_1() {
        int q = 21;
        double w = 8;
        double c = q / w;

        System.out.println(q + "/" + w + "=" + c);
    }
}
