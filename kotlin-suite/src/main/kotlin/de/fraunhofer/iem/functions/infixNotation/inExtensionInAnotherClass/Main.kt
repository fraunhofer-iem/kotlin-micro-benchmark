package de.fraunhofer.iem.functions.infixNotation.inExtensionInAnotherClass

class Main {
    private val appName = "MyApp"

    /**
     * Demonstrate the infix function defined as extension function in another class in Kotlin
     *
     * @author Ranjith Krishnamurthy
     */
    infix fun MyInt.add(secondNumber: MyInt): MyInt {
        println(this@Main.appName)
        println(this.number)
        println(secondNumber.number)
        return MyInt(this.number + secondNumber.number)
    }

    /**
     * Demonstrate the infix function defined as extension function in another class in Kotlin
     *
     * @author Ranjith Krishnamurthy
     */
    infix fun MyInt.sub(secondNumber: MyInt): MyInt {
        println(this@Main.appName)
        println(this.number)
        println(secondNumber.number)
        return MyInt(this.number - secondNumber.number)
    }

    fun addAndSub(num1: MyInt, num2: MyInt) {
        println((num1 add num2).number)
        println((num1 sub num2).number)
    }
}


/**
 * Demonstrate the usage of the infix function defined as extension function in another class in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    Main().addAndSub(MyInt(10), MyInt(20))
}