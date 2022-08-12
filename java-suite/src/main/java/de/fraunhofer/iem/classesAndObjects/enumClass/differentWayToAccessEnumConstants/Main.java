package de.fraunhofer.iem.classesAndObjects.enumClass.differentWayToAccessEnumConstants;

import de.fraunhofer.iem.classesAndObjects.enumClass.enumImplementsInterface.Menu;

/**
 * Demonstrates the different ways to access the Enum constant in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        Menu menu1 = Menu.valueOf("CHICKEN_GRAVY");
        Menu menu2 = Menu.values()[1];
        Menu menu3 = Menu.VEG_PULAO;

        System.out.println(menu1);
        System.out.println(menu1.name());
        System.out.println(menu1.ordinal());

        System.out.println(menu2);
        System.out.println(menu2.name());
        System.out.println(menu2.ordinal());

        System.out.println(menu3);
        System.out.println(menu3.name());
        System.out.println(menu3.ordinal());

        try {
            Menu.valueOf("DUMMY");
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getClass().getName() + " : " + e.getMessage());
        }
    }
}
