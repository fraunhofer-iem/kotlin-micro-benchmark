package de.fraunhofer.iem.classesAndObjects.enumClass.differentWayToAccessEnumConstants

import de.fraunhofer.iem.classesAndObjects.enumClass.enumImplementsInterface.Menu

/**
 * Demonstrates the different ways to access the Enum constant in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val menu1 = Menu.valueOf("CHICKEN_GRAVY")
    val menu2 = Menu.values()[1]
    val menu3 = Menu.VEG_PULAO

    println(menu1)
    println(menu1.name)
    println(menu1.ordinal)

    println(menu2)
    println(menu2.name)
    println(menu2.ordinal)

    println(menu3)
    println(menu3.name)
    println(menu3.ordinal)

    try {
        Menu.valueOf("DUMMY")
    } catch (e: Exception) {
        println("Something went wrong: " + e.javaClass.name + " : " + e.message)
    }

    // In Java bytecode, below will be same as Menu.values()[0]
    println(enumValues<Menu>()[0])

    // In Java bytecode, below will be same as Menu.valueOf("CHICKEN_GRAVY")
    println(enumValueOf<Menu>("CHICKEN_BIRYANI"))
}