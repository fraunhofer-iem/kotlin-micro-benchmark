package de.fraunhofer.iem.collections.iterators.iterable.inCustomClass;

import java.util.Iterator;

/**
 * Demonstrates the usage of the custom class that implements the Iterable in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        FiveInts fiveInts = new FiveInts(1, 2, 3, 4, 5);

        Iterator<Integer> itr = fiveInts.iterator();

        while (itr.hasNext()) {
            int elem = itr.next();
            System.out.println(elem);

            try {
                itr.remove();
            } catch (UnsupportedOperationException ex) {
                System.out.println("Remove function can not be called on FiveInts");
            }
            itr.forEachRemaining(System.out::println);
        }

        fiveInts.forEach(System.out::println);
    }
}
