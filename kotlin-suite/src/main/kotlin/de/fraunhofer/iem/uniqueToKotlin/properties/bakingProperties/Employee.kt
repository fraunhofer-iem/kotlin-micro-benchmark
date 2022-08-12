package de.fraunhofer.iem.uniqueToKotlin.properties.bakingProperties

/**
 * Demonstrates the baking property in Kotlin
 *
 * If you do not wish to use baking field, then switch to baking property
 *
 * @author Ranjith Krishnamurthy
 */
class Employee {
    // Private and becomes the baking property
    private var _firstName: String = ""

    // We dont have to refer to firstName instead refer to baking property to avoid using the baking field
    var firstName: String
        get() {
            return this._firstName
        }
        set(value) {
            this._firstName = value
        }

}