package de.fraunhofer.iem.classesAndObjects.interfaceInKotlin.interfaceInheritance

/**
 * Implements the interface that has multiple inheritance
 *
 * @author Ranjith Krishnamurthy
 */
class Person : Movable {
    override fun jog() {
        println("Jogging")
    }

    override fun run() {
        println("Running")
    }

    override fun walk() {
        println("Walking")
    }

    override fun crawl() {
        println("Crawling")
    }
}