package de.fraunhofer.iem.classesAndObjects.classes.abstractClass

/**
 * Class that extends Animal
 *
 * @author Ranjith Krishnamurthy
 */
class Dog(DNA: String) : Animal(DNA) {
    override fun makeNoise() {
        println("Bow Bow")
    }
}