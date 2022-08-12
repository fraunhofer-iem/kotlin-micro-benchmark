package de.fraunhofer.iem.uniqueToKotlin.extensions.extensionsInsideAnotherClass

/**
 * This example is taken form the https://kotlinlang.org/docs/extensions.html#declaring-extensions-as-members
 */
class Host(val hostname: String) {
    fun printHostname() {
        print(hostname)
    }
}

class Connection(val host: Host, val port: Int) {
    private fun printPort() {
        print(port)
    }

    fun Host.printConnectionString() {
        printHostname()   // calls Host.printHostname()
        print(":")
        printPort()   // calls Connection.printPort()
    }

    val Host.fullName
        get() = this.hostname + ":" + this@Connection.port

    fun connect() {
        /*...*/
        println(host.fullName)
        host.printConnectionString()   // calls the extension function
    }
}

fun main() {
    val connection = Connection(Host("dummy.de"), 443)
    connection.connect()
    println(connection.host)
    println(connection.port)
    //Host("dummy.de").printConnectionString()  // error, the extension function is unavailable outside Connection
    //Host("dummy.de").fullName
}