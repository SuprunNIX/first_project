package Programming.ConditionalStatementsAndLoops;

import dorkbox.util.Sys;

public class task15 {
    /**
     * Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
     */

    public static void main(String[] args) {
        String str = "8";
        for (int i = 0; i < 10; i++) {
            System.out.println(str);
            str = str + 8;
        }
    }
}
