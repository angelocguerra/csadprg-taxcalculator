class CalculatorController(calculatorView: CalculatorView, calculatorModel: CalculatorModel)
{
    init {
        // Add an event listener to the calculate button
        calculatorView.setCalculateBtnListener {
            calculatorView.clearPieChart()

            // Get the salary from the text field
            val salary = calculatorView.getSalaryTF()

            // If the salary is not null, calculate the SSS, Pag-Ibig, and PhilHealth contributions
            val incomeTax = calculatorModel.computeIncomeTax(salary)
            val netPayAfterTax = salary - incomeTax
            val sss = calculatorModel.computeSSS(salary)
            val philHealth = calculatorModel.computePhilHealth(salary)
            val pagIbig = calculatorModel.computePagIbig(salary)
            val totalContrib = calculatorModel.computeContribution(salary)
            val totalDedux = calculatorModel.computeTotalDeductions(salary)
            val netPayAfterDedux = salary - totalDedux

            // Set the text of the output text fields to the calculated values
            calculatorView.setIncomeTaxTF(String.format("%.2f", incomeTax))
            calculatorView.setNetPayAfterTax(String.format("%.2f", netPayAfterTax))
            calculatorView.setSSSTF(String.format("%.2f", sss))
            calculatorView.setPhilHealthTF(String.format("%.2f", philHealth))
            calculatorView.setPagIbigTF(String.format("%.2f", pagIbig))
            calculatorView.setTotalContribTF(String.format("%.2f", totalContrib))
            calculatorView.setTotalDeduxTF(String.format("%.2f", totalDedux))
            calculatorView.setNetPayAfterDedux(String.format("%.2f", netPayAfterDedux))
            calculatorView.displayPieChart()
        }
    }
}