package de.fraunhofer.iem.uniqueToKotlin.destructuringDeclaration.inCustomClass

/**
 * Demonstrates defining the componentN function as a extension function for a custom class
 *
 * @author Ranjith Krishnamurthy
 */
operator fun Person.component2(): Int = this.age
operator fun Person.component4(): String = this.name

/**
 * Demonstrates the destructuring declaration for custom class in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val ranjith = Person(
        "Krishnamurthy Ranjith",
        "Street 10221",
        100552,
        "+49 5555 5555"
    )

    example1()

    inLambda(ranjith)

    // Destructuring declaration of the return value from a function
    val (mobileNumber, age, address, name) = returnFromFunction()
    println(name)
    println(address)
    println(age)
    println(mobileNumber)

    // Destructuring declaration (with underscore for unused variables) of the return value from a function
    val (_, age1, _, name1) = returnFromFunction()
    println(name1)
    println(age1)
}

/**
 * Demonstrates the destructuring declaration of a local variable
 *
 * @author Ranjith Krishnamurthy
 */
fun example1() {
    val ranjith = Person(
        "Ranjith K",
        "Street 102",
        100,
        "+49 99999 9999"
    )

    val (mn, ag, add, nm) = ranjith
    println(nm)
    println(add)
    println(ag)
    println(mn)

    val (_, agg, _, nmm) = ranjith
    println(nmm)
    println(agg)
}

/**
 * Helper function to demonstrate the destructuring declaration of a return value from a function
 *
 * @author Ranjith Krishnamurthy
 */
fun returnFromFunction(): Person {
    return Person(
        "Ranjith Krishnamurthy",
        "Street 1020",
        1000,
        "+49 8888 88888"
    )
}

/**
 * Demonstrates the destructuring declaration in a lambda expression
 *
 * @author Ranjith Krishnamurthy
 */
fun inLambda(person: Person) {
    val func: (Person) -> Unit = { (mn, ag, add, nm): Person ->
        println(nm)
        println(add)
        println(ag)
        println(mn)
    }

    func(person)

    val funcWithUnderscore: (Person) -> Unit = { (_, ag: Int, _, nm: String) ->
        println(nm)
        println(ag)
    }

    funcWithUnderscore(person)
}