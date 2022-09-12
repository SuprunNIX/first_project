package Programming.ReferenceTypesAndStrings;

import org.junit.Test;

public class task3_1 {
    //Ссылочные типы. Строки
    /**
     * task 1.
     * Дана строка. Вывести первый, последний и средний (если он есть) символы. Напишите программу, которая выводит часть строки до первой встреченной точки, включая точку. Также предусмотрите вывод количества пробелов.
     */

    @Test
    public void test3_1() {
        String str = "test";

        //first element
        System.out.println("Первый елемент строки:" + str.substring(0, str.length()-3));

        //last element
        System.out.println("Последний елемент строки:" + str.substring(3));
    }
}
