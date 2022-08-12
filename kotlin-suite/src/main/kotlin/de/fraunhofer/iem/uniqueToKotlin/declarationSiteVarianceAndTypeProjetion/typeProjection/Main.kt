package de.fraunhofer.iem.uniqueToKotlin.declarationSiteVarianceAndTypeProjetion.typeProjection

/**
 * Demonstrates the type projection in function
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val ob1: DifferentTypedPair<Int, String> = DifferentTypedPair(5485, "Ranjith")
    val ob2: DifferentTypedPair<Int, StringBuilder> = DifferentTypedPair(5485, StringBuilder("Ranjith"))
    val ob3: DifferentTypedPair<Int, StringBuffer> = DifferentTypedPair(5485, StringBuffer("Ranjith"))

    print(ob1)
    print(ob2)
    print(ob3)

    demo()

    val ob4: DifferentTypedPair<Any, Any> = DifferentTypedPair(Any(), Any())

    println("Before first = " + ob4.first)
    println("Before second = " + ob4.second)

    resetToDefault(ob4)

    println("After first = " + ob4.first)
    println("After second = " + ob4.second)
}

/**
 * Co-variant type projection (Producer)
 */
fun print(ob: DifferentTypedPair<out Number, out CharSequence>) {
    val firstAsInt: Int = ob.first.toInt()
    val firstCharInSecond: Char = ob.second[0]

    println(firstAsInt)
    println(firstCharInSecond)
}

/**
 * Contr-variant type projection (Consumer)
 */
fun resetToDefault(ob: DifferentTypedPair<in Number, in CharSequence>) {
    ob.first = 0
    ob.second = "Anonymous"
}

/**
 * Demonstrates the usage of the member function of a generic class that uses the type projection
 */
fun demo() {
    val ob1: DifferentTypedPair<Number, CharSequence> = DifferentTypedPair(5485, "Ranjith")
    val ob2 = DifferentTypedPair(9568457, StringBuffer("Anonymous"))

    println("Before first = " + ob1.first)
    println("Before second = " + ob1.second)

    ob1.replace(ob2)

    println("After first = " + ob1.first)
    println("After second = " + ob1.second)
}