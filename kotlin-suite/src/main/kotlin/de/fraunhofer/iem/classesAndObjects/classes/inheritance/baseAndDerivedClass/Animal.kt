package de.fraunhofer.iem.classesAndObjects.classes.inheritance.baseAndDerivedClass

/**
 * Non-class that can be a superclass to another class because it is declared as open (In Java bytecode, this class will
 * be non-final class).
 *
 * @author Ranjith Krishnamurthy
 */
open class Animal(private val DNA: String) {
    /**
     * Derived class can override this method since it is a open method (In Java bytecode, its non-final method)
     */
    open fun makeNoise() {
        println("This is abstract animal sound!")
    }

    /**
     * Derived class can not override this method since it is a final method (not open method)
     */
    fun displayDNA() {
        println(DNA)
    }
}