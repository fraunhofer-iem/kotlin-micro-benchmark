package de.fraunhofer.iem.classesAndObjects.classes.inheritance.overrideFromMultipleBaseClasses.oneClassAndOneInterfaceAsSuperClass;

/**
 * There is no ambiguity here, because Java by default it takes the implementation of a class not the interface (even if it
 * has default method)
 *
 * @author Ranjith Krishnamurthy
 */
public class Derived extends Base1 implements Base2 {
}
