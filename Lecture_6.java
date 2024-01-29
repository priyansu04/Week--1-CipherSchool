public class Lecture_6 {
    public static void main(String[] args) {
        // Assigning character 'A' to variable 'a'
        char a = 'A';

        // Converting character 'A' to its Unicode code point and storing it in variable 'xa'
        int xa = a;

        // Assigning character '0' to variable 'k'
        char k = '0';

        // Converting character '0' to its numeric value using Character.digit method and storing it in variable 'l'
        int l = Character.digit(k, 10);

        // Printing the numeric value of character '0'
        System.out.println("Numeric value of '0': " + l);

        // Printing the Unicode code point of character 'A' and its numeric value using Character.getNumericValue method
        System.out.println("Unicode code point of 'A': " + xa);
        System.out.println("Numeric value of '0' using getNumericValue method: " + Character.getNumericValue(k));

        // Assigning character 'c' to variable 'b'
        char b = 'c';

        // Calculating the numerical difference between the Unicode code point of 'c' and 'a'
        int ax = b - 'a';

        // Printing the numerical difference
        System.out.println("Numerical difference between 'c' and 'a': " + ax);
    }
}
