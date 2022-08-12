package de.fraunhofer.iem.classesAndObjects.classes.inheritance.baseDerivedWithMultipleConstructor

/**
 * Inherit the Animal class and can override makeNoise method
 *
 *
 * Note:
 * 1. Both the constructor calls the same super class constructor
 *
 * @author Ranjith Krishnamurthy
 */
class Dog : Animal {
    constructor(DNA: String) : super(DNA)

    constructor() : super("AAATGTG")

    override fun makeNoise() {
        println("Bow Bow")
    }
}