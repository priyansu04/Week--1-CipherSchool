// Base class A
class A {
    int a, b;

    // Method in class A
    public void show() {
        System.out.println("Hello");
    }
}

// Class B extending class A (single-level inheritance)
class B extends A {
    int c, d;

    // Method in class B
    public void write() {
        System.out.println("Writing");
    }
}

// Class C extending class B (multi-level inheritance)
class C extends B {
    int e, f;

    // Method in class C
    public void speak() {
        System.out.println("Speak");
    }
}

// Class D extending class C (multi-level inheritance)
class D extends C {
    int g, h;

    // Method in class D
    public void eat() {
        System.out.println("Eating");
    }
}

// Class E extending class C (multi-level inheritance)
class E extends C {
    int i, j;

    // Method in class E
    public void cry() {
        System.out.println("Crying");
    }
}

// Interface A1
interface A1 {
    public void doing();
}

// Interface B1
interface B1 {
    public void done();
}

// Class C1 implementing interfaces A1 and B1 (multiple interfaces)
class C1 implements A1, B1 {
    public void done() {
        // Implementation of the 'done' method from interface B1
    }

    public void doing() {
        // Implementation of the 'doing' method from interface A1
    }
}

// Class C2 extending class A and implementing interface A1 (inheritance and interface implementation)
class C2 extends A implements A1 {
    public void doing() {
        // Implementation of the 'doing' method from interface A1
    }
}

// Main class
public class Lecture_9 {
    public static void main(String[] args) {
        // Single level inheritance example
        B b = new B();
        b.show();

        // Multi-level inheritance example
        D d = new D();
        d.show();

        // Hierarchical inheritance example
        E e = new E();
        e.speak();

        // Multiple inheritance is not directly possible in Java
    }
}
