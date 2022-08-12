package de.fraunhofer.iem.classesAndObjects.classes.inheritance.overrideFromMultipleBaseClasses.oneClassAndOneInterfaceAsSuperClass

/**
 * Unlike Java, Kotlin still needs us to resolve the ambiguity here, therefore, we need to implement the both methods
 *
 * Note:
 * 1. to call particular base interface default method use the syntax super.<interface name>.<method name>
 *
 * @author Ranjith Krishnamurthy
 */
class Derived : Base1(), Base2 {
    override fun print1() {
        super<Base1>.print1()
    }

    override fun print2() {
        super<Base1>.print2()
        super<Base2>.print2()
    }
}