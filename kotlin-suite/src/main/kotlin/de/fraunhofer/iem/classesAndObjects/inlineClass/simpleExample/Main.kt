package de.fraunhofer.iem.classesAndObjects.inlineClass.simpleExample

/**
 * Demonstrates the usage of the inline class in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val userName = UserName("Ranjith")

    println(userName.userName)
    println(userName.toString())
    println(userName.hashCode())
    println(userName.equals(UserName("Ranjith")))
    println(userName == UserName("Ranjith"))
}