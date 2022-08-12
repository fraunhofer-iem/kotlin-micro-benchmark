package de.fraunhofer.iem.classesAndObjects.classes.inheritance.overrideFromMultipleBaseClasses.twoInterfacesAsSuperClass;

/**
 * Here we must override both the method, because both base classes are interface and Java can not resolve the ambiguity
 * of the method call, therefore we must override both the methods.
 * <p>
 * Note:
 * 1. to call particular base interface default method use the syntax <interface name>.super.<method name>
 *
 * @author Ranjith Krishnamurthy
 */
public class Derived implements Base1, Base2 {
    @Override
    public void print1() {
        Base1.super.print1();
    }

    @Override
    public void print2() {
        Base1.super.print2();
        Base2.super.print2();
    }
}
