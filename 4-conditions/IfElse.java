/* It allows your program to choose between different actions based on a condition.

In simple words:

👉 If something is true → do this
👉 Otherwise → do something else */

public class IfElse {
  public static void main(String[] args) {
      
    // Example 1: simle if
  int age = 20;

  if (age >= 18) {
    System.out.println("You are an adult."); // You are an adult.
  }

  System.out.println("------------------");

    // Example 2: if - else
    int number = 7;

    if (number % 2 == 0) { 
      System.out.println("The number is even.");
    } else {
      System.out.println("The number is odd."); // (7/2=3 rest 1!) The number is odd
    }

    System.out.println("___________");

      // Example 3: if - else if - else
    int score = 85;

    if (score >= 90) {
        System.out.println("Grade: A"):
    } else if (score >= 80) {
        System.out.println("Grade: B"); // Grade: B
    } else if (score >= 80) {
        System.out.println("Grade: C");
    } else {
      System.out.println("Grade: F");
    }

    System.out.pritln("_________________");

    // Example 4: Using logical operators
    boolean hasLicense = true;
    int age = 18;

    if (age >= 18 && hasLicense) { 
      System.out.println("You can drive."); // you can drive.
    } else {
      System.out.println("You cant drive.");
    }
  }
}



