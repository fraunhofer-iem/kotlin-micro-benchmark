package de.fraunhofer.iem.classesAndObjects.classes.abstractClass.abstractExtendsNonAbstract

/**
 * Abstract class extends the non-abstract class
 *
 * @author Ranjith Krishnamurthy
 */
abstract class Animal(private val DNA: String) : NoiseBox() {
    abstract override fun makeNoise()
    fun displayDNA() {
        println(DNA)
    }
}