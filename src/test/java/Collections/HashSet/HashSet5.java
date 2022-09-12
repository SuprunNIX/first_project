package Collections.HashSet;

import java.util.HashMap;
import java.util.Map;

public class HashSet5 {
    /**
     * Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
     * Вывести на экран список значений, каждый элемент с новой строки.
     */

    public static void main(String[] args) {
        Map<String, String> set = new HashMap<String, String>();
        set.put("", "ягода");
        set.put("", "трава");
        set.put("", "ягода");
        set.put("", "фрукт");
        set.put("", "овощ");
        set.put("", "куст");
        set.put("", "корень");
        set.put("", "ягода");
        set.put("", "цветок");
        set.put("", "клубень");

        for (Map.Entry<String, String> pair : set.entrySet()) {
            String value = pair.getValue();
            System.out.println(value);
        }
    }
}
