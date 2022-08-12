package de.fraunhofer.iem.uniqueToKotlin.properties.getterSetterAndBakingField

/**
 * Demonstrates the getter, setter and baking field in properties
 *
 * @author Ranjith Krishnamurthy
 */
class Employee {
    /**
     * 1. Demonstrates the custom getter and setter for single property
     * 2. Contains baking field
     */
    var firstName: String = ""
        get() {
            // Throws StackOverflow error, because Kotlin uses getter for this that cause recurive call
            return firstName.uppercase()
        }
        set(firstName) {
            // Here we use baking field, instead of calling setter method it uses the firstName property
            // directly in Java bytecode
            field = firstName.lowercase()
        }

    /**
     * 1. Demonstrates the custom getter but default setter with just visibility changes to private
     * 2. Contains baking field
     */
    var lastName: String = ""
        get() {
            return field.uppercase()
        }
        // Since setter is private, in Java bytecode there will be no setter method itself
        private set

    /**
     * 1. Custom getter but no setter method because property is val
     * 2. Contains baking field
     * 3. Initializer is done through a function call
     */
    val employeeID: String = getNewEmpID()
        get() {
            return field + "ABCD"
        }

    /**
     * 1. Completely default getter and setter
     * 2. Contains baking field by default if at least one of the access is default in Kotlin
     */
    var designation: String = "NA"

    /**
     * 1. Custom setter but deafult getter
     * 2. Contains baking field
     */
    var salary: Int = 10000
        set(givenSalary) {
            if (givenSalary < 10000) {
                println("Given salary is less than the rule set by the Company\nSetting to minimum salary 10000")
                field = 10000
            }

            if (givenSalary > 1000000) {
                println("Given salary is greater than the rule set by the Company\nSetting to maximum salary 1000000")
                field = 1000000
            }

            field = givenSalary
        }

    /**
     * 1. Default getter and setter but manually written
     * 2. Contains baking field
     */
    var address: String = "NA"
        get() = field
        set(value) {
            field = value
        }

    /**
     * 1. Custom getter and setter
     * 2. Does not contain baking field
     *
     * Note:
     * 1. Since we did not use baking field and no default implementation of getter and setter, this means
     * we never used the variable length inside the class, because if we have used that property inside a class
     * then Kotlin would call getter or setter. However, in getter and setter we did not use baking field
     * Therefore, Kotlin will not create a field (or variable) in Java bytecode for length. It creates
     * only the getter and setter. Therefore, Kotlin does not allow us to initialize the length because
     * in Java bytecode there is no actual variable for length
     */
    var length: Int
        get() = this.firstName.length + this.lastName.length
        set(value) {
            println("Can not change length!")
        }
}

var lastGeneratedEmpID: Int = 0

fun getNewEmpID(): String = (++lastGeneratedEmpID).toString()