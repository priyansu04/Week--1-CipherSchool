public class Lecture_5 {
    public static void main(String[] args) {

        // Initializing variables x and y with values 5 and 7
        int x = 5;
        int y = 7;

        // Printing the value of variable x
        System.out.println("X is " + x);

        // Explicitly casting 129 to a byte (byte can only hold values from -128 to 127)
        byte b2 = (byte) 129;

        // Printing the value of byte b2
        System.out.println("B2 is " + b2);

        // Explicitly casting 128 to a byte (byte can only hold values from -128 to 127)
        byte b3 = (byte) 128;

        // Printing the value of byte b3
        System.out.println("B3 is " + b3);

        // Explicitly casting 256 to a byte (byte can only hold values from -128 to 127)
        byte b4 = (byte) 256;

        // Printing the value of byte b4
        System.out.println("B4 is " + b4);

        // Initializing float f with the value 5.5
        float f = (float) 5.5;

        // Initializing double d with the value 2.65
        double d = 2.65;

        // Converting char ch to its numeric value and storing it in variable z
        char ch = '2';
        int z = Character.getNumericValue(ch);

        // Printing the numeric value of char ch
        System.out.println(z);

        // Converting int k to its digit using base 11 and printing the result
        int k = '3';
        System.out.println(Character.digit(k, 11));

        // Incrementing and decrementing operations
        int a = 10;
        int m = a++;
        System.out.println(m); // Printing the original value of a before incrementing
        System.out.println(a + " " + a++ + " " + ++a); // Printing the values after incrementing
        System.out.println(a + " " + a-- + " " + --a); // Printing the values after decrementing
    }
}
