package de.fraunhofer.iem.classesAndObjects.classes.abstractClass

/**
 * Demonstrates the usage of abstract class
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    displayAnimal(Cat("AAATGC"))
    displayAnimal(Horse("ATTCG"))
    displayAnimal(Dog("CGTTA"))
}

private fun displayAnimal(animal: Animal) {
    animal.displayDNA()
    animal.makeNoise()
}