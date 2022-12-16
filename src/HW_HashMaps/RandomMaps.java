package HW_HashMaps;

import java.lang.invoke.WrongMethodTypeException;
import java.util.HashMap;
import java.util.Map;

public class RandomMaps {

    private static Map<String, Integer> randomMaps = new HashMap<>();

    public static void main(String[] args) {

        randomMaps.put("One", 1);
        randomMaps.put("Two", 2);
        randomMaps.put("Three", 3);


    }

    private static void addMap(String key, int value) {

        for (Map.Entry<String, Integer> pair : randomMaps.entrySet()) {
            if (pair.getKey().equals(key) && pair.getValue().equals(value)) {
                throw new WrongMethodTypeException("Такой номер уже существует!");
            }
        }
        randomMaps.put(key, value);
    }
}
