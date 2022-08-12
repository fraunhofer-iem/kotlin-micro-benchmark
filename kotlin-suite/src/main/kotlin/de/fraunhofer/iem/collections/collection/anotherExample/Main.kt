package de.fraunhofer.iem.collections.collection.anotherExample

/**
 * Demonstrates the collections and map in function signature
 *
 * @author Ranjith Krishnamurthy
 */
fun propagateCollection(param: Collection<String>): Collection<String> {
    println("Returning = $param")
    return param
}

fun propagateMutableCollection(param: MutableCollection<String>): MutableCollection<String> {
    println("Returning = $param")
    return param
}

fun propagateList(param: List<String>): List<String> {
    println("Returning = $param")
    return param
}

fun propagateMutableList(param: MutableList<String>): MutableList<String> {
    println("Returning = $param")
    return param
}

fun propagateSet(param: Set<String>): Set<String> {
    println("Returning = $param")
    return param
}

fun propagateMutableSet(param: MutableSet<String>): MutableSet<String> {
    println("Returning = $param")
    return param
}

fun propagateMap(param: Map<Int, String>): Map<Int, String> {
    println("Returning = $param")
    return param
}

fun propagateMutableMap(param: MutableMap<Int, String>): MutableMap<Int, String> {
    println("Returning = $param")
    return param
}

fun propagateArrayList(param: ArrayList<String>): ArrayList<String> {
    println("Returning = $param")
    return param
}

fun propagateHashSet(param: HashSet<String>): HashSet<String> {
    println("Returning = $param")
    return param
}

fun propagateLinkedHashSet(param: LinkedHashSet<String>): LinkedHashSet<String> {
    println("Returning = $param")
    return param
}

fun propagateHashMap(param: HashMap<Int, String>): HashMap<Int, String> {
    println("Returning = $param")
    return param
}

fun propagateLinkedHashMap(param: LinkedHashMap<Int, String>): LinkedHashMap<Int, String> {
    println("Returning = $param")
    return param
}

fun propagateArrayDeque(param: ArrayDeque<String>): ArrayDeque<String> {
    println("Returning = $param")
    return param
}

fun main() {
    propagateCollection(listOf("R"))
    propagateMutableCollection(mutableListOf("R"))

    propagateList(listOf("R"))
    propagateMutableList(mutableListOf("R"))

    propagateSet(setOf("R"))
    propagateMutableSet(mutableSetOf("R"))

    propagateMap(mapOf(1 to "R"))
    propagateMutableMap(mutableMapOf(1 to "R"))

    propagateArrayList(arrayListOf("R"))

    propagateHashSet(hashSetOf("R"))
    propagateLinkedHashSet(linkedSetOf("R"))

    propagateHashMap(hashMapOf(1 to "R"))
    propagateLinkedHashMap(linkedMapOf(1 to "R"))

    propagateArrayDeque(ArrayDeque(0))
}