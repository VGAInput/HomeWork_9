package HW_HashMaps;

import java.nio.charset.Charset;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.*;

public class MapSout {

/*
    Создайте Map<Integer, String>, заполните ее 10 произвольными
    значениями. Выведите в консоль всё содержимое коллекции в
    порядке добавления (в формате "ключ:значение").
*/

    public static void main(String[] args) {
        Map<Integer, String> randomMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            randomMap.put(i, getRandomString(i));
            System.out.println(randomMap.get(i));
        }
    }

    private static List<Integer> getRandomNumber() {
        int min = 0;
        int max = 1000;
        List<Integer> randomNums = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            randomNums.add((int) Math.floor(Math.random() * (max - min + 1) + min));
        }
        return randomNums;
    }

    private static String getRandomString(int order) {
        String generatedString = new String(LocalDate.now().toString() + " " + order);
        return generatedString;
    }


}
