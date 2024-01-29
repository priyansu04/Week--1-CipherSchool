public class Lecture_10static {
    int rollno;
    String name;
    static int count = 0;

    static_10(int rollno, String namString) {
        this.rollno = rollno;
        this.name = name;
        count++;
    }

    static void show() {// can only be contain static varibles thesee are created becuase to main single
        // refrence  --used to do common task for all objects
        System.out.println(count);
    }

    public static void main(String[] args) {
        static_10 a = new static_10(1, "sanjay");
        System.out.println(count);
        static_10 b = new static_10(1, "sanjay");
        System.out.println(count);
        static_10 c = new static_10(1, "sanjay");
        System.out.println(static_10.count);
        static_10.show();
    }
}
