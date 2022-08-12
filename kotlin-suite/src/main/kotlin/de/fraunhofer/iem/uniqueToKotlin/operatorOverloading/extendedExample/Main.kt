package de.fraunhofer.iem.uniqueToKotlin.operatorOverloading.extendedExample

import de.fraunhofer.iem.uniqueToKotlin.operatorOverloading.simpleExample.MyInt

/**
 * Demonstrates the operator overloading for MyInt class and defined as extension functions
 *
 * @author Ranjith Krishnamurthy
 */
// indexed access operator
operator fun MyInt.get(index: Int): Int {
    if (index != 0)
        println("Invalid Index. Index must be 0")

    return this.myInt
}

// invoke operator
operator fun MyInt.invoke(): Unit {
    println("Printing MyInt = ${this.myInt}")
}

// Augmented assignment
operator fun MyInt.plusAssign(secondNumber: MyInt): Unit {
    this.myInt += secondNumber.myInt
}

operator fun MyInt.minusAssign(secondNumber: MyInt): Unit {
    this.myInt -= secondNumber.myInt
}

operator fun MyInt.timesAssign(secondNumber: MyInt): Unit {
    this.myInt *= secondNumber.myInt
}

operator fun MyInt.divAssign(secondNumber: MyInt): Unit {
    this.myInt /= secondNumber.myInt
}

operator fun MyInt.remAssign(secondNumber: MyInt): Unit {
    this.myInt %= secondNumber.myInt
}

// Comparison operators
operator fun MyInt.compareTo(secondNumber: MyInt): Int {
    if (this.myInt > secondNumber.myInt)
        return 1

    if (this.myInt < secondNumber.myInt)
        return -1

    return 0
}

fun main() {
    val myInt = MyInt(250)

    println(myInt[1])
    println(myInt[0])

    myInt()

    println(myInt)

    myInt += MyInt(50)
    println(myInt)
    myInt -= MyInt(50)
    println(myInt)
    myInt *= MyInt(50)
    println(myInt)
    myInt /= MyInt(50)
    println(myInt)
    myInt %= MyInt(50)
    println(myInt)
}