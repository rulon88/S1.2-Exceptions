package level01.exercise01.model;

import level01.exercise01.exceptions.*;
import java.util.ArrayList;
import java.util.List;

public class Sale {
    private final List<Product> products;
    private double totalPrice;

    public Sale() {
        this.products = new ArrayList<>();
        this.totalPrice = 0;
    }

    public void addProduct(Product product) throws InvalidProductException {
        if (product == null) {
            throw new InvalidProductException("Product cannot be null.");
        }
        products.add(product);
    }

    public void removeProduct(String name) throws ProductNotFoundException {
        boolean removed = products.removeIf(p -> p.getName().equalsIgnoreCase(name));
        if (!removed) {
            throw new ProductNotFoundException("Product '" + name + "' not found in the sale.");
        }
    }

    public void calculateTotal() throws EmptySaleException {
        if (products.isEmpty()) {
            throw new EmptySaleException("To make a sale you must first add products.");
        }

        totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }

        if (Double.isInfinite(totalPrice) || Double.isNaN(totalPrice)) {
            throw new ArithmeticException("Calculation error: invalid total value.");
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
