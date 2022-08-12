package de.fraunhofer.iem.classesAndObjects.classes.abstractClass.abstractExtendsNonAbstract

/**
 * An open class, that means this class can be extended in other class.
 *
 * @author Ranjith Krishnamurthy
 */
open class NoiseBox {
    open fun makeNoise() {
        println("This is abstract noise box")
    }
}