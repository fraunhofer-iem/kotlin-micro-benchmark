package de.fraunhofer.iem.uniqueToKotlin.destructuringDeclaration.inForLoops

import de.fraunhofer.iem.uniqueToKotlin.destructuringDeclaration.inCustomClass.Person
import de.fraunhofer.iem.uniqueToKotlin.destructuringDeclaration.inCustomClass.component4
import de.fraunhofer.iem.uniqueToKotlin.destructuringDeclaration.inCustomClass.component2

/**
 * Demonstrates the destructuring declaration in for loop for custom class
 *
 * @author Ranjith Krishnamurthy
 */
fun inForLoopsWithCustomClass(persons: List<Person>) {
    for ((_, age, _, name) in persons) {
        println("$name = $age")
    }
}

/**
 * Demonstrates the destructuring declaration in for loop for map in Kotlin
 *
 * Note:
 * 1. For maps, it does not call componentN function because componentN function for map is defined as inline function.
 *
 * @author Ranjith Krishnamurthy
 */
fun inForLoopsWithMaps(maps: Map<String, Int>) {
    for ((key, value) in maps) {
        println("$key = $value")
    }
}

fun main() {
    val person1 = Person("Ranjith", "Street 100", 100, "+49 111")
    val person2 = Person("Ranjith K", "Street 200", 200, "+49 222")
    val person3 = Person("Ranjith Krishnamurthy", "Street 300", 300, "+49 333")

    val persons = mutableListOf<Person>(person1, person2, person3)

    inForLoopsWithCustomClass(persons)

    inForLoopsWithMaps(mapOf("Ranjith" to 100, "Ranjith K" to 200, "Ranjith Krishnamurthy" to 300))
}