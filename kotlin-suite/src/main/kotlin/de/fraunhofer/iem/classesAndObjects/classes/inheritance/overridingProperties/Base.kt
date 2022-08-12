package de.fraunhofer.iem.classesAndObjects.classes.inheritance.overridingProperties

/**
 * Demonstrates the property overriding
 *
 * In this class, we have three properties.
 * 1. prop with val initialized using constructor
 * 2. num with val initialized to 100
 * 3. ch with var initialized to R
 *
 * These properties can be overridden by derived class as
 * 1. prop can be override as val or var since its val in base class
 * 2. num can be override as val or var since its val in base class
 * 3. ch can be override as var but not val
 * see: https://kotlinlang.org/docs/inheritance.html#overriding-properties
 *
 * @author Ranjith Krishnamurthy
 */
open class Base(open val prop: String) {
    open val num: Int = 100
    open var ch: Char = 'R'
}