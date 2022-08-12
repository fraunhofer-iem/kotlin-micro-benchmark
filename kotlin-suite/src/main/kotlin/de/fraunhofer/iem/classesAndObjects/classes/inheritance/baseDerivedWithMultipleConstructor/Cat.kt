package de.fraunhofer.iem.classesAndObjects.classes.inheritance.baseDerivedWithMultipleConstructor

/**
 * Inherit the Animal class and can override makeNoise method
 *
 *
 * Note:
 * 1. Two constructor calls different super class constructor
 *
 * @author Ranjith Krishnamurthy
 */
class Cat : Animal {
    constructor(DNA: String) : super(DNA)

    constructor() : super()

    override fun makeNoise() {
        println("Meow")
    }
}