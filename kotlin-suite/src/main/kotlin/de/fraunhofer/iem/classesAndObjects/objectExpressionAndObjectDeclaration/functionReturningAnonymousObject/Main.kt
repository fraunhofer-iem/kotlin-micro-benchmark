package de.fraunhofer.iem.classesAndObjects.objectExpressionAndObjectDeclaration.functionReturningAnonymousObject

import de.fraunhofer.iem.classesAndObjects.objectExpressionAndObjectDeclaration.anonymousObjectOfSomeType.HelloWorldPrinter
import de.fraunhofer.iem.classesAndObjects.objectExpressionAndObjectDeclaration.anonymousObjectOfSomeType.PrintAnything

/**
 * Demonstrates the private function returning anonymous object (Returns as anonymous object type,
 * so that we can access the members of the anonymous object)
 *
 * @author Ranjith Krishnamurthy
 */
private fun getAnonymousObjectPrivate() = object : HelloWorldPrinter() {
    val greetMessage = "Hello!! "
    val name: String = "Ranjith"

    @Override
    override fun greet() {
        println("$greetMessage$name")
    }
}

/**
 * Demonstrates the public function returning anonymous object (HelloWorldPrinter as super type), since its public,
 * function returns as HelloWorldPrinter type (In this case, can not access the anonymous object members, but can
 * access HelloWorldPrinter members)
 *
 * @author Ranjith Krishnamurthy
 */
fun getAnonymousObjectPublicWithSingleSuperType() = object : HelloWorldPrinter() {
    val greetMessage = "Hi!! "
    val name: String = "Kotlin"

    @Override
    override fun greet() {
        println("$greetMessage$name")
    }
}

/**
 * Demonstrates the public function returning anonymous object (Any as super type), since its public, function returns as
 * Any type (In this case, can not access the anonymous object members)
 *
 * @author Ranjith Krishnamurthy
 */
fun getAnonymousObjectPublicWithAnyAsSuperType() = object {}

/**
 * Demonstrates the public function returning anonymous object (HelloWorldPrinter as super type), since its public,
 * function returns as HelloWorldPrinter type explicitly (In this case, can not access the anonymous object members, but can
 * access HelloWorldPrinter members)
 *
 * Note:
 * 1. Since object inherits from two types, therefore we must explicitly provide the return type of the function
 *
 * @author Ranjith Krishnamurthy
 */
fun getAnonymousObjectPublicWithMultipleSuperTypes(): HelloWorldPrinter = object : HelloWorldPrinter(), PrintAnything {
    val greetMessage = "Hi!! "
    val name: String = "Kotlin"

    @Override
    override fun greet() {
        println("$greetMessage$name")
    }

    @Override
    override fun print(message: String) {
        println(message)
    }
}

/**
 * Demonstrates the usage of the function returning anonymous object
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val ob1 = getAnonymousObjectPrivate()

    println(ob1.name)
    println(ob1.greetMessage)
    ob1.greet()
    // Below is not possible because anonymous object does not implement PrintAnything
    // ob1.print()

    val ob2 = getAnonymousObjectPublicWithAnyAsSuperType()

    println(ob2)
    // Below is not possible because anonymous object extends Any
    // println(ob2.name)
    // println(ob2.greetMessage)
    // ob2.greet()
    // ob2.print()

    val ob3 = getAnonymousObjectPublicWithMultipleSuperTypes()

    println(ob3)
    // Below is not possible because function returns as HelloWorldPrinter explicitly
    // println(ob3.name)
    // println(ob3.greetMessage)
    // ob3.greet()
    // ob3.print()

    val ob4 = getAnonymousObjectPublicWithSingleSuperType()

    ob4.greet()
    // Below is not possible because, function returns as HelloWorldPrinter implicitly
    // println(ob4.name)
    // println(ob4.greetMessage)
    // ob4.print()
}