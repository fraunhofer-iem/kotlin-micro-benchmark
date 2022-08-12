package de.fraunhofer.iem.basics.packageAndImports

/**
 * In Kotlin package can be different than the file structure
 */
fun printMyName() {
    println(name)
}

fun getMyName(): String {
    return name
}

val name: String = "Ranjith"