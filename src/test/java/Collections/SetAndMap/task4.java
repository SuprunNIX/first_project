package Collections.SetAndMap;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class task4 {
    /**
     * Создать словарь (Map<String, LocalDate>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
     * Удалить из словаря всех людей, родившихся летом.
     */

    public static void main(String[] args) {
        HashMap<String, LocalDate> map = new HashMap<>();
        map.put("Иванов", LocalDate.of(2000, 1, 1));
        map.put("Петров", LocalDate.of(2000, 2, 2));
        map.put("Коваленко", LocalDate.of(2000, 3, 3));
        map.put("Понедельник", LocalDate.of(2000, 4, 4));
        map.put("Вторник", LocalDate.of(2000, 5, 5));
        map.put("Среда", LocalDate.of(2000, 6, 6));
        map.put("Четверг", LocalDate.of(2000, 7, 7));
        map.put("Пятница", LocalDate.of(2000, 8,8));
        map.put("Суббота", LocalDate.of(2000, 9,9));
        map.put("Воскресенье", LocalDate.of(2000, 10, 10));

        System.out.println(map);

        HashMap<String, LocalDate> remove = new HashMap(map);
        Iterator var2 = remove.entrySet().iterator();

        while(var2.hasNext()) {
            Map.Entry<String, LocalDate> pair = (Map.Entry) var2.next();
            if ((pair.getValue()).getMonthValue() > 05 && (pair.getValue()).getMonthValue() < 9) {
                map.remove(pair.getKey());
            }
        }
        //optional
        System.out.println("List after removing:" + map);
    }
}
