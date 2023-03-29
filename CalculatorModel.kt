class CalculatorModel {
    
    // TODO: SSS Calculator
    fun SSSCalc(salary:Double) {

    }

    /*  Pag-Ibig Calculator 
        - If salary is less than 1,500, Pag-Ibig is 1% of salary
        - If salary is greater than 1,500, Pag-Ibig is 2% of salary
        - If Pag-Ibig is greater than 100, Pag-Ibig is capped at 100
    */
    fun PagIbigCalc(salary:Double):Double {
        var pagibig:Double
        
        if(salary < 1500) {
            pagibig = salary * 0.01
        } else {
            pagibig = salary * 0.02
        }
        
        if(pagibig > 100) {
            pagibig = 100.0
        }

        return pagibig
    }

    /*  PhilHealth Calculator
        - If salary is less than 10,000, PhilHealth is 225
        - If salary is in between 10,000 and 90,000, PhilHealth is 2.25% of salary
        - If salary is greater than 90,000, PhilHealth is capped at 4050
    */
    fun PhilHealthCalc(salary:Double):Double {
        if(salary > 0 && salary < 10000) {
            return 225.0
        } else if (salary > 10000 && salary < 90000){
            return salary * 0.225
        } else {
            return 4050.0
        }
    }

    // TODO: Tax Calculator
    fun TaxCalc() {

    }
}