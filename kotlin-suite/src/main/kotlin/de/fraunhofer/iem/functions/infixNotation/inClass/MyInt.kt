package de.fraunhofer.iem.functions.infixNotation.inClass

/**
 * Demonstrate infix function in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
class MyInt(val number: Int) {
    infix fun add(secondNumber: MyInt): MyInt = MyInt(this.number + secondNumber.number)

    infix fun sub(secondNumber: MyInt): MyInt = MyInt(this.number - secondNumber.number)
}