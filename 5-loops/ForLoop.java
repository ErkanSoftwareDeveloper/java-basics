// A for loop is used when you want to repeat something a specific number of times.

// example 1: print 1 to 5

public class ForLoop {
  public static void main(String[] args) {

    for (int i = 1; i <= 5; i++) {
      System.out.println(i); // 1 2 3 4 5 
    }                            
  }                              
}                                
                                 
// Countdown 
for (int i = 5; i >= 1; i--) {
  System.out.println(i); // 5 4 3 2 1 
}

// Using Loop with Condition
for (int i = 1; i <= 10; i++) {

  if (i % 2 == 0) {
    System.out.println(i + " is even"); // 2 is even, 4 is even, 6 is even, 8 is even, 10 is even
  }
}

/* Important Concepts

i is just a variable (can be any name)

Loop runs until condition becomes false

i++ means increase by 1

i-- means decrease by 1 */
