package level01.exercise01.exceptions;

public class InvalidProductException extends Exception {
    public InvalidProductException(String message) {
        super(message);
    }
}