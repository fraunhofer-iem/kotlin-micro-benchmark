package de.fraunhofer.iem.classesAndObjects.interfaceInJava.interfaceExample;

/**
 * Demonstrates the implementing the interface in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class Car implements Vehicle {
    private boolean isStart = false;
    private int currentSpeed = 0;
    private int currentGear = 0;

    @Override
    public void start() {
        if (isStart) {
            System.err.println("Car is already started.");
        }

        isStart = true;
    }

    @Override
    public void stop() {
        if (!isStart) {
            System.err.println("Car is already stopped.");
        }

        isStart = false;
    }

    @Override
    public void accelerate(int speed) {
        int maxSpeed = 320;
        if (currentGear == 0) {
            if (speed > maxSpeed)
                currentSpeed = maxSpeed;
            else
                currentSpeed = speed;
        } else if (currentGear == 1) {
            if (speed > 2) {
                System.out.println("First gear is to just move the car.\nPlease change the gear to 2");
                currentSpeed = 2;
            } else {
                currentSpeed = speed;
            }
        } else if (currentGear == 2) {
            if (speed > 20) {
                System.out.println("20 kmph is the max speed for 2nd gear\nPlease change the gear to 3");
                currentSpeed = 20;
            } else {
                currentSpeed = speed;
            }
        } else if (currentGear == 3) {
            if (speed > 70) {
                System.out.println("70 kmph is the max speed for 3rd gear\nPlease change the gear to 4");
                currentSpeed = 70;
            } else {
                currentSpeed = speed;
            }
        } else if (currentGear == 4) {
            if (speed > 120) {
                System.out.println("120 kmph is the max speed for 4th gear\nPlease change the gear to 5");
                currentSpeed = 120;
            } else {
                currentSpeed = speed;
            }
        } else if (currentGear == 5) {
            if (speed > 250) {
                System.out.println("250 kmph is the max speed for 5th gear\nPlease change the gear to 6");
                currentSpeed = 250;
            } else {
                currentSpeed = speed;
            }
        } else if (currentGear == 6) {
            if (speed > maxSpeed) {
                System.out.println(maxSpeed + " kmph is the max speed for 6th gear\n");
                currentSpeed = maxSpeed;
            } else {
                currentSpeed = speed;
            }
        }
    }

    @Override
    public void changeGear(int toGear) {
        if (toGear > 0 && toGear <= 6)
            currentGear = toGear;
        else
            System.err.println(toGear + " is wrong gear");

    }

    @Override
    public int getCurrentSpeed() {
        return currentSpeed;
    }
}
