package de.fraunhofer.iem.collections.collection;

import java.util.*;

/**
 * Demonstrates the different collections and maps in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    static List<String> myName = Arrays.asList("Ranjith", "K");

    public static void printMyCollection(Collection<String> collection) {
        for (String elem : collection) {
            System.out.println(elem);
        }
    }

    public static void printMyMap(Map<Integer, String> map) {
        for (int key : map.keySet()) {
            System.out.println(key + " : " + map.get(key));
        }
    }

    public static void main(String[] args) {
        printMyCollection(getList());
        printMyCollection(getArrayList());
        printMyCollection(getLinkedList());
        printMyCollection(getVector());
        printMyCollection(getQueue());
        printMyCollection(getPriorityQueue());
        printMyCollection(getDeque());
        printMyCollection(getArrayDeque());
        printMyCollection(getSet());
        printMyCollection(getHashSet());
        printMyCollection(getLinkedHashSet());
        printMyCollection(getSortedSet());
        printMyCollection(getTreeSet());

        printMyMap(getMap());
        printMyMap(getHashMap());
        printMyMap(getLinkedHashMap());
        printMyMap(getTreeMap());
    }

    private static List<String> getList() {
        return new ArrayList<>(myName);
    }

    private static ArrayList<String> getArrayList() {
        return new ArrayList<>(myName);
    }

    private static LinkedList<String> getLinkedList() {
        return new LinkedList<>(myName);
    }

    private static Vector<String> getVector() {
        return new Vector<>(myName);
    }

    private static Queue<String> getQueue() {
        return new PriorityQueue<>(myName);
    }

    private static PriorityQueue<String> getPriorityQueue() {
        return new PriorityQueue<>(myName);
    }

    private static Deque<String> getDeque() {
        return new ArrayDeque<>(myName);
    }

    private static ArrayDeque<String> getArrayDeque() {
        return new ArrayDeque<>(myName);
    }

    private static Set<String> getSet() {
        return new HashSet<>(myName);
    }

    private static HashSet<String> getHashSet() {
        return new HashSet<>(myName);
    }

    private static LinkedHashSet<String> getLinkedHashSet() {
        return new LinkedHashSet<>(myName);
    }

    private static SortedSet<String> getSortedSet() {
        return new TreeSet<>(myName);
    }

    private static TreeSet<String> getTreeSet() {
        return new TreeSet<>(myName);
    }

    private static Map<Integer, String> getMap() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Ranjith");
        map.put(2, "K");

        return map;
    }

    private static HashMap<Integer, String> getHashMap() {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Ranjith");
        map.put(2, "K");

        return map;
    }

    private static LinkedHashMap<Integer, String> getLinkedHashMap() {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(1, "Ranjith");
        map.put(2, "K");

        return map;
    }

    private static TreeMap<Integer, String> getTreeMap() {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1, "Ranjith");
        map.put(2, "K");

        return map;
    }
}
