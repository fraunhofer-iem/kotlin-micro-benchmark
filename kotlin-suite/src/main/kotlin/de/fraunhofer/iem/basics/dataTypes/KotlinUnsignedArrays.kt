package de.fraunhofer.iem.basics.dataTypes

/**
 * Demonstrates the UIntArray in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
@OptIn(ExperimentalUnsignedTypes::class)
fun main() {
    val num: UIntArray = UIntArray(5)
    num[0] = getUInt("int")
    num[1] = getUInt("int")
    num[2] = getUInt("int")
    num[3] = getUInt("int")
    num[4] = getUInt("int")

    println(num)
    println(num[0])
    println(num[1])
    println(num[2])
    println(num[3])
    println(num[4])

    dummy(num)
}

/**
 * Demonstrates the UIntArray as function parameter
 *
 * @author Ranjith Krishnamurthy
 */
@OptIn(ExperimentalUnsignedTypes::class)
fun dummy(num: UIntArray) {
    var dup: UIntArray = num.copyOf(10)
    for (elem in dup) {
        println(elem)
    }
}