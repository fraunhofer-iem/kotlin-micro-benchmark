package de.fraunhofer.iem.basics.controlFlow.conditionAndLoops;

/**
 * Demonstrates Switch statement in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class SwitchStatement {
    public static void main(String[] args) {
        simpleSwitchWithInt(90);
        simpleSwitchWithString(args);
    }

    private static void simpleSwitchWithString(String[] args) {
        switch (args[0]) {
            case "hi":
                System.out.println("Hi!");
                break;

            case "hello":
                System.out.println("Hello!");
                break;

            case "how are you":
                System.out.println("How Are You?");
                break;

            default:
                System.out.println("What should i tell?");
                break;
        }
    }

    private static void simpleSwitchWithInt(int num) {
        switch (num) {
            case 0:
                System.out.println("Zero");
                break;

            case 1:
                System.out.println("One");
                break;

            case 5:
                System.out.println("Five");
                break;

            case 10:
                System.out.println("Ten");
                break;

            case 20:
                System.out.println("Twenty");
                break;

            case 90:
                System.out.println("Ninety");
                break;

            default:
                System.out.println("Others");
                break;
        }
    }
}
