package de.fraunhofer.iem.classesAndObjects.typeAliases

import de.fraunhofer.iem.classesAndObjects.delegation.delegationInheritance.Car
import de.fraunhofer.iem.classesAndObjects.delegation.delegationInheritance.Vehicle

// Type aliases
typealias vList = List<Vehicle>
typealias vMap = Map<String, Vehicle>
typealias printFunType = (Vehicle) -> Unit

/**
 * Demonstrates the type alias in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val ob: vList = mutableListOf(Car())

    println(ob)

    val ob1: vMap = mutableMapOf("First" to Car())
    println(ob1["First"])

    val func: printFunType = { it ->
        println(it)
    }

    func(Car())
}