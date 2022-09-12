package Collections.HashSet;

import java.util.HashMap;
import java.util.Map;

public class HashSet4 {
    /**
     * Есть коллекция HashMap<String, String>, туда занесли 10 различных строк.
     * Вывести на экран список ключей, каждый элемент с новой строки.
     */

    public static void main(String[] args) {
        Map<String, String> set = new HashMap<String, String>();
        set.put("арбуз", "");
        set.put("банан", "");
        set.put("вишня", "");
        set.put("груша", "");
        set.put("дыня", "");
        set.put("ежевика", "");
        set.put("жень-шень", "");
        set.put("земляника", "");
        set.put("ирис", "");
        set.put("картофель", "");

        for (Map.Entry<String, String> pair : set.entrySet()) {
            String key = pair.getKey();
            System.out.println(key);
        }
    }
}
