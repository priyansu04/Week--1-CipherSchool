// Interface 'M' with a constant variable 'x' and an abstract method 'fun'
interface M {
    int x = 10; // Constant variable (public, static, final)

    void fun(); // Abstract method (public, abstract)
}

// Interface 'N' with a constant variable 'x' and an abstract method 'fun'
interface N {
    int x = 20; // Constant variable (public, static, final)

    void fun(); // Abstract method (public, abstract)
}

// Class 'C' implementing both interfaces 'M' and 'N'
class C implements M, N {
    // Implementation of the 'fun' method
    public void fun() {
        System.out.println(M.x); // Accessing constant variable 'x' from interface 'M'
        System.out.println(N.x); // Accessing constant variable 'x' from interface 'N'
        System.out.println(M.super.hashCode()); // Accessing the hash code of 'M' interface using 'super'
        System.out.println(N.super.hashCode()); // Accessing the hash code of 'N' interface using 'super'
    }
}

// Interface 'O' extending both interfaces 'M' and 'N'
interface O extends M, N {
    // No new methods defined, inheriting from both 'M' and 'N'
}

// Class 'D' implementing interface 'O'
class D implements O {
    // Implementation of the 'fun' method
    public void fun() {
        System.out.println("Hello, I'm fun in D");
    }
}

// Main class 'Lecture_14'
public class Lecture_14 {
    public static void main(String args[]) {
        // Creating an instance of class 'C' and calling the 'fun' method
        C c = new C();
        c.fun();

        // Creating an instance of class 'D' and calling the 'fun' method
        D d = new D();
        d.fun();
    }
}
