package de.fraunhofer.iem.collections.collection.additionalWaysOfCreatingCollections

/**
 * Demonstrates the additional way of creating collections in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    println(emptyList<String>())
    println(emptyArray<String>())
    println(emptyMap<Int, String>())
    println(emptySet<String>())
    println(emptySequence<String>())

    println(List(5) { it * 10 })
    println(MutableList(5) { it * 10 })

    copyFeature()
}

fun copyFeature() {
    val lst = listOf<Int>(1, 2, 3, 4, 5)

    println(lst.toHashSet())
    println(lst.toSortedSet())
    println(lst.toMutableList())
    println(lst.toMutableSet())
    println(lst.toSet())
    println(lst.toIntArray())
    println(lst.toTypedArray())

    val mutableLst = mutableListOf<Int>(1, 2, 3, 4, 5)
    val mutableListShallowCopy: List<Int> = mutableLst

    println("Before = $mutableLst")
    println("Before = $mutableListShallowCopy")

    mutableLst.add(6)
    mutableLst.add(7)
    mutableLst.add(8)
    mutableLst.add(9)
    mutableLst.add(10)

    println("After = $mutableLst")
    println("After = $mutableListShallowCopy")
}