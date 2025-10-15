package level01.exercise01.model;

import level01.exercise01.validators.ProductValidator;
import level01.exercise01.exceptions.InvalidProductException;

public class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) throws InvalidProductException {
        ProductValidator.validate(name, price);
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + "}";
    }
}
