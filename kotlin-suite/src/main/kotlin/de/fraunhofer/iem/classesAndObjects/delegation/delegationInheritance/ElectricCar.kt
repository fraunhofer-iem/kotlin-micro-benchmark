package de.fraunhofer.iem.classesAndObjects.delegation.delegationInheritance

/**
 * Electric car implements the Vehicle completely by delegating
 *
 * @author Ranjith Krishnamurthy
 */
class ElectricCar(vehicle: Vehicle) : Vehicle by vehicle