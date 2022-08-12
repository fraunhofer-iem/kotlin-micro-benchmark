package de.fraunhofer.iem.classesAndObjects.delegation.delegationInheritance

/**
 * Train delegates all the overridden method, But not the property.
 * Therefore, if the property is used in any of the method, then Train will not be used
 * rather delegated class property will be used.
 *
 * @author Ranjith Krishnamurthy
 */
class Train(vehicle: Vehicle) : Vehicle by vehicle {
    override val vehicleType: String = "Train"
}