package Programming.ConditionalStatementsAndLoops;

public class task12 {
    /**
     * Вывести на экран таблицу умножения 10х10 используя цикл while.
     *
     * Числа разделить пробелом
     */
    public static void main(String[] args) throws Exception {
        int i = 1;
        int n = 1;
        while(i <= 10)
        {
            System.out.print(i + " ");
            while(n <= 9)
            {
                n++;
                System.out.print(i * n + " ");
            }
            i++;
            n = 1;
            System.out.println("");
        }
    }
}
