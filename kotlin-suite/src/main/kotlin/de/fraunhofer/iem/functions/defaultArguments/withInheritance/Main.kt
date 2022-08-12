package de.fraunhofer.iem.functions.defaultArguments.withInheritance

/**
 * Demonstrate the usage of the functions with default value from the base class in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val twoInts: TwoInts = TwoInts()

    println(twoInts.add())
    println(twoInts.add(10))
    println(twoInts.add(10, 20))
    println(twoInts.add(num2 = 20, num4 = 40))
    println(twoInts.add(10, 20, 30, 40))


    println(twoInts.add10(10, num4 = 40))
    println(twoInts.add10(10, 20, num4 = 40))
    println(twoInts.add10(10, num3 = 30, num4 = 40))
    println(twoInts.add10(10, 20, 30, 40))
    println(twoInts.add10(num4 = 40, num1 = 10, num3 = 30, num2 = 20))

    println(twoInts.sub(100, 20, 30, 40))


    val twoIntsAdder = TwoIntsAdder()

    println(twoIntsAdder.add())
    println(twoIntsAdder.add(10))
    println(twoIntsAdder.add(10, 20))
    println(twoIntsAdder.add(num2 = 20, num4 = 40))
    println(twoIntsAdder.add(10, 20, 30, 40))


    println(twoIntsAdder.add10(10, num4 = 40))
    println(twoIntsAdder.add10(10, 20, num4 = 40))
    println(twoIntsAdder.add10(10, num3 = 30, num4 = 40))
    println(twoIntsAdder.add10(10, 20, 30, 40))
    println(twoIntsAdder.add10(num4 = 40, num1 = 10, num3 = 30, num2 = 20))
}