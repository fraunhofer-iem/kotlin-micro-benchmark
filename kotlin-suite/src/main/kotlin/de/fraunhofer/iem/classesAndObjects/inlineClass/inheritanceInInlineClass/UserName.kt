package de.fraunhofer.iem.classesAndObjects.inlineClass.inheritanceInInlineClass

/**
 * Demonstrates the inline class that implements the interface
 *
 * @author Ranjith Krishnamurthy
 */
@JvmInline
value class UserName(val userName: String) : UserNamePrinter {
    init {
        require(userName.isNotEmpty())
        println("$userName is stored")
    }

    val userNameInUpperCase: String
        get() = userName.uppercase()

    override fun print() {
        println(userName)
    }
}