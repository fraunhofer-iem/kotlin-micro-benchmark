package de.fraunhofer.iem.classesAndObjects.enumClass.enumWithAbstractMethods;

/**
 * Demonstrates the Enum with abstract methods in Java
 *
 * @author Ranjith Krishnamurthy
 */
public enum Menu {
    CHICKEN_GRAVY(120) {
        @Override
        public void print() {
            System.out.println("Chicken gravy costs " + this.price);
        }
    },
    EGG_OMELET(20) {
        @Override
        public void print() {
            System.out.println("Egg omelet costs " + this.price);
        }
    },
    CHICKEN_BIRYANI(250) {
        @Override
        public void print() {
            System.out.println("Chicken biryani costs " + this.price);
        }
    },
    VEG_PULAO(90) {
        @Override
        public void print() {
            System.out.println("Veg pulao costs " + this.price);
        }
    };

    public int price;

    Menu(int price) {
        this.price = price;
    }

    public abstract void print();
}
