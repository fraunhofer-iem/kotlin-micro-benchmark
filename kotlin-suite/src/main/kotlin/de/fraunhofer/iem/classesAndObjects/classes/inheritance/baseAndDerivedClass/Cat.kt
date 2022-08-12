package de.fraunhofer.iem.classesAndObjects.classes.inheritance.baseAndDerivedClass

/**
 * Inherit the Animal class and can override makeNoise method
 *
 * @author Ranjith Krishnamurthy
 */
class Cat(DNA: String) : Animal(DNA) {
    override fun makeNoise() {
        println("Meow")
    }
}