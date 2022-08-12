package de.fraunhofer.iem.basics.dataTypes

/**
 * Demonstrates the Unsigned numbers in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val num1: UInt = getUInt("int")
    val num11: UInt = getUInt("ok")
    val num2: UByte = getUByte("byte")
    val num3: UShort = getUShort("short")
    val num4: ULong = getULong("long")

    println(num1)
    println(num1 + num11 + 200U)
    println(num2)
    println(num3)
    println(num4)

    printUInt(1254U)
}

/**
 * Demonstrates the Unsigned Int in method signature parameter
 *
 * @author Ranjith Krishnamurthy
 */
fun printUInt(uInt: UInt) {
    println(uInt)
}

/**
 * Demonstrates the Unsigned Int in method signature
 *
 * @author Ranjith Krishnamurthy
 */
fun getUInt(str: String): UInt {
    if (str == "int") {
        return 4_294_967_295U;
    }

    return 150u;
}

/**
 * Demonstrates the Unsigned Byte in method signature
 *
 * @author Ranjith Krishnamurthy
 */
fun getUByte(str: String): UByte {
    if (str == "byte") {
        return 255U;
    }

    return 150u;
}

/**
 * Demonstrates the Unsigned Short in method signature
 *
 * @author Ranjith Krishnamurthy
 */
fun getUShort(str: String): UShort {
    if (str == "short") {
        return 65535U;
    }

    return 150u;
}

/**
 * Demonstrates the Unsigned Long in method signature
 *
 * @author Ranjith Krishnamurthy
 */
fun getULong(str: String): ULong {
    if (str == "long") {
        return 18446744073709551615UL;
    }

    return 150UL;
}