package de.fraunhofer.iem.classesAndObjects.interfaceInJava.interfaceExample;

/**
 * Usage of interface and the class that implements interface
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
        vehicle.changeGear(1);
        vehicle.accelerate(1);
        vehicle.changeGear(2);
        vehicle.accelerate(15);
        vehicle.changeGear(3);
        vehicle.accelerate(65);
        vehicle.changeGear(4);
        vehicle.accelerate(110);
        vehicle.changeGear(5);
        vehicle.accelerate(245);
        vehicle.changeGear(6);
        vehicle.accelerate(330);
        System.out.println("Current speed = " + vehicle.getCurrentSpeed() + " kmph");
    }
}
