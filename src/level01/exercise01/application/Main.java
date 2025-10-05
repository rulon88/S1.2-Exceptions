package level01.exercise01.application;

import level01.exercise01.model.*;
import level01.exercise01.exceptions.EmptySaleException;

public class Main {
    public static void main(String[] args) {
        try {
            // Test with products
            Sale sale = new Sale();
            sale.addProduct(new Product("Book", 12.5));
            sale.addProduct(new Product("Pen", 2.3));
            sale.calculateTotal();
            System.out.println();
            System.out.println("Products in sale: " + sale.getProducts());
            System.out.println("Total price: " + sale.getTotalPrice());
            System.out.println();
            // Test with empty sale
            Sale emptySale = new Sale();
            emptySale.calculateTotal(); // will throw EmptySaleException

        } catch (EmptySaleException e) {
            System.out.println("⚠ Exception: " + e.getMessage());
        }

        // Generate and catch IndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // error: index out of range
        } catch (IndexOutOfBoundsException e) {
            System.out.println("⚠ Caught IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
