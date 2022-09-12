package Collections.HashSet;

import java.util.HashMap;
import java.util.Map;

public class HashSet2 {
    /**
     * Создать коллекцию HashMap<String, String>, занести туда 10 пар строк: арбуз – ягода, банан – трава, вишня – ягода, груша – фрукт, дыня – овощ, ежевика – куст, жень-шень – корень, земляника – ягода, ирис – цветок, картофель – клубень.
     * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
     *
     * Пример вывода (тут показана только одна строка):
     * картофель – клубень
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
