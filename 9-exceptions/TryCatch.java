/* 

What is Exception Handling?

In Java, exceptions are runtime errors.

Examples:

Dividing by zero

Accessing a null object

Reading a file that doesn’t exist

Try-Catch lets your program:

Try some code

Catch the error if it happens

Continue running without crashing

*/

// Basic Structure
try {
  // code that might throw an exception
} catch (ExpectionType e) {
  // code to handle the exception
}

// Example 1: Division by zero
public class TryCatch {

  public static void main(String[] args) {

    int a = 10;
    int b = 0;

    try {
      int result = a / b; // this will throw an exception
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("Error: Cannot divide by zero!");
    }

    System.out.println("Program continues..."); /* Error: Cannot divide by zero! Program continues... */
  }                                                
}

// Example 2: Multiple operations
try {
  int [] numbers = {1, 2, 3};
  System.out.println(numbers[5]); // IndexOutOfBoundsException
} catch (ArrayIndexOutOfBoundsException e) {
  System.out.println("Error: Invalid array index!");
}

System.out.println("Program continues safely.");
