package level01.exercise01.validators;

import level01.exercise01.exceptions.InvalidProductException;

public class ProductValidator {

    public static void validate(String name, double price) throws InvalidProductException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidProductException("Product name cannot be empty.");
        }
        if (price < 0) {
            throw new InvalidProductException("Product price cannot be negative.");
        }
    }
}
