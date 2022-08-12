package de.fraunhofer.iem.basics.dataTypes

import de.fraunhofer.iem.functions.defaultArguments.withInheritance.TwoInts
import java.util.concurrent.atomic.LongAdder

/**
 * Demonstrates Kotlin array
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val arr: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println(arr[0])
    println(arr.get(1))

    arr[0] = 10
    arr.set(1, 10)

    println(arr[0])
    println(arr.get(1))

    waysToCreateArray()
}

/**
 * Demonstrates the different ways to create Array in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun waysToCreateArray() {
    val arr1: Array<Any?> = arrayOf(1, "ranjith", 'r', 5454.5151, 55U, 65446L)
    println(arr1)   // Prints the Hash value

    val arr2: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println(arr2)   // Prints the Hash value

    // Likewise Kotlin provides different primitive array type
    val arr3: CharArray = charArrayOf('r', 'a', 'n', 'j', 'i', 't', 'h')
    println(arr3)

    val arr4: Array<Int?> = Array<Int?>(5) { i -> if (i in 1..3) i * 20 else null }
    println(arr4)

    iteratingArray1(Array<Int>(5) { 10 })
    iteratingArray2(arr4)
    iteratingArray3(arr4)
}

/**
 * Demonstrates the iterate the array using in operator
 *
 * @author Ranjith Krishnamurthy
 */
fun iteratingArray1(arr: Array<Int>) {
    for (elem in arr) {
        println(elem)
    }
}

/**
 * Demonstrates the iterate the array using until operator
 *
 * @author Ranjith Krishnamurthy
 */
fun iteratingArray2(arr: Array<Int?>) {
    for (index in 0 until arr.size) {
        println(arr[index])
    }
}

/**
 * Demonstrates the iterate the array range in operator
 *
 * @author Ranjith Krishnamurthy
 */
fun iteratingArray3(arr: Array<Int?>) {
    for (index in 0..arr.size - 1) {
        println(arr[index])
    }
}

/**
 * Demonstrates the primitive array type
 *
 * @author Ranjith Krishnamurthy
 */
fun iteratingArray4(
    arr1: ByteArray,
    arr2: ShortArray,
    arr3: IntArray,
    arr4: LongArray,
    arr5: CharArray,
    arr6: FloatArray,
    arr7: DoubleArray,
    arr8: BooleanArray
) {
    println(arr1)
    println(arr2)
    println(arr3)
    println(arr4)
    println(arr5)
    println(arr6)
    println(arr7)
    println(arr8)
}

/**
 * Demonstrates the Array type
 *
 * @author Ranjith Krishnamurthy
 */
fun iteratingArray5(
    arr1: Array<Byte>,
    arr2: Array<Short>,
    arr3: Array<Int>,
    arr4: Array<Long>,
    arr5: Array<Char>,
    arr6: Array<Float>,
    arr7: Array<Double>,
    arr8: Array<Boolean>,
    arr9: Array<TwoInts>
) {
    println(arr1)
    println(arr2)
    println(arr3)
    println(arr4)
    println(arr5)
    println(arr6)
    println(arr7)
    println(arr8)
    println(arr9)
}

/**
 * Demonstrates the Array type
 *
 * @author Ranjith Krishnamurthy
 */
fun iteratingArray6(
    arr1: Array<Byte?>,
    arr2: Array<Short?>,
    arr3: Array<Int>?,
    arr4: Array<Long>?,
    arr5: Array<Char?>,
    arr6: Array<Float?>,
    arr7: Array<Double?>,
    arr8: Array<Boolean>?,
    arr9: Array<TwoInts>?
) {
    println(arr1)
    println(arr2)
    println(arr3)
    println(arr4)
    println(arr5)
    println(arr6)
    println(arr7)
    println(arr8)
    println(arr9)
}

/**
 * Demonstrates the primitive array type
 *
 * @author Ranjith Krishnamurthy
 */
fun iteratingArray7(
    arr1: ByteArray?,
    arr2: ShortArray?,
    arr3: IntArray?,
    arr4: LongArray?,
    arr5: CharArray?,
    arr6: FloatArray?,
    arr7: DoubleArray?,
    arr8: BooleanArray?
) {
    println(arr1)
    println(arr2)
    println(arr3)
    println(arr4)
    println(arr5)
    println(arr6)
    println(arr7)
    println(arr8)
}