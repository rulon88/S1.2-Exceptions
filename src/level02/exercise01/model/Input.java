package level02.exercise01.model;


import java.util.InputMismatchException;
import java.util.Scanner;
import level02.exercise01.exceptions.InvalidInputException;

public class Input {

    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {

        while (true) {
            try {
                System.out.print(message + ": ");
                return scanner.nextByte();
            } catch (InputMismatchException exception) {
                System.out.println(" Format error. Please enter a valid byte.");
                scanner.nextLine();
            }
        }
    }

    public static int readInt(String message) {

        while (true) {
            try {
                System.out.print(message + ": ");
                return scanner.nextInt();
            } catch (InputMismatchException exception) {
                System.out.println(" Format error. Please enter a valid int.");
                scanner.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.print(message + ": ");
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid float (e.g., 72.5).");
                scanner.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.print(message + ": ");
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Format error. Please enter a valid double.");
                scanner.nextLine();
            }
        }
    }

    public static char readChar(String message) throws InvalidInputException {
        System.out.print(message + ": ");
        String input = scanner.next();
        if (input.length() != 1) {
            throw new InvalidInputException("You must enter exactly one character.");
        }
        return input.charAt(0);
    }

    public static String readString(String message) throws InvalidInputException {
        System.out.print(message + ": ");
        String input = scanner.next();
        if (input.trim().isEmpty()) {
            throw new InvalidInputException("The string cannot be empty.");
        }
        return input;
    }

    public static boolean readYesNo(String message) throws InvalidInputException {
        System.out.print(message + " (s/n): ");
        String input = scanner.next().toLowerCase();
        if (input.equals("s")) {
            return true;
        } else if (input.equals("n")) {
            return false;
        } else {
            throw new InvalidInputException("Please enter 's' for yes or 'n' for no.");
        }
    }
}