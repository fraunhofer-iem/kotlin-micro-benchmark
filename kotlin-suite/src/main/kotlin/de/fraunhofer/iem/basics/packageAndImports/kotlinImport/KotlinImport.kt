package de.fraunhofer.iem.basics.packageAndImports.kotlinImport

import de.fraunhofer.iem.basics.packageAndImports.getMyName
import de.fraunhofer.iem.basics.packageAndImports.name
import de.fraunhofer.iem.basics.packageAndImports.printMyName

/**
 * Demonstrates the import in Kotlin
 *
 * Note: import statements for getMyName states the fully qualified name as
 * de.fraunhofer.iem.basics.packageAndImports.getMyName
 * However, on JVM its different
 * de.fraunhofer.iem.basics.packageAndImports.KotlinPackageKt.getName
 *
 * @author Ranjith Krishnamurthy
 */
fun main() {
    println(name)
    println(getMyName())
    printMyName()
}