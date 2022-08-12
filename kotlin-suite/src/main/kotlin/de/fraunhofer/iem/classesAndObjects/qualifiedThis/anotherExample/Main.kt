package de.fraunhofer.iem.classesAndObjects.qualifiedThis.anotherExample

/**
 * Demonstrates the qualified this
 *
 * This example  is taken and modified from the https://kotlinlang.org/docs/this-expressions.html
 *
 * @author Ranjith Krishnamurthy
 */
class A { // implicit label @A
    private val aName: String = "A"

    inner class B { // implicit label @B
        private val bName: String = "B"
        val funLit = lambda@ fun String.() {
            val d = this // funLit's receiver
            val e = uppercase()

            println("A\$B >> bFoo >> funLit >> this = $d")
            println("A\$B >> bFoo >> funLit >> uppercase (implicit this) = $e")
            println("A\$B >> bFoo >> funLit >> this@A = ${this@A.aName}")
            println("A\$B >> bFoo >> funLit >> this@B = ${this@B.bName}")
        }

        val funLit2 = { s: String ->
            // B since outer scope is B
            val d1 = this

            println("<<< Calling funLit>>>")
            "Ranjith".funLit()
            println("<<< Ending funLit>>>")

            println("A\$B >> bFoo >> funLit2 >> this = $d1")
            println("A\$B >> bFoo >> funLit2 >> this@A = ${this@A.aName}")
            println("A\$B >> bFoo >> funLit2 >> this@B = ${this@B.bName}")
        }
    }
}

fun main() {
    val a = A()
    val b = a.B()

    b.funLit2("Ranjith")
}