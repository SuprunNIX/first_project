package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class task1 {
    /**
     *Создайте список List<String> не короче 50 элементов разной длинны (наполнение не важно).
     *
     * Добавьте вручную несколько пустых элементов ""
     *
     * С помощью stream() выведите на консоль:
     *
     * 1. длинну каждого из элементов списка.
     * 2. не пустые элементы списка не содержащие символ d
     * 3. элементы списка в алфавитном порядке.
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("", "zxcvbn", "q", "zxcvbnm", "qw", "", "qwe", "q", "qwer", "qa", "qwert", "qaz", "qwerty", "qazw", "qwertyu", "qazws", "qwertyui", "qazwsx", "qwertyuio", "qazwsxe", "qwertyuiop", "qazwsxed", "", "qazwsxedc", "a", "", "as", "r", "asd", "rf", "asdf", "rfv", "asdfg", "rfvt", "asdfgh", "rfvtg", "asdfghj", "rfvtgb", "asdfghjk", "rfvtgby", "asdfghjkl", "rfvtgbyh", "", "rfvtgbyhn", "z", "", "zx", "u", "zxc", "uj", "zxcv", "ujm", "zxcvb", "ujmi");
        Stream<String> stream = list.stream();
        System.out.println("Element length:");
        stream.forEach((x) -> System.out.print(x.length() + " "));

        System.out.println(" ");

        System.out.println("Non-empty elements:");
        Stream<String> streamNotEmpty = list.stream();
        streamNotEmpty.filter((x) -> {
            return !x.contains("d");
        }).filter((x) -> {
            return x.length() != 0;
        }).forEach((x) -> {
            System.out.print(x + " ");
        });

        System.out.println("\nAlphabetical sorted array: ");
        Stream<String> AscStream = list.stream();
        AscStream.sorted().forEach((x) -> {
            System.out.print(x + " ");
        });
    }
}
