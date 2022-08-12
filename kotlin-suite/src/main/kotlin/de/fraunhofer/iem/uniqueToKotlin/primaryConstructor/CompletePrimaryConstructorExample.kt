package de.fraunhofer.iem.uniqueToKotlin.primaryConstructor

/**
 * One example that demonstrates the primary constructor init block and etc.
 *
 * @author Ranjith Krishnamurthy
 */
class Employee constructor(
    private val firstName: String,
    lastName: String,
    age: Int
) {
    var age: Int = -100

    init {
        println("Initializer started")
    }

    var lastName: String = lastName;

    init {
        println("Second initializer")
        this.age = age
        println("Initializers completed")
    }
}

fun main() {
    val employee = Employee("Ranjith", "K", 100)
    println(employee.lastName)
    println(employee.age)
}