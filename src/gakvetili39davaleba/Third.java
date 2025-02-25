package gakvetili39davaleba;

import java.util.*;

public class Third {
    public static void main(String[] args) {
        List <Product> products = Arrays.asList(
                new Product("Pepsi", 2),
                new Product("Barambo", 22),
                new Product("Vodka", 35),
                new Product("White Wine", 55)
        );


        Integer totalPrice = products.stream().filter(p -> p.price>20).map(Product::getPrice).reduce(0, Integer::sum);
        System.out.println(totalPrice);
    }
}
