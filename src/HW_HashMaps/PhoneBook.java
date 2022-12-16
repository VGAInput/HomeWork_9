package HW_HashMaps;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public static void main(String[] args) {
        Map<String,Integer> phoneBook = new HashMap<>();

        phoneBook.put("Andrey Martinov",668_76_91);
        phoneBook.put("Asel Dvorah",588_58_23);
        phoneBook.put("Retha Bogdan",319_71_27);
        phoneBook.put("Durga Vashti",656_68_98);
        phoneBook.put("Zuzanka Ásbjörn",140_04_92);

        phoneBook.put("Landry Melisa",829_59_30);
        phoneBook.put("Lowe Eusebia",338_50_19);
        phoneBook.put("Cedric Ties",378_89_46);
        phoneBook.put("Kaija Jamila",882_22_06);
        phoneBook.put("Laurus Cicero",478_57_57);

        phoneBook.put("Adzo Vihaan",111_81_83);
        phoneBook.put("Katja Linda",952_69_49);
        phoneBook.put("Oliver Igor",833_38_47);
        phoneBook.put("Ayumi Eline",929_14_85);
        phoneBook.put("László Alfred",421_36_20);

        phoneBook.put("Rakiya Stace",102_60_73);
        phoneBook.put("Gwenaël Débora",893_27_67);
        phoneBook.put("Irakliy Tancred",296_77_57);
        phoneBook.put("Rahma Melia",245_17_75);
        phoneBook.put("Jonette Štefa",464_35_15);

        for (Map.Entry<String, Integer> entry : phoneBook.entrySet()){
            System.out.println(entry);
        }

    }


}
