package de.fraunhofer.iem.uniqueToKotlin.operatorOverloading.simpleExample

/**
 * Demonstrates the operator overloading in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
class MyInt(var myInt: Int) {
    // Unary Operator
    operator fun unaryPlus(): MyInt = MyInt(+this.myInt)
    operator fun unaryMinus(): MyInt = MyInt(-this.myInt)
    operator fun not(): MyInt = MyInt(if (this.myInt != 0) 0 else 1)

    // Increment and Decrement
    operator fun inc(): MyInt = MyInt(this.myInt + 1)
    operator fun dec(): MyInt = MyInt(this.myInt - 1)

    // Binary Operator
    operator fun plus(secondNumber: MyInt): MyInt = MyInt(this.myInt + secondNumber.myInt)
    operator fun minus(secondNumber: MyInt): MyInt = MyInt(this.myInt - secondNumber.myInt)
    operator fun div(secondNumber: MyInt): MyInt = MyInt(this.myInt / secondNumber.myInt)
    operator fun times(secondNumber: MyInt): MyInt = MyInt(this.myInt * secondNumber.myInt)
    operator fun rem(secondNumber: MyInt): MyInt = MyInt(this.myInt % secondNumber.myInt)
    // TODO: operator fun rangeTo(secondNumber: MyInt)

    // in operator
    operator fun contains(secondNumber: MyInt) = this.myInt == secondNumber.myInt

    override fun toString(): String {
        return this.myInt.toString()
    }
}