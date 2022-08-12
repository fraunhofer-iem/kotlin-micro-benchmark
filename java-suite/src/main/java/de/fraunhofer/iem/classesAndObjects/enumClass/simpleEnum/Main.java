package de.fraunhofer.iem.classesAndObjects.enumClass.simpleEnum;

/**
 * Demonstrates the usage simple Enum in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class Main {
    public static void main(String[] args) {
        print(Menu.CHICKEN_GRAVY);
        print(Menu.EGG_OMELET);
        print(Menu.CHICKEN_BIRYANI);
        print(Menu.VEG_PULAO);
    }

    /**
     * Demonstrates the usage of Enum in Switch statement in Java
     */
    public static void print(Menu menu) {
        switch (menu) {
            case CHICKEN_GRAVY:
                System.out.println("Chicken gravy: " + Menu.CHICKEN_GRAVY);
                break;
            case EGG_OMELET:
                System.out.println("Egg Omelet: " + Menu.EGG_OMELET);
                break;
            case CHICKEN_BIRYANI:
                System.out.println("Chicken biryani: " + Menu.CHICKEN_BIRYANI);
                break;
            case VEG_PULAO:
                System.out.println("Veg pulao: " + Menu.VEG_PULAO);
        }
    }
}
