package de.fraunhofer.iem.uniqueToKotlin.operatorOverloading.simpleExample

/**
 * Demonstrates the usage of the custom operators (Operator overloading) in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    println("Unary Operator")
    println(+MyInt(-200))
    println(+MyInt(250))
    println(-MyInt(-200))
    println(-MyInt(250))
    println(!MyInt(100))
    println(!MyInt(0))
    println(!MyInt(-100))

    println("Increment and Decrement")
    var myInt1: MyInt = MyInt(100)
    println(myInt1)
    println(++myInt1)
    println(myInt1)
    println(myInt1++)
    println(myInt1)
    println(--myInt1)
    println(myInt1)
    println(myInt1--)
    println(myInt1)

    println("Binary Operator")
    myInt1 = MyInt(100)
    val myInt2: MyInt = MyInt(200)
    println(myInt1 + myInt2)
    println(myInt1 - myInt2)
    println(myInt1 / myInt2)
    println(myInt1 * myInt2)
    println(myInt1 % myInt2)

    println("in operator")
    println(myInt1 in myInt2)
    println(myInt1 !in myInt2)
    println(myInt1 in MyInt(100))
    println(myInt1 !in MyInt(100))
}