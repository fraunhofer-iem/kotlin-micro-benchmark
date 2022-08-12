package de.fraunhofer.iem.classesAndObjects.classes.abstractClass

/**
 * Demonstrate the abstract class
 *
 * @author Ranjith Krishnamurthy
 */
abstract class Animal(private val DNA: String) {
    abstract fun makeNoise()
    fun displayDNA() {
        println(DNA)
    }
}