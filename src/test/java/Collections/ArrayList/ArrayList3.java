package Collections.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList3 {
    /**
     * Создай список строк.
     * 2. Считай с клавиатуры 5 строк и добавь в список.
     * 3. Используя цикл, найди самую короткую строку в списке.
     * 4. Выведи найденную строку на экран.
     * 5. Если таких строк несколько, выведи каждую с новой строки
     */

    public static void main(String[] args) throws IOException {
        ArrayList<String> set = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int minSize;
        for(minSize = 0; minSize < 5; minSize++) {
            set.add(reader.readLine());
        }

        minSize = 0;

        int i;
        for(i = 1; i < set.size(); i++) {
            if ((set.get(i - 1)).length() < (set.get(i)).length()) {
                minSize = (set.get(i - 1)).length();
                set.remove(i);
            } else if ((set.get(i - 1)).length() > (set.get(i)).length()) {
                minSize = (set.get(i)).length();
                set.remove(i - 1);
            }
        }

        for(i = 0; i < set.size(); i++) {
            if (minSize == (set.get(i)).length()) {
                System.out.println(set.get(i));
            }
        }
    }
}
