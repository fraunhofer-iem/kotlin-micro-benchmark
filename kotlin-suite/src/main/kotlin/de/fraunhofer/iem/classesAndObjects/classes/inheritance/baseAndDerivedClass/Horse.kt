package de.fraunhofer.iem.classesAndObjects.classes.inheritance.baseAndDerivedClass

/**
 * Inherit the Animal class and can override makeNoise method
 *
 * @author Ranjith Krishnamurthy
 */
class Horse(DNA: String) : Animal(DNA) {
    override fun makeNoise() {
        println("Neigh")
    }
}