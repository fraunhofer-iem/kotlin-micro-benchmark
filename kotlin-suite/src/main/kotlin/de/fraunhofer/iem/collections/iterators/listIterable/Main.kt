package de.fraunhofer.iem.collections.iterators.listIterable

/**
 * Demonstrates the ListIterator in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val lst: MutableList<String> = ArrayList()
    lst.add("Ranjith")
    lst.add("K")

    println("***********************************************")
    printForward(lst)
    println("***********************************************")

    appendSuffix(lst)

    println("***********************************************")
    printForward(lst)
    println("***********************************************")

    println("***********************************************")
    printBackward(lst)
    println("***********************************************")

    addMarker(lst)

    println("***********************************************")
    printForward(lst)
    println("***********************************************")

    removeMarker(lst)

    println("***********************************************")
    printForward(lst)
    println("***********************************************")
}

/**
 * Demonstrates the set operation
 *
 * @author Ranjith Krishnamurthy
 */
private fun appendSuffix(lst: MutableList<String>) {
    val itr = lst.listIterator()

    while (itr.hasNext()) {
        val elem = itr.next()

        itr.set("$elem-MARKER")
    }
}

/**
 * Demonstrates the forward iterator
 *
 * @author Ranjith Krishnamurthy
 */
private fun printForward(lst: List<String>) {
    val itr = lst.listIterator()

    while (itr.hasNext()) {
        val elem = itr.next()

        println("Element = \"" + elem + "\"\t:\tNextIndex = " + itr.nextIndex())
    }
}

/**
 * Demonstrates the backward iterator
 *
 * @author Ranjith Krishnamurthy
 */
private fun printBackward(lst: List<String>) {
    val itr = lst.listIterator()

    while (itr.hasNext()) {
        itr.next()
    }

    while (itr.hasPrevious()) {
        val elem = itr.previous()

        println("Element = \"" + elem + "\"\t:\tPreviousIndex = " + itr.previousIndex())
    }
}

/**
 * Demonstrates the add operation
 *
 * @author Ranjith Krishnamurthy
 */
private fun addMarker(lst: MutableList<String>) {
    val itr = lst.listIterator()

    while (itr.hasNext()) {
        val elem = itr.next()

        if (elem != "MARKER")
            itr.add("MARKER")
    }
}

/**
 * Demonstrates the remove operation
 *
 * @author Ranjith Krishnamurthy
 */
private fun removeMarker(lst: MutableList<String>) {
    val itr = lst.listIterator()

    while (itr.hasNext()) {
        val elem = itr.next()

        if (elem == "MARKER")
            itr.remove()
    }
}