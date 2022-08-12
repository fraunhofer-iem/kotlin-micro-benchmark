package de.fraunhofer.iem.classesAndObjects.classes.inheritance.baseAndDerivedClass

/**
 * Instantiation example for the baseAndDerivedClass example code
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