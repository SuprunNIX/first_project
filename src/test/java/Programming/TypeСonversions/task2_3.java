package Programming.TypeСonversions;

import org.junit.Test;

public class task2_3 {
    //Преобразование типов
    /**
     * task 3.
     * В переменной n хранится вещественное число с ненулевой дробной частью. Создайте программу, округляющую число n до ближайшего целого и выводящую результат на экран.
     */


    public static void main(String[] args) {
        float n = 8.9f;
        float y = Math.round(n);
        System.out.println("Result=" + y);
    }
}
