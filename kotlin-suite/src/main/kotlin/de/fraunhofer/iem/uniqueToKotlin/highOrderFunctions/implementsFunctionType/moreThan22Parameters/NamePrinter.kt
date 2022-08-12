package de.fraunhofer.iem.uniqueToKotlin.highOrderFunctions.implementsFunctionType.moreThan22Parameters

/**
 * Demonstrate the class that implements the function type with more than 22 parameters in Kotlin
 *
 * @author Ranjith Krishnamurthy
 */
class NamePrinter : (
    String, String, String, String, String,
    String, String, String, String, String,
    String, String, String, String, String,
    String, String, String, String, String,
    String, String, String, String, String
) -> String {

    override fun invoke(
        p1: String,
        p2: String,
        p3: String,
        p4: String,
        p5: String,
        p6: String,
        p7: String,
        p8: String,
        p9: String,
        p10: String,
        p11: String,
        p12: String,
        p13: String,
        p14: String,
        p15: String,
        p16: String,
        p17: String,
        p18: String,
        p19: String,
        p20: String,
        p21: String,
        p22: String,
        p23: String,
        p24: String,
        p25: String
    ): String {
        return "$p1,$p2,$p3,$p4,$p5,$p6,$p7,$p8,$p9,$p10,$p11,$p12,$p13,$p14,$p15,$p16,$p17,$p18,$p19,$p20,$p21,$p22,$p23,$p24,$p25"
    }
}