package de.fraunhofer.iem.generics.upperBounds.inGenericClass;

/**
 * demonstrates the usage of upper bounds in generics class in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        CustomPair<Integer, String> pair = new CustomPair<Integer, String>(20, "Ranjith");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
