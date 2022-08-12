package de.fraunhofer.iem.collections.iterators.listIterable;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Demonstrates the ListIterator in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();

        lst.add("Ranjith");
        lst.add("K");

        System.out.println("***********************************************");
        printForward(lst);
        System.out.println("***********************************************");

        appendSuffix(lst);

        System.out.println("***********************************************");
        printForward(lst);
        System.out.println("***********************************************");

        System.out.println("***********************************************");
        printBackward(lst);
        System.out.println("***********************************************");

        addMarker(lst);

        System.out.println("***********************************************");
        printForward(lst);
        System.out.println("***********************************************");

        removeMarker(lst);

        System.out.println("***********************************************");
        printForward(lst);
        System.out.println("***********************************************");
    }

    private static void appendSuffix(List<String> lst) {
        ListIterator<String> itr = lst.listIterator();

        while (itr.hasNext()) {
            String elem = itr.next();
            itr.set(elem + "-MARKER");
        }
    }

    private static void printForward(List<String> lst) {
        ListIterator<String> itr = lst.listIterator();

        while (itr.hasNext()) {
            String elem = itr.next();

            System.out.println("Element = \"" + elem + "\"\t:\tNextIndex = " + itr.nextIndex());
        }
    }

    private static void printBackward(List<String> lst) {
        ListIterator<String> itr = lst.listIterator();

        while (itr.hasNext()) {
            itr.next();
        }

        while (itr.hasPrevious()) {
            String elem = itr.previous();

            System.out.println("Element = \"" + elem + "\"\t:\tPreviousIndex = " + itr.previousIndex());
        }
    }

    private static void addMarker(List<String> lst) {
        ListIterator<String> itr = lst.listIterator();

        while (itr.hasNext()) {
            String elem = itr.next();
            if (!elem.equals("MARKER"))
                itr.add("MARKER");
        }
    }

    private static void removeMarker(List<String> lst) {
        ListIterator<String> itr = lst.listIterator();

        while (itr.hasNext()) {
            String elem = itr.next();

            if (elem.equals("MARKER"))
                itr.remove();
        }
    }
}
