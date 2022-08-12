package de.fraunhofer.iem.collections.iterators.inFunctionSignatureAndProperty

/**
 * Demonstrates the iterators and iterables in the method signature
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val lst: MutableList<String> = mutableListOf("Ranjith", "K")

    takeIterable(lst)
    takeIterator(lst.iterator())

    takeListIterator(lst.listIterator())

    takeMutableListIterator(lst.listIterator())

    takeIterator(lst.iterator())

    takeMutableIterator(lst.iterator())
    takeMutableIterable(lst)
}

fun takeIterator(itr: Iterator<String>) {
    while (itr.hasNext()) {
        println(itr.next())
    }
}

fun takeIterable(iterable: Iterable<String>) {
    val itr = iterable.iterator()

    while (itr.hasNext()) {
        println(itr.next())
    }
}

fun takeListIterator(itr: ListIterator<String>) {
    while (itr.hasNext()) {
        println(itr.next())
    }
}

fun takeMutableIterator(itr: MutableIterator<String>) {
    while (itr.hasNext()) {
        if (itr.next() == "MARKER")
            itr.remove()
    }
}

fun takeMutableIterable(iterable: MutableIterable<String>) {
    val itr = iterable.iterator()

    while (itr.hasNext()) {
        if (itr.next() == "MARKER")
            itr.remove()
    }
}

fun takeMutableListIterator(itr: MutableListIterator<String>) {
    while (itr.hasNext()) {
        val elem = itr.next()
        itr.set("$elem-MARKER")

        if (elem != "MARKER")
            itr.add("MARKER")
    }
}