package de.fraunhofer.iem.basics.packageAndImports.javaImport;


import de.fraunhofer.iem.basics.packageAndImports.javaPackage.JavaPackage;

/**
 * Demonstrates the import statement in Java
 *
 * @author Ranjith Krishnamurthy
 */
public class javaImport {
    public static void main(String[] args) {
        JavaPackage jp = new JavaPackage();

        System.out.println(jp.name);
        jp.printMyName();
        System.out.println(jp.getMyName());
    }
}
