public class Lecture_10 {
    int rollno;
    String name;
    static int count = 0; // Static variable to keep track of the number of objects created

    // Parameterized constructor
    Lecture_10(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        count++; // Incrementing the count each time an object is created
    }

    // Static method named 'show'
    static void show() {
        // Static method can only contain static variables
        // Used to perform common tasks for all objects
        System.out.println(count);
    }

    // Main method
    public static void main(String[] args) {
        // Creating objects of class 'static_10'
        Lecture_10 a = new Lecture_10(1, "Priyansu");
        System.out.println(count);

        Lecture_10 b = new Lecture_10(2, "Aman");
        System.out.println(count);

        Lecture_10 c = new Lecture_10(3, "Neeraj");
        System.out.println(Lecture_10.count);

        // Calling the static method 'show' to display the count
        Lecture_10.show();
    }
}
