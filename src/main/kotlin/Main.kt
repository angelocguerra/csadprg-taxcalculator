/********************************
Names:
    GUERRA, Jose Maria Angelo
    SAYO, Trisha Alissandra
    WANG, Jeremy Cerwin
Language:
    Kotlin
Paradigm:
    Multi-Paradigm: Imperative, Object-Oriented, Functional, etc.
 */
fun main(args: Array<String>) {
    val calculatorView = CalculatorView()
    val calculatorModel = CalculatorModel()
    val calculatorController = CalculatorController(calculatorView, calculatorModel)
}