package de.fraunhofer.iem.classesAndObjects.inlineClass.inheritanceInInlineClass

/**
 * Demonstrates the usage of the inline class that implements the interface
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val userName = UserName("Ranjith")
    printMyUserName(userName)
    userName.print()
}

fun printMyUserName(userNamePrinter: UserNamePrinter) {
    userNamePrinter.print()
}