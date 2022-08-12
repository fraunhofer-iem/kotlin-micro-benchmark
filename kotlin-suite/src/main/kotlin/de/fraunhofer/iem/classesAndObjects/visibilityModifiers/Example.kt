package de.fraunhofer.iem.classesAndObjects.visibilityModifiers

/**
 * Demonstrates the visibility modifiers in Kotlin
 *
 * Note:
 * 1. This example is taken from the https://kotlinlang.org/docs/visibility-modifiers.html
 *
 * @author Ranjith Krishnamurthy
 */
open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4

    internal class Nested {
        public val e: Int = 5
    }
}

class Subclass : Outer() {
    // a is not visible
    // b, c and d are visible
    // Nested and e are visible

    override val b = Nested().e   // 'b' is protected

    fun display() {
        // a is not visible here
        // System.out.println(this.a);
        println(b)
        println(d)
        println(Nested::class.java)
        println(Nested().e)
    }

}

class Unrelated(o: Outer) {
    // o.a, o.b are not visible
    // o.c and o.d are visible (same module)
    // Outer.Nested is not visible, and Nested::e is not visible either

    // System.out.println(this.a);
    // System.out.println(this.b);
    // System.out.println(this.d);

    // System.out.println(this.a);
    // System.out.println(this.b);
    // System.out.println(this.d);
    //println(Outer::Nested)
    // System.out.println(new Outer.Nested().e);
}