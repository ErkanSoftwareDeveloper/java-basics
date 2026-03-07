/* What is an ArrayList?

An ArrayList is a dynamic list that can store multiple elements.

Difference from arrays:

Array	ArrayList
Fixed size	Dynamic size
Cannot grow	Can grow automatically
int[] numbers	ArrayList<Integer>

So ArrayList is more flexible than arrays. */

// To use ArrayList 
import java.util.ArrayList;

// Example!

import java.util.ArrayList;

public class ArrayListExample {
  public static void main(String[] args) {

    // Create ArrayList
    ArrayList<String> fruits = new ArrayList<>();

    // Add elements
    fruits.add("Apple");
    fruits.add("Banana");
    fruits.add("Orange");

    // Print list
    System.out.println(fruits);

    // Access element
    System.out.println("First fruit: " + fruits.get(0));

    // Change element
    fruits.set(1, "Mango");

    // Remove element
    fruits.remove("Orange");

    // Size of list
    System.out.println("Size : " + fruits.size());

    // Loop through list
    for (String fruit : fruits) {
      System.out.println(fruit);       /* OUTPUT:     [Apple, Banana, Orange]
                                                      First fruit: Apple
                                                      Size : 2
                                                      Apple
                                                      Mango  */
    }
  }
}
  
/* Important ArrayList Methods


Method	What it does

add()	adds element

get()	gets element

set()	updates element

remove()	deletes element

size()	list length 

*/
