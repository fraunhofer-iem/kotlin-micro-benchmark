package de.fraunhofer.iem.classesAndObjects.inlineClass.representationOfInlineClass

import de.fraunhofer.iem.classesAndObjects.inlineClass.inheritanceInInlineClass.UserName
import de.fraunhofer.iem.classesAndObjects.inlineClass.inheritanceInInlineClass.UserNamePrinter

fun asInline(userName: UserName) {}
fun <T> asGeneric(userName: T) {}
fun asInterface(userNamePrinter: UserNamePrinter) {}
fun asNullable1(userName: UserName?) {
}
fun asNullable2(userName: UserName?) {
    println(userName?.userNameInUpperCase)
}

fun <T> id(userName: T): T = userName

fun main() {
    val userName = UserName("Ranjith")

    asInline(userName)    // unboxed: used as Foo itself
    asGeneric(userName)   // boxed: used as generic type T
    asInterface(userName) // boxed: used as type I
    asNullable1(userName)  // boxed: used as Foo?, which is different from Foo
    asNullable2(userName)
    // below, 'f' first is boxed (while being passed to 'id') and then unboxed (when returned from 'id')
    // In the end, 'c' contains unboxed representation (just '42'), as 'f'
    val c = id(userName)
}