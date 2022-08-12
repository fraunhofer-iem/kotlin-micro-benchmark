package de.fraunhofer.iem.classesAndObjects.classes.inheritance.baseDerivedWithMultipleConstructor

/**
 * Inherit the Animal class and can override makeNoise method
 *
 *
 * Note:
 * 1. One constructor calls the super class constructor
 * 2. Second constructor calls the first constructor but not the super class constructor
 *
 * @author Ranjith Krishnamurthy
 */
class Horse constructor(DNA: String) : Animal(DNA) {
    constructor() : this("GGAAACT")

    override fun makeNoise() {
        println("Neigh")
    }
}