package de.fraunhofer.iem.collections.iterators.inFunctionSignatureAndProperty

/**
 * Demonstrates the iterators and iterables in the method signature
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val lst: MutableList<String> = mutableListOf("Ranjith", "K")

    returnIterable(lst)
    returnIterator(lst)

    returnListIterator(lst)

    returnMutableListIterator(lst)

    returnIterator(lst)

    returnMutableIterator(lst)
    returnMutableIterable(lst)
}

fun returnIterator(lst: List<String>): Iterator<String> {
    return lst.iterator()
}

fun returnIterable(lst: List<String>): Iterable<String> {
    return lst
}

fun returnListIterator(lst: List<String>): ListIterator<String> {
    return lst.listIterator()
}

fun returnMutableIterator(lst: MutableList<String>): MutableIterator<String> {
    return lst.iterator()
}

fun returnMutableIterable(lst: MutableList<String>): MutableIterable<String> {
    return lst
}

fun returnMutableListIterator(lst: MutableList<String>): MutableListIterator<String> {
    return lst.listIterator()
}