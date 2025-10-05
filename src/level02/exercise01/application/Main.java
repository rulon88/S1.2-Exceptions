package level02.exercise01.application;

import level02.exercise01.model.Input;
import level02.exercise01.exceptions.InvalidInputException;

public class Main {
    public static void main(String[] args) {
        try {
            byte age = Input.readByte("Enter your age");
            System.out.println("Age: " + age);

            int birthYear = Input.readInt("Enter your birth year");
            System.out.println("Birth year: " + birthYear);

            float weight = Input.readFloat("Enter your weight in kg");
            System.out.println("Weight: " + weight);

            double piDecimals = Input.readDouble("How many decimals of Pi do you remember?");
            System.out.println("Pi decimals remembered: " + piDecimals);

            char initial = Input.readChar("Enter a single character");
            System.out.println("Character: " + initial);

            String name = Input.readString("Enter your name");
            System.out.println("Name: " + name);

            boolean agree = Input.readYesNo("Are you happy?");
            System.out.println("Answer: " + (agree ? "Yes" : "No"));
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }
}
