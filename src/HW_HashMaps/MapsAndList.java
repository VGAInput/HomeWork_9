package HW_HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
        Создайте Map<String, List<Integer>>. Заполните ее 5 элементами, где ключ
        — произвольное значение, а значение — список,
        состоящий из 3 случайных чисел в диапазоне от 0 до 1000.
*/

public class MapsAndList {
    private static Map<String, List<Integer>> listMap = new HashMap<>();

    public static void main(String[] args) {
        listMap.put("First", getRandomList());
        listMap.put("Second", getRandomList());
        listMap.put("Third", getRandomList());
        listMap.put("Fourth", getRandomList());
        listMap.put("Fifth", getRandomList());

        System.out.println(listMap);

        Map<String,Integer> summedMap = new HashMap<>();

/*
        Преобразуйте созданную коллекцию в новую — Map<String, Integer>, где ключи
        взяты из первой коллекции, а число — сумма чисел списка. Выведите результат в консоль.
*/

        for (Map.Entry<String,  List<Integer>> pair : listMap.entrySet()) {
            int sum = 0;
            for (int i = 0; i < pair.getValue().size(); i++) {
                sum = sum + pair.getValue().get(i);
            }
            summedMap.put(pair.getKey(),sum);
        }

        System.out.println(summedMap);

    }


    private static List<Integer> getRandomList() {
        int min = 0;
        int max = 1000;
        List<Integer> randomNums = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            randomNums.add((int) Math.floor(Math.random() * (max - min + 1) + min));
        }
        return randomNums;
    }

}
