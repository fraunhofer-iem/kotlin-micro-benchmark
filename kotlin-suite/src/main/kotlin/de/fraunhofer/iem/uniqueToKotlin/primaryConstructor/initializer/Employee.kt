package de.fraunhofer.iem.uniqueToKotlin.primaryConstructor.initializer

/**
 * Demonstrates the initializer blocks in Kotlin
 *
 * Note:
 * 1. Primary constructor will be the first thing in Java bytecode <init> method (In our example, we defined firstName in primary
 * constructor)
 * 2. Then, the properties defined in the body will be put in the Java bytecode <init> method (In our example, lastName)
 * 3. Then, the init block is placed in the Java bytecode <init> method (In our example only one init block. If there are
 * multiple init block then the order in which the init block is defined in the source code, is the same order in the
 * Java bytecode <init> method.
 * 4. For private property, in Java bytecode there will be no getter and setter method.
 *
 * @author Ranjith Krishnamurthy
 */
class Employee(private val firstName: String, lastName: String, age: Int) {
    var lastName: String = lastName
    var age: Int = 0

    init {
        println("Initializer block")
        this.age = age
        println("Completed Initializer block")
    }
}