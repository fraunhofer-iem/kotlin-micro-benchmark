package de.fraunhofer.iem.basics.helloWorld;

/**
 * Demonstrates the simple hello world program with the class that contains name property
 *
 * @author Ranjith Krishnamurthy
 */
public class PrintHelloWithClassProperty {
    /**
     * Name property
     */
    private final String name;

    /**
     * Constructors that initialize the name property
     *
     * @param name Name
     */
    public PrintHelloWithClassProperty(String name) {
        this.name = name;
    }

    /**
     * Prints the Hello world using the name property
     */
    public void printHello() {
        System.out.println("Hello " + name + "!!!");
    }

    /**
     * Main method
     *
     * @param args Command line argument
     */
    public static void main(String[] args) {
        PrintHelloWithClassProperty printer = new PrintHelloWithClassProperty("Ranjith");
        printer.printHello();
    }
}
