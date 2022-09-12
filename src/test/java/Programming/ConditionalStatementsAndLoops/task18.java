package Programming.ConditionalStatementsAndLoops;

public class task18 {
    /**
     * Написать программу, которая ведёт обратный отсчёт с 30 до 0, и в конце выводит на экран текст «Бум!». Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу задержку, воспользуйся функцией:
     *
     * Thread.sleep(100); //задержка на одну десятую секунды.
     */

    public static void main(String[] args) throws InterruptedException {
        int number = 30;
        for (int i = 30; i > 0; i--) {
            System.out.println(number);
            Thread.sleep(100);
            number = number - 1;
        } System.out.println("Бум!");
    }
}
