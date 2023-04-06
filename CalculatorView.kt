import java.awt.*
import javax.swing.*

class CalculatorView : JFrame() {
    private val salaryLabel = JLabel("Salary:")
    private val sssLabel = JLabel("SSS Contribution:")
    private val pagIbigLabel = JLabel("Pag-Ibig Contribution:")
    private val philHealthLabel = JLabel("PhilHealth Contribution:")

    private val salaryTextField = JTextField()
    private val sssTextField = JTextField()
    private val pagIbigTextField = JTextField()
    private val philHealthTextField = JTextField()

    private val calculateButton = JButton("Calculate")

    init {
        title = "Salary Deduction Calculator"
        setSize(500, 500)
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        layout = GridLayout(5, 2)
        add(salaryLabel)
        add(salaryTextField)
        add(sssLabel)
        add(sssTextField)
        add(pagIbigLabel)
        add(pagIbigTextField)
        add(philHealthLabel)
        add(philHealthTextField)
        add(calculateButton)
        isVisible = true

        // Add an event listener to the calculate button
        calculateButton.addActionListener {
            // Get the salary from the text field
            val salary = salaryTextField.text.toDoubleOrNull()

            // If the salary is not null, calculate the SSS, Pag-Ibig, and PhilHealth contributions
            if (salary != null) {
                val model = CalculatorModel()
                val sss = model.SSSCalc(salary)
                val pagIbig = model.PagIbigCalc(salary)
                val philHealth = model.PhilHealthCalc(salary)

                // Set the text of the output text fields to the calculated values
                sssTextField.text = String.format("%.2f", sss)
                pagIbigTextField.text = String.format("%.2f", pagIbig)
                philHealthTextField.text = String.format("%.2f", philHealth)
            }
        }
    }

}
