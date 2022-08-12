package de.fraunhofer.iem.uniqueToKotlin.primaryConstructor.argConstructor

/**
 * Demonstrates the primary constructor that takes arguments
 *
 * Note:
 * 1. By default, properties defined in primary constructor are public in source code, and private in Java bytecode
 * 2. All the properties in the primary constructor will have getter method and setter method (if var).
 * 3. Whenever, you access the property using the property name, in Java bytecode it uses the getter method.
 * 4. This is the concise way of defining primary constructor in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
class Employee(val firstName: String, val lastName: String, val age: Int)