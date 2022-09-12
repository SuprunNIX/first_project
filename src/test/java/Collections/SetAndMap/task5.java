package Collections.SetAndMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class task5 {
    /**
     * Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя». Удалить людей, имеющих одинаковые имена.
     */

    public static Map<String, String> createArray() {
        HashMap<String, String> map = new HashMap<>();
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

    public static void removeDuplicateNames(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap(map);
        Iterator var2 = copy.entrySet().iterator();

        while(var2.hasNext()) {
            Map.Entry<String, String> s = (Map.Entry)var2.next();
            Iterator var4 = copy.entrySet().iterator();

            while(var4.hasNext()) {
                Map.Entry<String, String> s2 = (Map.Entry)var4.next();
                if ((s.getValue()).equals(s2.getValue()) && !(s.getKey()).equals(s2.getKey())) {
                    removeDuplicateSurnames(map, s.getValue());
                }
            }
        }
    }

    public static void removeDuplicateSurnames(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap(map);
        Iterator var3 = copy.entrySet().iterator();

        while(var3.hasNext()) {
            Map.Entry<String, String> pair = (Map.Entry)var3.next();
            if ((pair.getValue()).equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = (HashMap<String, String>) createArray();
        System.out.println("List before removing: " + map);
        removeDuplicateNames(map);
        System.out.println("List after removing: " + map);
    }
}
