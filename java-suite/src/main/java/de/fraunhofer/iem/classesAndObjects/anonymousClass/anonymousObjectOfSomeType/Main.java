package de.fraunhofer.iem.classesAndObjects.anonymousClass.anonymousObjectOfSomeType;

/**
 * Demonstrate the anonymous class of different types
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static String name = "Ranjith";

    public static void main(String[] args) {
        // Anonymous class of HelloWorldPrinter class
        HelloWorldPrinter ob1 = new HelloWorldPrinter() {
            @Override
            public void greet() {
                System.out.println("Hello!! " + name);
            }
        };

        printHelloWorld(ob1);

        // Anonymous class of PrintAnything class
        PrintAnything ob2 = new PrintAnything() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };

        printAnythingFunction(ob2);
    }

    private static void printHelloWorld(HelloWorldPrinter helloWorldPrinter) {
        helloWorldPrinter.greet();
    }

    private static void printAnythingFunction(PrintAnything printAnything) {
        printAnything.print("Hi, how are you?");
    }
}
