package de.fraunhofer.iem.classesAndObjects.classes.inheritance.baseDerivedWithMultipleConstructor

/**
 * Instantiation example for the baseAndDerivedClass example code
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    displayAnimal(Cat())
    displayAnimal(Horse())
    displayAnimal(Dog())
}

private fun displayAnimal(animal: Animal) {
    animal.displayDNA()
    animal.makeNoise()
}