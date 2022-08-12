package de.fraunhofer.iem.classesAndObjects.enumClass.simpleEnum

/**
 * Demonstrates the usage simple Enum in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    print(Menu.CHICKEN_GRAVY)
    print(Menu.EGG_OMELET)
    print(Menu.CHICKEN_BIRYANI)
    print(Menu.VEG_PULAO)
}

/**
 * Demonstrates the usage of Enum in Switch statement in Java
 */
fun print(menu: Menu?) {
    when (menu) {
        Menu.CHICKEN_GRAVY ->
            println("Chicken gravy: " + Menu.CHICKEN_GRAVY)
        Menu.EGG_OMELET ->
            println("Egg Omelet: " + Menu.EGG_OMELET)
        Menu.CHICKEN_BIRYANI ->
            println("Chicken biryani: " + Menu.CHICKEN_BIRYANI)
        Menu.VEG_PULAO ->
            println("Veg pulao: " + Menu.VEG_PULAO)
    }
}