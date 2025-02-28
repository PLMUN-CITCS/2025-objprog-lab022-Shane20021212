class Car {
    // Code will go her

    String make;
    String model;
    int year;

    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}   
public class CarDemo {
    public static void main(String[] args) {
        // Code will go here

        Car myCar = new Car();

        myCar.make = "Ford";
        myCar.model = "Everest";
        myCar.year = 2022;

        myCar.displayInfo();
    }
}