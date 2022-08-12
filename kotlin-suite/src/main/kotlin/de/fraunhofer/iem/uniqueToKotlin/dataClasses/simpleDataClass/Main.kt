package de.fraunhofer.iem.uniqueToKotlin.dataClasses.simpleDataClass

/**
 * Demonstrates the usage of Data class
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    val employee: Employee = Employee(
        "Ranjith",
        "K",
        100,
        "+499999999999",
        "Street 25"
    )

    // toString
    println(employee)

    // Property access
    println(employee.firstName)
    println(employee.lastName)
    println(employee.age)
    println(employee.mobileNumber)
    println(employee.address)

    demo1(employee)
    demo2(employee)
    demo3(employee)

    println(demo4(employee))
    println(demo5(employee))
    println(demo6(employee))
    println(demo7(employee))
}

/**
 * Demonstrates the Destructuring declaration into first two members of data class
 *
 * @author Ranjith Krishnamurthy
 */
fun demo1(employee: Employee) {
    val (fName: String, lName: String) = employee

    println(fName)
    println(lName)
}

/**
 * Demonstrates the Destructuring declaration into first three members with second member neglected of data class
 *
 * @author Ranjith Krishnamurthy
 */
fun demo2(employee: Employee) {
    val (fName, _, age) = employee

    println(fName)
    println(age)
}

/**
 * Demonstrates the Destructuring declaration into all members of data class
 *
 * @author Ranjith Krishnamurthy
 */
fun demo3(employee: Employee) {
    val (fName, lName, age, mNumber, addr) = employee

    println(fName)
    println(lName)
    println(age)
    println(mNumber)
    println(addr)
}

/**
 * Demonstrates the default copy
 *
 * @author Ranjith Krishnamurthy
 */
fun demo4(employee: Employee): Employee {
    return employee.copy()
}

/**
 * Demonstrates the copy with one parameter change
 *
 * @author Ranjith Krishnamurthy
 */
fun demo5(employee: Employee): Employee {
    return employee.copy("Dylan")
}

/**
 * Demonstrates the copy with named parameter
 *
 * @author Ranjith Krishnamurthy
 */
fun demo6(employee: Employee): Employee {
    return employee.copy(lastName = "Krishnamurthy", address = "Strrrrrreeet 22555")
}

/**
 * Demonstrates the copy with named parameter
 *
 * @author Ranjith Krishnamurthy
 */
fun demo7(employee: Employee): Employee {
    return employee.copy(
        firstName = "Anonymous",
        lastName = "Anonymous",
        age = 120,
        mobileNumber = "+495264656464646464646",
        address = "Street Street 52154"
    )
}