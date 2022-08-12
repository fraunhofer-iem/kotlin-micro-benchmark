package de.fraunhofer.iem.classesAndObjects.enumClass.anonymousClassInEnum

/**
 * Demonstrates the anonymous class in Enum in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
enum class Menu(val price: Int) {
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

    abstract fun print()
}