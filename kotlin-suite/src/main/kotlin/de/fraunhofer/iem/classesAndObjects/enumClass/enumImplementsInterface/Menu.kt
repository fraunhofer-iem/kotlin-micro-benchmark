package de.fraunhofer.iem.classesAndObjects.enumClass.enumImplementsInterface

/**
 * Demonstrates the Enum that implements interface in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
enum class Menu(val price: Int) : MenuPrinter {
    CHICKEN_GRAVY(120) {
        override fun print() {
            println("Chicken gravy costs $price")
        }
    },
    EGG_OMELET(20) {
        override fun print() {
            println("Egg omelet costs $price")
        }
    },
    CHICKEN_BIRYANI(250) {
        override fun print() {
            println("Chicken biryani costs $price")
        }
    },
    VEG_PULAO(90) {
        override fun print() {
            println("Veg pulao costs $price")
        }
    };
}