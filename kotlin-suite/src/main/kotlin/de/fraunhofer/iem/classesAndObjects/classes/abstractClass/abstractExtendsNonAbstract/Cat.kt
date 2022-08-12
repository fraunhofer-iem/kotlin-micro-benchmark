package de.fraunhofer.iem.classesAndObjects.classes.abstractClass.abstractExtendsNonAbstract

/**
 * Class that extends Animal
 *
 * @author Ranjith Krishnamurthy
 */
class Cat(DNA: String) : Animal(DNA) {
    override fun makeNoise() {
        println("Meow")
    }
}