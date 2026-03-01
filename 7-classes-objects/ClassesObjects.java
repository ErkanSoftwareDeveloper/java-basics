/* What is a Class?

A class is a blueprint (template).

Think of it like a plan for building something. 



What is an Object?

An object is a real instance of a class.
*/

public class Car {

  // Properties (variables)
  String brand;
  String color;
  int speed;

  // Method (behavior)
  void drive() {
    System.out.println(brand + " is driving at " + speed + " km/h.");
  }
}

// This is just the blueprint, now we create a real object in another file
// Creating an Object!
public class Main {
  public static void main(String[] args) {

    // Create object
    Car myCar = new Car();

    // Set values
    myCar.brand = "BMW";
    myCar.color = "Black";
    myCar.speed = 120;

    // Call method 
    myCar.drive(); // BMW is driving at 120 km/h.
  }
}

/* Car = class type
  myCar = object name
  new Car() = creates the object in memory */
