package Collections.SetAndMap;

import dorkbox.util.Sys;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class task1 {
    /**
     * Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
     */

    public static void main(String[] args) throws IOException {
        Set<String> set = new HashSet();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 20; i++){
            set.add("Л"  + reader.readLine());
        }
    }
}
