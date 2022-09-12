package Programming.ConditionalStatementsAndLoops;

import dorkbox.util.Sys;

public class task16 {
    /**
     * Используя цикл for вывести на экран:
     * - горизонтальную линию из 10 восьмёрок
     * - вертикальную линию из 10 восьмёрок.
     */

    public static void main(String[] args) {
        String str = "8";
        for (int i = 0; i < 10; i++) {
            System.out.print(str);
        }
        System.out.print("" + "\n");
        for (int j = 0; j < 10; j++) {
            System.out.println(str);
        }
    }
}
