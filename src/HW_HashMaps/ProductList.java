package HW_HashMaps;


import java.lang.invoke.WrongMethodTypeException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProductList {

    private Map<Product, Integer> products = new HashMap<>();

    public void add(Product product, Integer ammount) {

        for (Map.Entry<Product, Integer> pair : products.entrySet()) {
            if (ammount.equals(0)) ammount = 1;
            if (pair.getKey().equals(product)) throw new WrongMethodTypeException("Продукт уже существует.");
        }

        products.put(product, ammount);

    }

    public void remove(Product product) {
        products.remove(product);
    }

    public int getValue(Product product) {

        for (Map.Entry<Product, Integer> pair : products.entrySet()) {
            if (pair.getKey().equals(product)) {
                return pair.getValue() * product.getPrice();
            }
        }
        return product.getPrice();


    }


}
