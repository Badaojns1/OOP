// Import statement for System
//import java.lang.System;

// Superclass Car
class Car {
    // Fields
    public String wheelStatus;
    public int noOfWheels;

    // Constructor
    public Car(String wheelStatus, int noOfWheels) {
        this.wheelStatus = wheelStatus;
        this.noOfWheels = noOfWheels;
    }

    // Method to apply brake
    public void applyBrake() {
        wheelStatus = "Stop";
        System.out.println("Stop the car using brake");
    }

    // toString() method to print info of Car
    @Override
    public String toString() {
        return ("No of wheels in car " + noOfWheels + "\n"
                + "status of the wheels " + wheelStatus);
    }
}
