package de.fraunhofer.iem.classesAndObjects.qualifiedThis

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
        fun Int.bFoo() { // implicit label @foo
            val a = this@A.aName// A's this
            val b = this@B.bName // B's this

            val c = this // foo()'s receiver, an Int
            val c1 = this@bFoo // foo()'s receiver, an Int

            println("A\$B >> bFoo >> this@A = $a")
            println("A\$B >> bFoo >> this@B = $b")
            println("A\$B >> bFoo >> this = $c")
            println("A\$B >> bFoo >> this@bFoo = $c1")

            val funLit = lambda@ fun String.() {
                val d = this // funLit's receiver
                val e = uppercase()

                println("A\$B >> bFoo >> funLit >> this = $d")
                println("A\$B >> bFoo >> funLit >> uppercase (implicit this) = $e")
                println("A\$B >> bFoo >> funLit >> this@A = ${this@A.aName}")
                println("A\$B >> bFoo >> funLit >> this@B = ${this@B.bName}")
                println("A\$B >> bFoo >> funLit >> this@bFoo = ${this@bFoo}")
            }

            val funLit2 = { s: String ->
                // foo()'s receiver, since enclosing lambda expression
                // doesn't have any receiver
                val d1 = this

                println("<<< Calling funLit>>>")
                "Ranjith".funLit()
                println("<<< Ending funLit>>>")

                println("A\$B >> bFoo >> funLit2 >> this = $d1")
                println("A\$B >> bFoo >> funLit2 >> this@A = ${this@A.aName}")
                println("A\$B >> bFoo >> funLit2 >> this@B = ${this@B.bName}")
                println("A\$B >> bFoo >> funLit2 >> this@bFoo = ${this@bFoo}")
            }

            println("<<< Calling funList2>>>")
            funLit2("Ranjith Krishnamurthy")
            println("<<< Ending funLit2>>>")
        }

        fun callBFunc() {
            println("<<< Calling bFoo>>>")
            2.bFoo()
            println("<<< Ending bFoo>>>")
        }
    }

    fun Int.aFoo() { // implicit label @foo
        val a = this@A.aName // A's this

        val c = this // foo()'s receiver, an Int
        val c1 = this@aFoo // foo()'s receiver, an Int

        println("A >> aFoo >> this@A = $a")
        println("A >> aFoo >> this = $c")
        println("A >> aFoo >> this@aFoo = $c1")

        val funLit = lambda@ fun String.() {
            val d = this // funLit's receiver
            val e = uppercase()

            println("A >> aFoo >> funLit >> this = $d")
            println("A >> aFoo >> funLit >> uppercase (implicit this) = $e")
            println("A >> aFoo >> funLit >> this@A = ${this@A.aName}")
            println("A >> aFoo >> funLit >> this@aFoo = ${this@aFoo}")
        }

        val funLit2 = { s: String ->
            // foo()'s receiver, since enclosing lambda expression
            // doesn't have any receiver
            val d1 = this

            println("<<< Calling funLit>>>")
            "Ranjith".funLit()
            println("<<< Ending funLit>>>")

            println("A >> aFoo >> funLit2 >> this = $d1")
            println("A >> aFoo >> funLit2 >> this@A = ${this@A.aName}")
            println("A >> aFoo >> funLit2 >> this@bFoo = ${this@aFoo}")
        }

        println("<<< Calling funLit2>>>")
        funLit2("Ranjith Krishnamurthy")
        println("<<< Ending funList2>>>")
    }

    fun callAFunc() {
        println("<<< Calling aFoo>>>")
        2.aFoo()
        println("<<< Ending aFoo>>>")
    }
}

fun main() {
    val a = A()
    val b = a.B()

    println("<<< Calling callAFunc>>>")
    a.callAFunc()
    println("<<< Ending callAFunc>>>")
    println("<<< Calling callBFunc>>>")
    b.callBFunc()
    println("<<< Ending callAFunc>>>")
}