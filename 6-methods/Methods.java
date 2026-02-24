/* A method is a block of code that does one specific task.

Instead of writing the same code again and again, you put it in a method and call it whenever you need. */

public class Methods {

  // method that prints a greetin 
  static void sayHello() {
    System.out.println("Hello, Java");
  }

  public static void main(String[] args) {
    SayHello(); // call the method = Hello, Java
    sayHello(); // can call multiple times = Hello, Java
  }

  // method with parameters
  static int add(int a, int b) {
    return a + b;
  }
  public static void main(String[] args) {
    int result = add(5, 3); // call method
    System.out.println("5 + 3 = " + result); // 5 + 3 = 8
  }

  // method with condition

  static boolean isEven(int number) {
    return number % 2 == 0;
  }

  public static void main(String[] args) {
    System.out.println(isEven(4)); // True
    System.out.println(isEven(7)); // False

  }
}

public static void main(String[] args) {

  // call simple method
  sayHello(); // Hello, Java

  // call add method
  int result = add(10, 7);
  System.out.printl("10 + 7 = " + result); // 10 + 7 = 17

  // call isEven method
  System.out.println("Is 10 even? " + isEven(10)); // Is 10 even? true 
  System.out.println("Is 7 even? " + isEven(7)); // Is 7 even? false
}
