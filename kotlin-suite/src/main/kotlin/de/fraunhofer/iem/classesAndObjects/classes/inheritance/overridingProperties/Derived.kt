package de.fraunhofer.iem.classesAndObjects.classes.inheritance.overridingProperties

/**
 * Overrides the three properties from the Base
 *
 * @author Ranjith Krishnamurthy
 */
class Derived(override var prop: String) : Base(prop) {
    override val num: Int = 200
    override var ch: Char = 'A'
}