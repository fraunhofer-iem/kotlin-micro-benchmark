package de.fraunhofer.iem.classesAndObjects.enumClass.enumWithCustomValue

/**
 * Demonstrates the usage Enum in Kotlin
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
 * Demonstrates the usage of Enum in Switch statement in Java and access of the custom values
 */
fun print(menu: Menu?) {
    when (menu) {
        Menu.CHICKEN_GRAVY ->
            println("Chicken gravy: " + Menu.CHICKEN_GRAVY + " : " + menu.price)
        Menu.EGG_OMELET ->
            println("Egg Omelet: " + Menu.EGG_OMELET + " : " + menu.price)
        Menu.CHICKEN_BIRYANI ->
            println("Chicken biryani: " + Menu.CHICKEN_BIRYANI + " : " + menu.price)
        Menu.VEG_PULAO ->
            println("Veg pulao: " + Menu.VEG_PULAO + " : " + menu.price)
    }
}