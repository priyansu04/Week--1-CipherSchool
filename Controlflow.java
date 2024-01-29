import java.util.Scanner;

// Class definition for 'student'
class Student {
    String name;
    int marks;

    // Method to check if a student passes based on marks
    boolean checkPass() {
        if (marks >= 40) {
            return true;
        } else {
            return false;
        }
    }
}

// Main class named 'Controlflow'
public class Controlflow {

    // Method to find the maximum of three integers
    int max(int a, int b, int c) {
        if (a > b) {
            if (a > c)
                return a;
        } else if (b > c) {
            return b;
        }
        return c;
    }

    public static void main(String[] args) {
        // Creating instances of the 'Student' class
        Student s1 = new Student();
        s1.name = "Priyansu";
        s1.marks = 30;

        Student s2 = new Student();
        s2.name = "Rawat";
        s2.marks = 90;

        // Checking and printing whether the students pass
        System.out.println(s1.checkPass());
        System.out.println(s2.checkPass());

        // Creating an instance of the 'Controlflow_8' class
        Controlflow c = new Controlflow();

        // Finding and printing the maximum of three numbers
        System.out.println(c.max(20, 10, 3));

        // Taking input from the user for a new student
        Scanner sc = new Scanner(System.in);
        s1.name = sc.nextLine();
        s1.marks = sc.nextInt();

        // Checking and printing whether the new student passes
        System.out.println(s1.checkPass());

        // Using a switch statement to print messages based on the value of 'l'
        char l = 'a';
        switch (l) {
            case 'a':
                System.out.println("Hi, I'm 'a'");
                break;
            case 'b':
                System.out.println("Hi, I'm 'b'");
                break;
            default:
                System.out.println("Hi, I'm the default case");
        }
    }
}
