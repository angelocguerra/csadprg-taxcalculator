fun main(args: Array<String>) {
    val calculatorView = CalculatorView()
    val calculatorModel = CalculatorModel()
    val calculatorController = CalculatorController(calculatorView, calculatorModel)
}