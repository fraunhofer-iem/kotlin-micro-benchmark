package de.fraunhofer.iem.classesAndObjects.enumClass.enumWithCustomValue

/**
 * Demonstrates the simple Enum in Kotlin that stores a custom value
 *
 * @author Ranjith Krishnamurthy
 */
enum class Menu(val price: Int) {
    CHICKEN_GRAVY(120),
    EGG_OMELET(20),
    CHICKEN_BIRYANI(250),
    VEG_PULAO(90)
}