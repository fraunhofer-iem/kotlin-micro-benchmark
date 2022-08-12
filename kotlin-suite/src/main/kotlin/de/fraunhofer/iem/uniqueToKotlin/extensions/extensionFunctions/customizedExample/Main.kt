package de.fraunhofer.iem.uniqueToKotlin.extensions.extensionFunctions.customizedExample

/**
 * Demonstrates the new extension function with 0 parameter
 *
 * @author Ranjith Krishnamurthy
 */
fun TwoInts.sub(): Int {
    return this.firstNumber - this.secondNumber
}

/**
 * Demonstrates the new extension function with 1 parameter
 *
 * @author Ranjith Krishnamurthy
 */
fun TwoInts.divWithFirst(divisor: Int): Double {
    this.myExt()
    return this.firstNumber.toDouble() / divisor.toDouble()
}

/**
 * Demonstrates the extension function that is shadowed by the member function with the same function name
 *
 * @author Ranjith Krishnamurthy
 */
fun TwoInts.add(): Int {
    println("Extension function add")
    return this.firstNumber + this.secondNumber
}

/**
 * To demonstrate that extension function are dispatched statically
 *
 * @author Ranjith Krishnamurthy
 */
fun TwoObjects.print() {
    println("This is the Class that can store two Any objects")
}

/**
 * To demonstrate that extension function are dispatched statically
 *
 * @author Ranjith Krishnamurthy
 */
fun TwoInts.print() {
    println("This is the Derived Class that can store two Int objects")
}

/**
 * To demonstrate the extension function on null
 *
 * @author Ranjith Krishnamurthy
 */
fun Any?.changeToString(): String {
    if (this == null)
        return "GivenObjectIsNull"

    return this.toString()
}

/**
 * Demonstrates that extension function are dispatched statically.
 *
 * Even if you pass TwoInt object to this function, it still prints the TwoObject extension function print(), because
 * In Kotlin, extension functions are dispatched statically.
 *
 * @author Ranjith Krishnamurthy
 */
fun printTwoAny(ob: TwoObjects) {
    ob.print()
}

/**
 * Demonstrates the usage of the extension function
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val twoInts: TwoInts = TwoInts(10, 20)

    println(twoInts.add())  // Calls the normal member function not the extension function
    println(twoInts.sub())  // Calls the extension function
    println(twoInts.divWithFirst(2))    // Calls the extension function

    printTwoAny(twoInts)    // Even though we passed TwoInt object, still it prints the value from TwoObject extension function
    // because, statically, the function printTwoAny takes the type of TwoObjects

    println(twoInts.changeToString())   // Normal extension function call
    println(null.changeToString())      // Valid call
}