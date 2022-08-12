package de.fraunhofer.iem.uniqueToKotlin.inlineFunction.inlineProperties

/**
 * Normal extension property
 *
 * @author Ranjith Krishnamurthy
 */
var <T> List<T>.lastIndex1
    get() = this.size - 1
    set(value) = println("lastIndex can not be modified, this is for example! = $value")

/**
 * Complete inline extension property
 *
 * @author Ranjith Krishnamurthy
 */
inline var <T> List<T>.lastIndex2
    get() = this.size - 1
    set(value) = println("lastIndex can not be modified, this is for example! = $value")

/**
 * Getter is inline property
 *
 * @author Ranjith Krishnamurthy
 */
var <T> List<T>.lastIndex3
    inline get() = this.size - 1
    set(value) = println("lastIndex can not be modified, this is for example! = $value")

/**
 * Setter is inline property
 *
 * @author Ranjith Krishnamurthy+
 */
var <T> List<T>.lastIndex4
    get() = this.size - 1
    inline set(value) = println("lastIndex can not be modified, this is for example! = $value")

fun main() {
    val lst: List<Int> = listOf<Int>(1, 2, 3, 4, 5)
    println(lst.lastIndex1)
    lst.lastIndex1 = 10

    println(lst.lastIndex2)
    lst.lastIndex2 = 10

    println(lst.lastIndex3)
    lst.lastIndex3 = 10

    println(lst.lastIndex4)
    lst.lastIndex4 = 10
}


