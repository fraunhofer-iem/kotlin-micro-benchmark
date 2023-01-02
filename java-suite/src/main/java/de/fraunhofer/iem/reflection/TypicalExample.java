package de.fraunhofer.iem.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Demonstrates the method and field access through Java reflection
 *
 * @author Ranjith Krishnamurty
 */
public class TypicalExample {

    public static int publicField = 20;

    public static void publicMethod() {
        System.out.println("This is a method with the name publicMethod");
    }

    private static void fieldAccess(Class<?> clz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Field[] fields = clz.getDeclaredFields(); // getDeclaredField can be private or public

        for (Field field : fields) {
            System.out.println(field.getName());
            Object ob = clz.getDeclaredConstructor().newInstance();

            System.out.println(field.get(ob));

            field.set(ob, 50);

            System.out.println(field.get(ob));
        }
    }

    private static void methodAccess(Class<?> clz) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Method[] methods = clz.getDeclaredMethods(); // getDeclaredMethods can be private or public

        for (Method method : methods) {
            if (method.getName().equals("publicMethod")) {
                System.out.println(method.getName());
                Object ob = clz.getDeclaredConstructor().newInstance();

                method.invoke(ob);
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clz = Class.forName("de.fraunhofer.iem.reflection.TypicalExample");

        fieldAccess(clz);
        methodAccess(clz);
    }
}
