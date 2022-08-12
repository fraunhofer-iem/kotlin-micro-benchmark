package de.fraunhofer.iem.classesAndObjects.enumClass.enumWithCustomValue;

/**
 * Demonstrates the usage Enum in Java
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
     * Demonstrates the usage of Enum in Switch statement in Java and access of the custom values
     */
    public static void print(Menu menu) {
        switch (menu) {
            case CHICKEN_GRAVY:
                System.out.println("Chicken gravy: " + Menu.CHICKEN_GRAVY + " : " + menu.price);
                break;
            case EGG_OMELET:
                System.out.println("Egg Omelet: " + Menu.EGG_OMELET + " : " + menu.price);
                break;
            case CHICKEN_BIRYANI:
                System.out.println("Chicken biryani: " + Menu.CHICKEN_BIRYANI + " : " + menu.price);
                break;
            case VEG_PULAO:
                System.out.println("Veg pulao: " + Menu.VEG_PULAO + " : " + menu.price);
        }
    }
}
