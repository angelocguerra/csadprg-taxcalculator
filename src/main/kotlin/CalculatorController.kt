class CalculatorController(calculatorView: CalculatorView, calculatorModel: CalculatorModel)
{
    // Instantiate classes
    val model = CalculatorModel()
    val view = CalculatorView()

    init {
        // Add an event listener to the calculate button
        this.view.setCalculateBtnListener() {
            // Get the salary from the text field
            val salary = view.getSalaryTF()

            // If the salary is not null, calculate the SSS, Pag-Ibig, and PhilHealth contributions
            if (salary != null) {
                val incomeTax = model.computeIncomeTax(salary)
                val netPayAfterTax = model.computeNetIncome(salary)
                val sss = model.computeSSS(salary)
                val philHealth = model.computePhilHealth(salary)
                val pagIbig = model.computePagIbig(salary)
                val totalContrib = model.computeContribution(salary)
                val totalDedux = model.computeTotalDeductions(salary)
                val netPayAfterDedux = salary - totalDedux

                // Set the text of the output text fields to the calculated values
                view.setIncomeTaxTF(String.format("%.2f", incomeTax))
                view.setNetPayAfterTax(String.format("%.2f", netPayAfterTax))
                view.setSSSTF(String.format("%.2f", sss))
                view.setPhilHealthTF(String.format("%.2f", philHealth))
                view.setPagIbigTF(String.format("%.2f", pagIbig))
                view.setTotalContribTF(String.format("%.2f", totalContrib))
                view.setTotalDeduxTF(String.format("%.2f", totalDedux))
                view.setNetPayAfterDedux(String.format("%.2f", netPayAfterDedux))
            }
        }
    }
}