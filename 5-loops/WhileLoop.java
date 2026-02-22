/* A while loop repeats code as long as a condition is true.
Unlike for, you don’t need to know in advance how many times it will run. */

public class WhileLoop {
  public static void main(String[] args) {

     int i = 1;

    while (i <= 5) {
      System.out.println(i);
      i++; // 1 2 3 4 5 
    }
  
    // Countdown
    int i = 5;

    while (i >= 1) {
      System.out.println(i);
      i--;  // 5 4 3 2 1
    }

    // Using while with if
    int i = 1;

    while (i <= 10) {
      if (i % 2 == 0) {
        System.out.println(i + " is even");
      }
      i++; // 2 is even, 4 is even, 6 is even, 8 is even, 10 is even
    }

    
  }
}
