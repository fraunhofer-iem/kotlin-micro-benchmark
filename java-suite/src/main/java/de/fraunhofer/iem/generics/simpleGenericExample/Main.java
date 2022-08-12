package de.fraunhofer.iem.generics.simpleGenericExample;

/**
 * demonstrates the usage of generics in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        CustomPair<Integer> pair = new CustomPair<Integer>(20, 30);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        CustomPair<String> secondPair = new CustomPair<String>("Ranjith", "K");
        System.out.println(secondPair.getFirst());
        System.out.println(secondPair.getSecond());
    }
}
