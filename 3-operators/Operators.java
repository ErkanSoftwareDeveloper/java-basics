public class Operators {
  public static void main(String[] args) {

    // Arithmetic Operators
    int a = 10;
    int b = 3;
    System.out.println("a + b = " + (a + b)); // 13
    System.out.println("a - b = " + (a - b)); // 7
    System.out.println("a * b = " + (a * b)); // 30  
    System.out.println("a / b = " + (a / b)); // 3 int  
    System.out.println("a % b = " + (a % b)); // 1 (remainder)
    a++;  
    System.out.println("a++ = " + a); // 11
    b--;
    System.out.println("b-- = " + b); // 2

    // Double division
    double result = (double)a / b;
    System.out.println("Division (double): " + result); // Division (double) : 5.5 (11 / 2 = 5.5)

    // Comparison Operator
    System.out.println(x == y);
    System.out.println(x != y);
    System.out.println(x > y);
    System.out.println(x < y);
    System.out.println(x >= 5);
    System.out.println(y <= 10);

    // Logical Operators
    boolean a = true;
    boolean b = false;
    System.out.println(a && b);
    System.out.println(a || b);
    System.out.println(!a);

    // Assignment Operators
    int number = 5;
    
    number += 3; // 8 (5+3=8)
    System.out.println(number);
    
    number -= 2; // 6 (8-2=6)
    System.out.println(number);
    
    number *= 2; // 12 (6*2=12)
    System.out.println(number);
    
    number /= 3; // 4 (12/3=4)
    System.out.println(number);
    
    number %= 3; // 1 (4/3=1)
    System.out.println(number);
    
  }

/* Arithmetic: + - * / % ++ --

Comparison: == != > < >= <=

Logical: && || !

Assignment: = += -= *= /= %=                     */
