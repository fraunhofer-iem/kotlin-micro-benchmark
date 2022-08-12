package de.fraunhofer.iem.classesAndObjects.interfaceInJava.interfaceInheritance;

/**
 * Access of the class that implements the interface that has multiple inheritance
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.crawl();
        person.walk();
        person.run();
    }
}
