package de.fraunhofer.iem.uniqueToKotlin.destructuringDeclaration.inDataClass

/**
 * Demonstrates the destructuring declaration in Kotlin
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
    val (name, address, age, mobileNumber) = returnFromFunction()
    println(name)
    println(address)
    println(age)
    println(mobileNumber)

    // Destructuring declaration (with underscore for unused variables) of the return value from a function
    val (name1, _, age1, _) = returnFromFunction()
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

    val (nm, add, ag, mn) = ranjith
    println(nm)
    println(add)
    println(ag)
    println(mn)

    val (nmm, _, agg, _) = ranjith
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
    val func: (Person) -> Unit = { (nm, add, ag, mn): Person ->
        println(nm)
        println(add)
        println(ag)
        println(mn)
    }

    func(person)

    val funcWithUnderscore: (Person) -> Unit = { (nm: String, _, ag: Int, _) ->
        println(nm)
        println(ag)
    }

    funcWithUnderscore(person)
}