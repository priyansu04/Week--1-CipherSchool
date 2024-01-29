// Interface 'shape' defining abstract methods for geometric shapes
interface Shape {
    double pi = 3.14; // Constant variable (public, static, final)

    double getSquare(double r); // Abstract method (public, abstract)
}

// Class 'Circle' implementing the 'Shape' interface
class Circle implements Shape {
    public double getSquare(double r) {
        return r * r;
    }
}

// Interface 'numbers' with a constant variable and an abstract method
interface Numbers {
    int x = 10; // Constant variable (public, static, final)

    void fun(); // Abstract method (public, abstract)
}

// Interface 'alphabets' with a constant variable and an abstract method
interface Alphabets {
    int x = 10; // Constant variable (public, static, final)

    void fun(); // Abstract method (public, abstract)
}

// Interface 'lost' extending 'numbers'
interface Lost extends Numbers {
    void print(); // Abstract method (public, abstract)
}

// Class 'Ok' implementing 'Lost' interface
class Ok implements Lost {
    public void print() {
        // Implementation of the 'print' method from the 'Lost' interface
    }

    public void fun() {
        // Implementation of the 'fun' method from the 'Numbers' interface
    }
}

// Interface 'k' extending 'numbers' and 'alphabets'
interface K extends Numbers, Alphabets {
    // No methods defined, inheriting from both 'Numbers' and 'Alphabets'
}

// Class 'B1' implementing 'numbers' and 'alphabets'
class B1 implements Numbers, Alphabets {
    public void fun() {
        System.out.println("I'm a method in multiple inheritance");
        System.out.println(Alphabets.x + " " + Numbers.x); // Using fully qualified names to avoid ambiguity
    }
}

// Class 'A' with a method 'make'
class A {
    int make(int a) {
        System.out.println("This is the parent");
        return 0;
    }
}

// Class 'B' extending 'A'
class B extends A {
    // Overriding the 'make' method from the parent class
    int make(int a) {
        System.out.println("This is in the child");
        return 0;
    }

    void print() {
        System.out.println("This is the second method in the child");
    }
}

// Main class 'Lecture_13'
public class Lecture_13 {
    public static void main(String[] args) {
        // Creating an instance of 'Circle' class
        Circle a = new Circle();
        System.out.println(a.getSquare(2.5));

        // Polymorphism - Creating an instance of 'B' and assigning it to a reference of 'A'
        A a1 = new B();
        a1.make(2); // Calls the overridden method in the child class

        // Uncommenting the line below would result in a compilation error since 'print' is not
        // a method in class 'A'
        // a1.print();

        // Creating an instance of 'B1' class and calling the 'fun' method
        B1 l = new B1();
        l.fun();
    }
}
