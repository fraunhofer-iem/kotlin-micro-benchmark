package de.fraunhofer.iem.basics.equality.withoutEqualsAndHashCode;

/**
 * Demonstrate the structural and referential equality on the class that does not implement equals and hashcode in Java
 *
 * Note:
 * 1. In this case, structural equality behave like a referential equality
 * 2. Structural equality uses default Object's equals that behaves like a referential equality
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        Person ranjith1 = new Person(
                "Ranjith",
                "Street 102",
                100,
                "+49 99999 9999"
        );

        Person ranjith2 = new Person(
                "Ranjith",
                "Street 102",
                100,
                "+49 99999 9999"
        );

        Person ranjith3 = new Person(
                "Ranjith3",
                "Street 1023",
                1003,
                "+49 99999 999933"
        );

        System.out.println(ranjith1 == ranjith2);
        System.out.println(ranjith1 == ranjith3);
        System.out.println(ranjith1 == ranjith1);

        System.out.println(ranjith1.equals(ranjith2));
        System.out.println(ranjith1.equals(ranjith3));
        System.out.println(ranjith1.equals(ranjith1));
    }
}
