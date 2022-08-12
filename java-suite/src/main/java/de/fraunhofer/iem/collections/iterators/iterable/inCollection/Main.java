package de.fraunhofer.iem.collections.iterators.iterable.inCollection;

import java.util.*;

/**
 * Demonstrates the iterators in Collection in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    private static void withIterators(Collection<String> collection) {
        Iterator<String> itr = collection.iterator();

        while (itr.hasNext()) {
            String elem = itr.next();
            System.out.println(elem);
        }
    }

    private static void withFor(Collection<String> collection) {

        for (String elem : collection) {
            System.out.println(elem);
        }
    }

    private static void withForEach(Collection<String> collection) {
        collection.forEach((String it) -> {
            String upStr = it.toUpperCase();
            System.out.println(upStr);
        });
    }

    public static void main(String[] args) {
        List<String> lst = new ArrayList<String>() {{
            add("Ranjith");
            add("K");
        }};
        Set<String> set = new HashSet<>(lst);

        withIterators(lst);
        withIterators(set);

        withFor(lst);
        withFor(set);

        withForEach(lst);
        withForEach(set);
    }
}
