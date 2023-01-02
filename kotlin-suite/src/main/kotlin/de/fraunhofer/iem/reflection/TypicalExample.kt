package de.fraunhofer.iem.reflection

import kotlin.reflect.KClass
import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

/**
 * Demonstrates the method and property access through Kotlin reflection
 *
 * @author Ranjith Krishnamurthy
 */
class TypicalExample {

    var publicField = 20

    fun publicMethod() {
        println("This is a method with the name publicMethod")
    }

    /**
     * Demonstrates the property access through KClass
     */
    fun propertyAccess(clz: KClass<*>) {
        val properties = clz.memberProperties

        for (property in properties) {
            println(property.name)
            val ob = clz.createInstance()
            println(property.getter.call(ob))

            if (property is KMutableProperty<*>) {
                property.setter.call(ob, 50)
            }

            println(property.getter.call(ob))
        }
    }

    /**
     * Demonstrates the property access directly from the class
     */
    fun directPropertyAccess() {
        val ob = TypicalExample::class.createInstance()
        println(TypicalExample::publicField.name)
        println(TypicalExample::publicField.getter.call(ob))

        TypicalExample::publicField.setter.call(ob, 50)
        println(TypicalExample::publicField.getter.call(ob))
    }

    /**
     * Demonstrates the method access through KClass
     */
    fun methodAccess(clz: KClass<*>) {
        val methods = clz.memberFunctions

        for (method in methods) {
            if (method.name == "publicMethod") {
                println(method.name)
                val ob = clz.createInstance()
                method.call(ob)
            }
        }
    }

    /**
     * Demonstrates the method access directly from the class
     */
    fun directMethodAccess() {
        val ob = TypicalExample::class.createInstance()
        println(TypicalExample::publicMethod.name)
        TypicalExample::publicMethod.call(ob)
    }
}

fun main() {
    val typicalExample = TypicalExample()
    println("*** Property Access ***")
    typicalExample.propertyAccess(TypicalExample::class)
    println("\n*** Method Access ***")
    typicalExample.methodAccess(TypicalExample::class)
    println("\n*** Direct Property Access ***")
    typicalExample.directPropertyAccess()
    println("\n*** Direct Method Access ***")
    typicalExample.directMethodAccess()
}