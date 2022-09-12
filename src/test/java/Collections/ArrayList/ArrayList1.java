package Collections.ArrayList;

import dorkbox.util.Sys;

import java.util.ArrayList;

public class ArrayList1 {
    /**
     * 1. Создай список строк.
     * 2. Добавь в него 5 различных строчек.
     * 3. Выведи его размер на экран.
     * 4. Используя цикл, выведи его содержимое на экран, каждое значение с новой строки
     */

    public static void main(String[] args) {
        ArrayList<String> set = new ArrayList<String>();
        set.add("str1");
        set.add("str2");
        set.add("str3");
        set.add("str4");
        set.add("str5");

        System.out.println(set.size());

        for (String pair : set) {
            System.out.println(pair);
        }
    }
}
