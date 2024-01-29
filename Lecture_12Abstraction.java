// Abstract class 'car'
abstract class Car {
    int maxspeed = 20; // An abstract class can have fields (attributes)

    abstract void accelerate(); // Abstract method (no implementation) to be overridden by subclasses

    void show() { // Concrete method with implementation in the abstract class
        System.out.println("hello");
    }

    abstract void brake(); // Another abstract method to be overridden
}

// Concrete class 'BMW' extending the abstract class 'Car'
class BMW extends Car {
    // Implementation of the abstract method 'accelerate' in the subclass
    void accelerate() {
        System.out.println("BMW is accelerating");
    }

    // Implementation of the abstract method 'brake' in the subclass
    void brake() {
        // Implementation specific to BMW braking
    }
}

// Another subclass 'BMW1' extending 'BMW'
class BMW1 extends BMW {
    // Implementation of the abstract method 'brake' in the subclass
    void brake() {
        System.out.println("BMW1 is braking");
    }

    // Overriding the 'accelerate' method in the subclass
    void accelerate() {
        System.out.println("BMW1 is accelerating");
    }
}

// Abstract class 'A' with a concrete method 'show1'
abstract class A {
    int a = 10;

    // Concrete method with implementation in the abstract class
    void show1() {
        System.out.println(a + " " + "Hi, I am a concrete method in the abstract class");
    }

    // Abstract method (no implementation) to be overridden by subclasses
    abstract void show();
}

// Concrete class 'B' extending 'A'
class B extends A {
    // Implementation of the abstract method 'show' in the subclass
    void show() {
        System.out.println(a);
    }
}

// Main class 'Abstraction_12'
public class Lecture_12Abstraction {
    public static void main(String[] args) {
        // Creating instances of the classes
        BMW b = new BMW();
        b.accelerate();

        BMW1 b1 = new BMW1();
        b1.accelerate();

        B n = new B();
        n.show();
        n.show1();
    }
}
