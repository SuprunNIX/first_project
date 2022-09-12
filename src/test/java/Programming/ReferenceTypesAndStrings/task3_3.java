package Programming.ReferenceTypesAndStrings;

import org.junit.Test;

public class task3_3 {
    //Ссылочные типы. Строки
    /**
     * task 3.
     *     Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.
     */

    @Test
    public void test3_3() {
        String str = "Самое длинное слово будет найденным";
        String[] substring = str.split(" ");

        System.out.println("Самое длинное:" + substring[4]);
    }
}
