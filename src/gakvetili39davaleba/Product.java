package gakvetili39davaleba;

public class Product {
    String name;
    Integer price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    Integer getPrice() {
        return price;
    }
}
