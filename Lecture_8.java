// Defining a class named 'car'
class Car {
    // Member variables to store car details
    String name;
    String color;
    int year;
    int maxspeed;

    // Method to simulate car acceleration
    void accelerate() {
        System.out.println("Car is accelerating");
    }
}

// Main class named 'Car_8'
public class Lecture_8 {
    public static void main(String[] args) {
        // Creating an instance of the 'car' class named 'polo'
        Car polo = new Car();

        // Printing the initial value of the 'name' property (which is 'null' by default)
        System.out.println(polo.name = "Honda");

        // Printing the initial values of other properties (which are 0 or null by default)
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.maxspeed);

        // Setting values for 'polo' object properties
        polo.name = "Suzuki";
        polo.color = "Black";
        polo.year = 2016;
        polo.maxspeed = 120;

        // Printing the updated values of 'polo' object properties
        System.out.println(polo.name = "Honda");
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.maxspeed);
    }
}
