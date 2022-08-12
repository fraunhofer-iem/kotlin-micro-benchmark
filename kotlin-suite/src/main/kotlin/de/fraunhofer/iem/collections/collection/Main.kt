package de.fraunhofer.iem.collections.collection

var myName = listOf<String>("Ranjith", "K")

/**
 * Demonstrates Collection interface
 *
 * @author Ranjith Krishnamurthy
 */
fun printMyCollection(collection: Collection<String>) {
    for (elem in collection) {
        println(elem)
    }
}

/**
 * Demonstrates Map interface
 *
 * @author Ranjith Krishnamurthy
 */
fun printMyMap(map: Map<Int, String>) {
    for ((key, value) in map) {
        println("$key : $value")
    }
}

fun main() {
    printMyCollection(getList())
    printMyCollection(getArrayList())
    printMyCollection(getArrayDeque())
    printMyCollection(getSet())
    printMyCollection(getHashSet())
    printMyCollection(getLinkedHashSet())

    printMyMap(getMap())
    printMyMap(getHashMap())
    printMyMap(getLinkedHashMap())
}

/**
 * Demonstrates List interface
 *
 * @author Ranjith Krishnamurthy
 */
private fun getList(): List<String> {
    return ArrayList(myName)
}

/**
 * Demonstrates ArrayList
 *
 * @author Ranjith Krishnamurthy
 */
private fun getArrayList(): ArrayList<String> {
    return ArrayList(myName)
}

/**
 * Demonstrates the ArrayDeque
 *
 * @author Ranjith Krishnamurthy
 */
private fun getArrayDeque(): ArrayDeque<String> {
    return ArrayDeque(myName)
}

/**
 * Demonstrates Set interface
 *
 * @author Ranjith Krishnamurthy
 */
private fun getSet(): Set<String> {
    return HashSet(myName)
}

/**
 * Demonstrates HashSet
 *
 * @author Ranjith Krishnamurthy
 */
private fun getHashSet(): HashSet<String> {
    return HashSet(myName)
}

/**
 * Demonstrates LinkedHashSet
 *
 * @author Ranjith Krishnamurthy
 */
private fun getLinkedHashSet(): LinkedHashSet<String> {
    return LinkedHashSet(myName)
}

/**
 * Demonstrates Map interface
 *
 * @author Ranjith Krishnamurthy
 */
private fun getMap(): Map<Int, String> {
    val map = java.util.HashMap<Int, String>()
    map[1] = "Ranjith"
    map[2] = "K"

    return map
}

/**
 * Demonstrates HashMap
 *
 * @author Ranjith Krishnamurthy
 */
private fun getHashMap(): HashMap<Int, String> {
    val map = HashMap<Int, String>()
    map[1] = "Ranjith"
    map[2] = "K"

    return map
}

/**
 * Demonstrates LinkedHashMap
 *
 * @author Ranjith Krishnamurthy
 */
private fun getLinkedHashMap(): LinkedHashMap<Int, String> {
    val map = LinkedHashMap<Int, String>()
    map[1] = "Ranjith"
    map[2] = "K"

    return map
}