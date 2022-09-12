package Collections.HashSet;

import dorkbox.util.Sys;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashSet3 {
    /**
     * Есть класс Cat, с полем имя (name, String).
     * Создать коллекцию HashMap<String, Cat>.
     * Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
     * Вывести результат на экран, каждый элемент с новой строки.
     */

    public static void main(String[] args) {
        List<String> cats = new ArrayList<String>();
        cats.add("cat1");
        cats.add("cat2");
        cats.add("cat3");
        cats.add("cat4");
        cats.add("cat5");
        cats.add("cat6");
        cats.add("cat7");
        cats.add("cat8");
        cats.add("cat9");
        cats.add("cat10");

        Map<String, String> setCat = new HashMap<String, String>();
        setCat.put("первый", cats.get(0));
        setCat.put("второй", cats.get(1));
        setCat.put("третий", cats.get(2));
        setCat.put("четвертый", cats.get(3));
        setCat.put("пятый", cats.get(4));
        setCat.put("шестой", cats.get(5));
        setCat.put("седьмой", cats.get(6));
        setCat.put("восьмой", cats.get(7));
        setCat.put("девятый", cats.get(8));
        setCat.put("десятый", cats.get(9));

        for (Map.Entry<String, String> pair : setCat.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();

            System.out.println(key + "-" + value);
        }
    }
}

