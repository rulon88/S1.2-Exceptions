# 🧾 Task 2 – Exceptions

## 📄 Description
This project consists of **two levels** designed to practice **exception handling in Java**.  
You will learn how to manage both **standard Java exceptions** (like `InputMismatchException` or `IndexOutOfBoundsException`) and **custom exceptions** created by extending the `Exception` class.

---

## 💻 Technologies Used
- Java 17 or higher
- IntelliJ IDEA / Eclipse
- Java Standard Library (`java.util.Scanner`, `java.util.InputMismatchException`)

---

## 📋 Requirements

### 🔹 Level 1
**Objective:** Handle exceptions during a sale process.

- Create a `Product` class with attributes `name` and `price`.
- Create a `Sale` class that contains a list of products and a method `calculateTotal()`.
    - If the product list is empty, throw a custom exception `EmptySaleException` with the message:
      > "To make a sale, you must first add products"
- Catch and display the message using `getMessage()`.
- Add another example that triggers and catches an **`IndexOutOfBoundsException`** manually.

**Example classes:**
- `Product.java`
- `Sale.java`
- `EmptySaleException.java`
- `Main.java`

---

### 🔹 Level 2
**Objective:** Create a utility class for input validation.

- Create the `Input` class that reads and validates different types of data using `Scanner`.
- Include the following static methods:
    - `readByte(String message)`
    - `readInt(String message)`
    - `readFloat(String message)`
    - `readDouble(String message)`
    - `readChar(String message)`
    - `readString(String message)`
    - `readYesNo(String message)`
- Use `try-catch` blocks to handle `InputMismatchException`.
- Create a **custom exception** called `InvalidInputException` for invalid or empty input.
- Display user-friendly error messages (e.g. “Format error. Please enter a valid number.”).

**Example classes:**
- `Input.java`
- `InvalidInputException.java`
- `Main.java`

---

## ▶️ Execution
Run the `Main` class for each level:
- **Level 1:** `/level01/exercise01/application/Main.java`
- **Level 2:** `/level02/exercise01/application/Main.java`

Follow the console prompts to test the different exception cases.

---
## 🌐 Deployment
This is an educational project and is not intended for production deployment.

If you wish to package and run the application as a `.jar` file, follow these steps:

```bash
# Compile the main Java file
javac Main.java

# Package all class files into a runnable JAR
jar cfe ExceptionsExercises.jar Main *.class

# Execute the JAR file
java -jar ExceptionsExercises.jar
```
--- 

## 🤝 Contributions
- Work based on IT Academy exercises and official Java documentation.
- Complementary research using YouTube tutorials, Google references, and a **Java course on Udemy**.
- Followed Java best practices for naming, structure, and clean, readable code.



---

## 📦 Repository
You can find the source code on GitHub:  
🔗 [https://github.com/rulon88/S1.2-Exceptions](https://github.com/rulon88/S1.2-Exceptions)


---

## ✅ Author Notes
This project is part of the IT Academy Backend Java training.  
The exercises focus on **understanding and applying exception handling in Java**,  
including both standard and custom exceptions.  
They serve as practical foundations to strengthen OOP logic and error control.

Happy coding 🚀
