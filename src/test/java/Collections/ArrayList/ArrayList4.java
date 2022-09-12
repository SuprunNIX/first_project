package Collections.ArrayList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList4 {
    /**
     * 1. Создай список строк в методе main.
     * 2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а в начало.
     * 3. Используя цикл, выведи содержимое на экран, каждое значение с новой строки.
     */

    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        for(int i = 0; i < 10; ++i) {
            str = reader.readLine();
            list.add(0, str);
        }

        Iterator inter = list.iterator();

        while(inter.hasNext()) {
            str = (String)inter.next();
            System.out.println(str);
        }
    }
}
