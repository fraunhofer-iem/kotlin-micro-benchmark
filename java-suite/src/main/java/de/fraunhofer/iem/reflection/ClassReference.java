package de.fraunhofer.iem.reflection;

/**
 * Demonstrates the Class reference in Java reflection
 */
public class ClassReference {
    /**
     * This method demonstrates the class reference directly using the class. Demonstrates both KClass and Java class reference.
     */
    public static void directClassAccess() {
        Class<ClassReference> clz = ClassReference.class;
        System.out.println(clz.getName() + " : " + clz.getClass().getName());
    }

    /**
     * This method demonstrates the class reference from the variable. Demonstrates both KClass and Java class reference.
     */
    public static void classAccessThroughVariable() {
        ClassReference classReference = new ClassReference();

        Class<? extends ClassReference> clz = classReference.getClass();
        System.out.println(clz.getName() + " : " + clz.getClass().getName());
    }

    public static void main(String[] args) {
        directClassAccess();
        classAccessThroughVariable();
    }
}
