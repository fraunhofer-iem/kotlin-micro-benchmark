package de.fraunhofer.iem.functions.localFunctions.inClass

class Incrementer {
    var dummyProperty1 = "dummy"
    private var dummyProperty2 = "dummy"

    /**
     * Demonstrate the local functions in Kotlin
     *
     * Note:
     * 1. There are two local functions with the same name (function overloads)
     *
     * @author Ranjith Krishnamurthy
     */
    fun stepIncrementer(number: Int, iterCount: Int, step: Int): Int {
        var res: Int = number
        var dummyString: String = ""

        fun add(currentIter: Int) {
            if (currentIter > iterCount) {
                return
            }

            res += step

            add(currentIter + 1)
        }

        fun add(currentIter: Int, dummyInt: Int) {
            println("Dummy to test for function overload of local function $currentIter + $dummyInt")
            dummyString = "Dummy to test function overloads in local function"
        }

        val message: String = "Number = $number\nIteration Count = $iterCount\nIncrement step = $step"
        println(message)
        add(1)
        add(1, 0)
        println(dummyString)

        return res
    }

    /**
     * Demonstrate the local functions in Kotlin
     *
     * Note:
     * 1. The local function name is same as the above local functions
     *
     * @author Ranjith Krishnamurthy
     */
    fun stepIncrementer1For10Count(number: Int): Int {
        var step: Int = 1
        val iterCount: Int = 10
        fun add(currentIter: Int, dummyFlag: String): Int {
            this.dummyProperty1 = "Dummy to demonstrate the local functions"
            this.dummyProperty2 = "Dummy to demonstrate the local functions"

            if (currentIter > iterCount + 1) {
                return 0
            }

            if (currentIter > 1) {
                return step + add(currentIter + 1, "")
            }

            return number + add(currentIter + 1, "")
        }

        val message: String = "Number = $number\nIteration Count = $iterCount\nIncrement step = $step"
        println(message)

        return add(1, "")
    }
}