package Collections.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayList5 {
    /**
     * 1. Создай список строк.
     * 2. Добавь в него 5 строчек с клавиатуры.
     * 3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
     * 4. Используя цикл, выведи содержимое на экран, каждое значение с новой строки
     */

    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        for(int i = 0; i < 5; ++i) {
            str = reader.readLine();
            list.add(0, str);
        }
        for(int i = 0; i < 13; i++) {
            list.add(0, list.get(list.size()-1));
            list.remove(list.size()-1);
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
