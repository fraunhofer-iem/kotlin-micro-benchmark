package de.fraunhofer.iem.classesAndObjects.classes.abstractClass.abstractExtendsNonAbstract

/**
 * Demonstrates the usage of the abstract class that extends the non-abstract class
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val animal: Animal = Cat("AAATGC")
    animal.makeNoise()
    animal.displayDNA()
    NoiseBox().makeNoise()
}