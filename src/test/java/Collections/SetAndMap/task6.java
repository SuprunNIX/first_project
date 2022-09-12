package Collections.SetAndMap;

import dorkbox.util.Sys;

import java.util.HashMap;

public class task6 {
    /**
     * 1. Создать словарь Map (<String, String>) и добавить туда 10 человек в виде «Фамилия»-«Имя».
     * 2. Пусть среди этих 10 человек есть люди с одинаковыми именами.
     * 3. Пусть среди этих 10 человек есть люди с одинаковыми фамилиями. Обратить внимание на количество записей в получившейся коллекции.
     * 4. Вывести содержимое Map на экран.
     */

    public static void main(String[]args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Андрей");
        map.put("Коваленко", "Виталий");
        map.put("Понедельник", "Иван");
        map.put("Иванов", "Алексей");
        map.put("Среда", "Иван");
        map.put("Четверг", "Иван");
        map.put("Понедельник", "Андрей");
        map.put("Пятница", "Алексей");
        map.put("Воскресенье", "Иван");

        System.out.println(map);
    }
}
