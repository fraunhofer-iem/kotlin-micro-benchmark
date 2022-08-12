package de.fraunhofer.iem.uniqueToKotlin.destructuringDeclaration.inCustomClass

/**
 * Helper class to demonstrate the destructuring declaration.
 *
 * Note:
 * 1. Normal class by default does not contain a componentN function. Therefore, we need to explicitly define componentN
 * function as member or extension function with the operator modifier.
 * 2. componentN function can return any order value depending on the implementation
 * for example, here component1 function instead of returning name it is returning mobileNumber
 *
 * @author Ranjith Krishnamurthy
 */
class Person(
    val name: String,
    val address: String,
    val age: Int,
    val mobileNumber: String
) {
    operator fun component1(): String {
        return this.mobileNumber
    }

    operator fun component3(): String {
        return this.address
    }
}