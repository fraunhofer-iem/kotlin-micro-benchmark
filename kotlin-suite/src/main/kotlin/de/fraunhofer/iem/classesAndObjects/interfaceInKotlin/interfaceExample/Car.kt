package de.fraunhofer.iem.classesAndObjects.interfaceInKotlin.interfaceExample

/**
 * Demonstrates the implementing the interface in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
class Car : Vehicle {
    private var isStart = false
    private var currentSpeed = 0
    private var currentGear = 0

    override fun start() {
        if (isStart) {
            println("Car is already started.")
        }

        isStart = true
    }

    override fun stop() {
        if (!isStart) {
            println("Car is already stopped.")
        }

        isStart = false
    }

    override fun accelerate(speed: Int) {
        val maxSpeed = 320
        if (currentGear == 0) {
            currentSpeed = if (speed > maxSpeed) maxSpeed else speed
        } else if (currentGear == 1) {
            currentSpeed = if (speed > 2) {
                println("First gear is to just move the car.\nPlease change the gear to 2")
                2
            } else {
                speed
            }
        } else if (currentGear == 2) {
            currentSpeed = if (speed > 20) {
                println("20 kmph is the max speed for 2nd gear\nPlease change the gear to 3")
                20
            } else {
                speed
            }
        } else if (currentGear == 3) {
            currentSpeed = if (speed > 70) {
                println("70 kmph is the max speed for 3rd gear\nPlease change the gear to 4")
                70
            } else {
                speed
            }
        } else if (currentGear == 4) {
            currentSpeed = if (speed > 120) {
                println("120 kmph is the max speed for 4th gear\nPlease change the gear to 5")
                120
            } else {
                speed
            }
        } else if (currentGear == 5) {
            currentSpeed = if (speed > 250) {
                println("250 kmph is the max speed for 5th gear\nPlease change the gear to 6")
                250
            } else {
                speed
            }
        } else if (currentGear == 6) {
            currentSpeed = if (speed > maxSpeed) {
                println("$maxSpeed kmph is the max speed for 6th gear\n")
                maxSpeed
            } else {
                speed
            }
        }
    }

    override fun changeGear(to: Int) {
        if (to in 0..6) currentGear = to else System.err.println("$to is wrong gear")
    }

    override fun getCurrentSpeed(): Int {
        return this.currentSpeed
    }
}