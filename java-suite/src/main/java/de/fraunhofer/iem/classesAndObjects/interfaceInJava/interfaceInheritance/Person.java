package de.fraunhofer.iem.classesAndObjects.interfaceInJava.interfaceInheritance;

/**
 * Implements the interface that has multiple inheritance
 *
 * @author Ranjith Krishnamurthy
 */
public class Person implements Movable {
    @Override
    public void jog() {
        System.out.println("Jogging");
    }

    @Override
    public void run() {
        System.out.println("Running");
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }

    @Override
    public void crawl() {
        System.out.println("Crawling");
    }
}
