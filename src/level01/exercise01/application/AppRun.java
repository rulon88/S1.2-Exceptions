package level01.exercise01.application;

import level01.exercise01.model.*;
import level01.exercise01.exceptions.*;

public class AppRun {

    public void start() {
        exampleValidSale();
        exampleEmptySale();
        exampleInvalidProduct();
        exampleProductNotFound();
        exampleIndexOutOfBounds();
    }

    private void exampleValidSale() {
        System.out.println("=== EXAMPLE: Valid Sale ===");
        Sale sale = new Sale();

        try {
            sale.addProduct(new Product("Book", 12.5));
            sale.addProduct(new Product("Pen", 2.3));
            sale.calculateTotal();
            System.out.println("Products: " + sale.getProducts());
            System.out.println("Total price: " + sale.getTotalPrice());
        } catch (InvalidProductException | EmptySaleException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
    }

    private void exampleEmptySale() {
        System.out.println("=== EXAMPLE: Empty Sale ===");
        Sale emptySale = new Sale();

        try {
            emptySale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println();
    }

    private void exampleInvalidProduct() {
        System.out.println("=== EXAMPLE: Invalid Product ===");
        Sale sale = new Sale();

        try {
            Product invalid = new Product("USB Cable", -5.0); // puede lanzar IllegalArgumentException
            sale.addProduct(invalid);
        } catch (IllegalArgumentException | InvalidProductException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
    }
    private void exampleProductNotFound() {
        System.out.println("=== EXAMPLE: Product Not Found ===");
        Sale sale = new Sale();

        try {
            sale.addProduct(new Product("Notebook", 15.0));
            sale.removeProduct("Tablet");
        } catch (InvalidProductException | ProductNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
    }

    private void exampleIndexOutOfBounds() {
        System.out.println("=== EXAMPLE: IndexOutOfBounds ===");
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // will throw exception
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println();
    }
}
