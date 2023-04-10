import javax.swing.JTextField
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JFrame
import javax.swing.ImageIcon

import java.awt.Color
import java.awt.FlowLayout
import java.awt.Font
import java.awt.event.ActionListener

class CalculatorView : JFrame() {

    private val backgroundLbl = JLabel(ImageIcon("/Users/angeloguerra/Downloads/csadprg/src/main/resources/Assets/taxcalc-background.png"))

    private val salaryTF = JTextField()
    private val incomeTaxTF = JTextField()
    private val netPayAfterTaxTF = JTextField()
    private val sssTF = JTextField()
    private val pagIbigTF = JTextField()
    private val philHealthTF = JTextField()
    private val totalContribTF = JTextField()
    private val totalDeduxTF = JTextField()
    private val netPayAfterDeduxTF = JTextField()

    private var calculateButton = JButton("CALCULATE")

    init {
        title = "Tax Calculator"
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setSize(1200, 780)
        isResizable = false
        layout = FlowLayout()

        // Background
        backgroundLbl.setBounds(0,0,1200,750)
        add(backgroundLbl)
        backgroundLbl.layout = null

        // Salary Text Field
        salaryTF.setBounds(470,15,370,77)
        salaryTF.background = Color(217,217,217)
        salaryTF.isOpaque = true
        salaryTF.font = Font("RedHatDisplay-Bold", Font.PLAIN, 40)
        salaryTF.horizontalAlignment = JTextField.CENTER
        backgroundLbl.add(salaryTF)

        // Calculate Button
        calculateButton.setBounds(875, 24, 195, 60)
        calculateButton.background = Color(84,84,84)
        calculateButton.isBorderPainted = false
        calculateButton.foreground = Color(255,255,255)
        calculateButton.isOpaque = true
        calculateButton.font = Font("RedHatDisplay-Bold", Font.PLAIN, 23)
        backgroundLbl.add(calculateButton)

        // Income Tax Text Field
        incomeTaxTF.setBounds(352,147,225,39)
        incomeTaxTF.background = Color(145,145,145)
        incomeTaxTF.isOpaque = true
        incomeTaxTF.isEditable = false
        incomeTaxTF.font = Font("RedHatDisplay-Bold", Font.PLAIN, 18)
        incomeTaxTF.horizontalAlignment = JTextField.CENTER
        backgroundLbl.add(incomeTaxTF)

        // Net Pay After Tax Text Field
        netPayAfterTaxTF.setBounds(352,222,225,39)
        netPayAfterTaxTF.background = Color(145,145,145)
        netPayAfterTaxTF.isOpaque = true
        netPayAfterTaxTF.isEditable = false
        netPayAfterTaxTF.font = Font("RedHatDisplay-Bold", Font.PLAIN, 18)
        netPayAfterTaxTF.horizontalAlignment = JTextField.CENTER
        backgroundLbl.add(netPayAfterTaxTF)

        // SSS Text Field
        sssTF.setBounds(352,297,225,39)
        sssTF.background = Color(145,145,145)
        sssTF.isOpaque = true
        sssTF.isEditable = false
        sssTF.font = Font("RedHatDisplay-Bold", Font.PLAIN, 18)
        sssTF.horizontalAlignment = JTextField.CENTER
        backgroundLbl.add(sssTF)

        // PhilHealth Text Field
        philHealthTF.setBounds(352,372,225,39)
        philHealthTF.background = Color(145,145,145)
        philHealthTF.isOpaque = true
        philHealthTF.isEditable = false
        philHealthTF.font = Font("RedHatDisplay-Bold", Font.PLAIN, 18)
        philHealthTF.horizontalAlignment = JTextField.CENTER
        backgroundLbl.add(philHealthTF)

        // Pag-Ibig Text Field
        pagIbigTF.setBounds(352,446,225,39)
        pagIbigTF.background = Color(145,145,145)
        pagIbigTF.isOpaque = true
        pagIbigTF.isEditable = false
        pagIbigTF.font = Font("RedHatDisplay-Bold", Font.PLAIN, 18)
        pagIbigTF.horizontalAlignment = JTextField.CENTER
        backgroundLbl.add(pagIbigTF)

        // Total Contributions Text Field
        totalContribTF.setBounds(352,521,225,39)
        totalContribTF.background = Color(145,145,145)
        totalContribTF.isOpaque = true
        totalContribTF.isEditable = false
        totalContribTF.font = Font("RedHatDisplay-Bold", Font.PLAIN, 18)
        totalContribTF.horizontalAlignment = JTextField.CENTER
        backgroundLbl.add(totalContribTF)

        // Total Deductions Text Field
        totalDeduxTF.setBounds(352,596,225,39)
        totalDeduxTF.background = Color(145,145,145)
        totalDeduxTF.isOpaque = true
        totalDeduxTF.isEditable = false
        totalDeduxTF.font = Font("RedHatDisplay-Bold", Font.PLAIN, 18)
        totalDeduxTF.horizontalAlignment = JTextField.CENTER
        backgroundLbl.add(totalDeduxTF)

        // Net Pay After Deductions Text Field
        netPayAfterDeduxTF.setBounds(352,671,225,39)
        netPayAfterDeduxTF.background = Color(145,145,145)
        netPayAfterDeduxTF.isOpaque = true
        netPayAfterDeduxTF.isEditable = false
        netPayAfterDeduxTF.font = Font("RedHatDisplay-Bold", Font.PLAIN, 18)
        netPayAfterDeduxTF.horizontalAlignment = JTextField.CENTER
        backgroundLbl.add(netPayAfterDeduxTF)

        // Pie Chart


        isVisible = true
    }

    // Setter for calculateButton
    fun setCalculateBtnListener(actionListener: ActionListener) {
        this.calculateButton.addActionListener(actionListener)
    }

    // Getter for salaryTextField
    fun getSalaryTF(): Double? {
        return this.salaryTF.text.toDoubleOrNull()
    }

    // Setter for Income Tax Text Field
    fun setIncomeTaxTF(incomeTax: String) {
        this.incomeTaxTF.text = incomeTax
    }

    // Setter for Net Pay After Tax Text Field
    fun setNetPayAfterTax(netPayAfterTax: String) {
        this.netPayAfterTaxTF.text = netPayAfterTax
    }

    // Setter for SSS Text Field
    fun setSSSTF(SSS: String) {
        this.sssTF.text = SSS
    }

    // Setter for PhilHealth Text Field
    fun setPhilHealthTF(philHealth: String) {
        this.philHealthTF.text = philHealth
    }

    // Setter for Pag-Ibig Text Field
    fun setPagIbigTF(pagIbig: String) {
        this.pagIbigTF.text = pagIbig
    }

    // Setter for Total Contributions Text Field
    fun setTotalContribTF(totalContrib: String) {
        this.totalContribTF.text = totalContrib
    }

    // Setter for Total Deductions Text Field
    fun setTotalDeduxTF(totalDedux: String) {
        this.totalDeduxTF.text = totalDedux
    }

    // Setter for Net Pay After Deductions Text Field
    fun setNetPayAfterDedux(netPayAfterDedux: String) {
        this.netPayAfterDeduxTF.text = netPayAfterDedux
    }
}