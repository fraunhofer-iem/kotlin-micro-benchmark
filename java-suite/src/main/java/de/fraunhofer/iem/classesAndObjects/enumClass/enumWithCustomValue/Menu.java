package de.fraunhofer.iem.classesAndObjects.enumClass.enumWithCustomValue;

/**
 * Demonstrates the Enum in Java that stores a custom value
 *
 * @author Ranjith Krishnamurthy
 */
public enum Menu {
    CHICKEN_GRAVY(120),
    EGG_OMELET(20),
    CHICKEN_BIRYANI(250),
    VEG_PULAO(90);

    public int price;

    Menu(int price) {
        this.price = price;
    }
}
