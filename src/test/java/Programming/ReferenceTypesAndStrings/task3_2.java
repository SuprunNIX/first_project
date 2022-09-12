package Programming.ReferenceTypesAndStrings;

import org.junit.Test;

public class task3_2 {
    //Ссылочные типы. Строки
    /**
     * task 2.
     * Найти в строке указанную подстроку и заменить ее на новую. Строку, ее подстроку для замены и новую подстроку вводит пользователь.
     */

    @Test
    public void test3_2() {
        String str = "Мама мыла посуду";
        String[] subStr = str.split(" ");

        //change substring to new value
        String substring = subStr[1].replace("мыла", "помыла");

        //new string
        String newString = str.replace("мыла", substring);

        System.out.println("Новая подстрока:" + substring);
        System.out.println("Новая строка:" + newString);
    }
}
