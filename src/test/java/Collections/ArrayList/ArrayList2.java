package Collections.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class ArrayList2 {
    /**
     * 1. Создай список строк.
     * 2. Считай с клавиатуры 5 строк и добавь в список.
     * 3. Используя цикл, найди самую длинную строку в списке.
     * 4. Выведи найденную строку на экран.
     * 5. Если таких строк несколько, выведи каждую с новой строки.
     */

    public static void main(String[] args) throws IOException {
        ArrayList<String> set = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maxSize;
        for(maxSize = 0; maxSize < 5; maxSize++) {
            set.add(reader.readLine());
        }

        maxSize = 0;

        int i;
        for(i = 1; i < set.size(); i++) {
            if ((set.get(i - 1)).length() > (set.get(i)).length()) {
                maxSize = (set.get(i - 1)).length();
                set.remove(i);
            } else if ((set.get(i - 1)).length() < (set.get(i)).length()) {
                maxSize = (set.get(i)).length();
                set.remove(i - 1);
            }
        }

        for(i = 0; i < set.size(); i++) {
            if (maxSize == (set.get(i)).length()) {
                System.out.println(set.get(i));
            }
        }
    }
}
