package Collections.HashSet;

import dorkbox.util.Sys;

import java.util.HashMap;
import java.util.Map;

public class HashSet6 {
    /**
     * Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
     * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
     */
    public static void main(String[] args) {
        Map<String, String> set = new HashMap<String, String>();
        set.put("арбуз", "ягода");
        set.put("банан", "трава");
        set.put("вишня", "ягода");
        set.put("груша", "фрукт");
        set.put("дыня", "овощ");
        set.put("ежевика", "куст");
        set.put("жень-шень", "корень");
        set.put("земляника", "ягода");
        set.put("ирис", "цветок");
        set.put("картофель", "клубень");

        for (Map.Entry<String, String> pair : set.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();

            System.out.println(key + "-" + value);
        }
    }
}
