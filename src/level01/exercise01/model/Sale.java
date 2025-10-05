package level01.exercise01.model;

import level01.exercise01.exceptions.EmptySaleException;
import java.util.ArrayList;
import java.util.List;

public class Sale {
    private final List<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null.");
        }
        products.add(product);
    }

    public void calculateTotal() throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException("To make a sale you must first add products.");
        }
        totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public List<Product> getProducts() {
        return List.copyOf(products);
    }

    @Override
    public String toString() {
        return "Sale{products=" + products + ", totalPrice=" + totalPrice + "}";
    }
}
