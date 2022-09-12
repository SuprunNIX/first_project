package Programming.ConditionalStatementsAndLoops;

public class task11 {
    /**
     * Вывести на экран квадрат из 10х10 букв S используя цикл while.
     * Буквы в каждой строке не разделять.
     */

    public static void main(String[] args) {
        int i = 0;
        while (i++ < 10)
        {
            int j = 0;
            while (j++ < 10)
                System.out.print("S");
            System.out.println();
        }
    }
}
