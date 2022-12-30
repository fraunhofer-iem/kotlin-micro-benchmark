package de.fraunhofer.iem.reflection

/**
 * Dummy Class
 *
 * @author Ranjith Krishnamurthy
 */
class ClassReference {
}

fun main() {
    directClassAccess()
    classAccessThroughVariable()
}

/**
 * This method demonstrates the class reference directly using the class. Demonstrates both KClass and Java class reference.
 */
fun directClassAccess() {
    val kotlinClz = ClassReference::class
    val javaClz = ClassReference::class.java

    println(kotlinClz.qualifiedName + " : " + kotlinClz::class.qualifiedName)
    println(javaClz.name + " : " + javaClz::class.qualifiedName)
}

/**
 * This method demonstrates the class reference from the variable. Demonstrates both KClass and Java class reference.
 */
fun classAccessThroughVariable() {
    val ob1 = ClassReference()
    var ob2 = ClassReference()

    val kotlinClz1 = ob1::class
    val javaClz1 = ob1::class.java
    val kotlinClz2 = ob2::class
    val javaClz2 = ob2::class.java

    println(kotlinClz1.qualifiedName + " : " + kotlinClz1::class.qualifiedName)
    println(javaClz1.name + " : " + javaClz1::class.qualifiedName)
    println(kotlinClz2.qualifiedName + " : " + kotlinClz2::class.qualifiedName)
    println(javaClz2.name + " : " + javaClz2::class.qualifiedName)
}