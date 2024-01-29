// Parent class A
class A {
    final int a = 10; // Final variable with a constant value
    final int b; // Final variable without a value

    // Constructor for class A
    A() {
        b = 9; // Initializing final variable 'b' in the constructor
    }

    final void show() {
        // Final method that cannot be overridden by child classes
        System.out.println("Hi, I'm a final function and cannot be overridden");
    }
}

// Final child class B extending class A
final class B extends A {
    // Child class cannot override final methods from the parent class
}

// Uncommenting the following lines will result in a compilation error, as final classes cannot be inherited
// class C extends B {
//     // Final classes cannot be inherited
// }

// Main class Final_11
public class Lecture_11 {
    public static void main(String[] args) {
        // Main method where you can add code as needed
    }
}
