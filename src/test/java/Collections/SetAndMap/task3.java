package Collections.SetAndMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class task3 {
    /**
     * Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя». Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
     */

    public task3() {
    }
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Петров", "Андрей");
        map.put("Коваленко", "Виталий");
        map.put("Понедельник", "Иван");
        map.put("Вторник", "Алексей");
        map.put("Среда", "Иван");
        map.put("Четверг", "Иван");
        map.put("Пятница", "Андрей");
        map.put("Суббота", "Алексей");
        map.put("Воскресенье", "Иван");
        return map;
    }

    public static String getNameForSearchDuplicate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input name fo search: ");
        String name = in.nextLine();
        return name;
    }

    public static String getSurnameForSearchDuplicate() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input surname fo search: ");
        String surname = in.nextLine();
        return surname;
    }

    public static void getCountDuplicates(String name, String surname, Map<String, String> map) {
        int count = 0;
        Iterator var4 = map.entrySet().iterator();

        while(var4.hasNext()) {
            Map.Entry<String, String> s = (Map.Entry)var4.next();
            if ((s.getValue()).equals(name) && (s.getKey()).equals(surname)) {
                ++count;
            }
        }

        System.out.println("Found " + count + " person(s) with the same first and last name");
    }

    public static void main(String[] args) {
        getCountDuplicates(getNameForSearchDuplicate(), getSurnameForSearchDuplicate(), createMap());
    }
}
