package de.fraunhofer.iem.generics.wildCardTypeArgument;

/**
 * Demonstrates the wildcard type parameter in function
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        DifferentTypedPair<Integer, String> ob1 = new DifferentTypedPair<>(5485, "Ranjith");
        DifferentTypedPair<Integer, StringBuilder> ob2 = new DifferentTypedPair<>(5485, new StringBuilder("Ranjith"));
        DifferentTypedPair<Integer, StringBuffer> ob3 = new DifferentTypedPair<>(5485, new StringBuffer("Ranjith"));

        print(ob1);
        print(ob2);
        print(ob3);

        demo();

        DifferentTypedPair<Object, Object> ob4 = new DifferentTypedPair<>(new Object(), new Object());

        System.out.println("Before first = " + ob4.getFirst());
        System.out.println("Before second = " + ob4.getSecond());

        resetToDefault(ob4);

        System.out.println("After first = " + ob4.getFirst());
        System.out.println("After second = " + ob4.getSecond());
    }

    /**
     * Co-variant wildcard (Producer)
     */
    public static void print(DifferentTypedPair<? extends Number, ? extends CharSequence> ob) {
        int firstAsInt = ob.getFirst().intValue();
        char firstCharInSecond = ob.getSecond().charAt(0);

        System.out.println(firstAsInt);
        System.out.println(firstCharInSecond);
    }

    /**
     * Contr-variant (Consumer)
     */
    public static void resetToDefault(DifferentTypedPair<? super Number, ? super CharSequence> ob) {
        ob.setFirst(0);
        ob.setSecond("Anonymous");
    }

    /**
     * Demonstrates the usage of the member function of a generic class that uses the wild card type parameter
     */
    public static void demo() {
        DifferentTypedPair<Number, CharSequence> ob1 = new DifferentTypedPair<>(5485, "Ranjith");
        DifferentTypedPair<Integer, StringBuffer> ob2 = new DifferentTypedPair<>(9568457, new StringBuffer("Anonymous"));

        System.out.println("Before first = " + ob1.getFirst());
        System.out.println("Before second = " + ob1.getSecond());

        ob1.replace(ob2);

        System.out.println("After first = " + ob1.getFirst());
        System.out.println("After second = " + ob1.getSecond());
    }
}
