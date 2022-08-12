package de.fraunhofer.iem.classesAndObjects.inlineClass.membersInInlineClass

/**
 * Demonstrates the inline class members in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
@JvmInline
value class UserName(val userName: String) {
    init {
        require(userName.isNotEmpty())
        println("$userName is stored")
    }

    val userNameInUpperCase: String
        get() = userName.uppercase()

    fun print() {
        println(userName)
    }
}