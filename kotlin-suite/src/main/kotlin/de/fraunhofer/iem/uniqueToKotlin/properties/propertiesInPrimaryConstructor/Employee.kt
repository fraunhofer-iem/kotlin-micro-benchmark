package de.fraunhofer.iem.uniqueToKotlin.properties.propertiesInPrimaryConstructor

/**
 * Demonstrates the properties declared in the primary constructor
 *
 * Note:
 * 1. If property is defined as var, then in Java bytecode there will be default getter and setter for that property
 * 2. If property is defined as val, then in Java bytecode there will be only default getter but no setter
 *
 * @author Ranjith Krishnamurthy
 */
class Employee(
    var firstName: String,
    var lastName: String,
    var employeeID: String,
    var designation: String,
    var salary: Int,
    var address: String
)