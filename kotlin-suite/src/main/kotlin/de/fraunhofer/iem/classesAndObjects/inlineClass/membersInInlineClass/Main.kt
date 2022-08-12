package de.fraunhofer.iem.classesAndObjects.inlineClass.membersInInlineClass

/**
 * Demonstrates the usage of the inline class members in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val userName = UserName("Ranjith")

    println(userName.userName)
    println(userName.userNameInUpperCase)
    userName.print()
    println(userName.toString())
    println(userName.hashCode())
    println(userName.equals(UserName("Ranjith")))
    println(userName == UserName("Ranjith"))
}