package de.fraunhofer.iem.classesAndObjects.interfaceInJava.defaultImplementationInInterface;

/**
 * Usage of interface and the class that implements interface that has default implementation of a method
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car("ABC", "1234ADFR");
        car.start();
        car.displayVehicleRegistrationNumber();
        car.displayModelNumber();

        ((Vehicle) car).displayVehicleRegistrationNumber();
        ((Vehicle) car).displayModelNumber();

        System.out.println(((Vehicle) car).modelNumber);
        System.out.println(((Vehicle) car).vehicleRegistrationNumber);
    }
}
