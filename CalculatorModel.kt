class CalculatorModel {
    
    // Code could still be optimized
    // Some parts still missing

    /*  SSS Calculator
        - returns the respective SSS contribution based on the salary
    */ 
    fun SSSCalc(salary:Double): Double {
        var SSS: Double = when {
            salary < 4250 -> 180.0
            salary >=4250 && salary <= 4749.99 -> 202.5
            salary >=4750 && salary <= 5249.99 -> 225.0
            salary >=5250 && salary <= 5749.99 -> 247.5
            salary >=5750 && salary <= 6249.99 -> 270.0
            salary >=6250 && salary <= 6749.99 -> 292.5
            salary >=6750 && salary <= 7249.99 -> 315.0
            salary >=7250 && salary <= 7749.99 -> 337.5
            salary >=7750 && salary <= 8249.99 -> 360.0
            salary >=8250 && salary <= 8749.99 -> 382.5
            salary >=8750 && salary <= 9249.99 -> 405.0
            salary >=9250 && salary <= 9749.99 -> 427.5
            salary >=9750 && salary <= 10249.99 -> 450.0
            salary >=10250 && salary <= 10749.99 -> 472.5
            salary >=10750 && salary <= 11249.99 -> 495.0
            salary >=11250 && salary <= 11749.99 -> 517.5
            salary >=11750 && salary <= 12249.99 -> 540.0
            salary >=12250 && salary <= 12749.99 -> 562.5
            salary >=12750 && salary <= 13249.99 -> 585.0
            salary >=13250 && salary <= 13749.99 -> 607.5
            salary >=13750 && salary <= 14249.99 -> 630.0
            salary >=14250 && salary <= 14749.99 -> 652.5
            salary >=14750 && salary <= 15249.99 -> 675.0
            salary >=15250 && salary <= 15749.99 -> 697.5
            salary >=15750 && salary <= 16249.99 -> 720.0
            salary >=16250 && salary <= 16749.99 -> 742.5
            salary >=16750 && salary <= 17249.99 -> 765.0
            salary >=17250 && salary <= 17749.99 -> 787.5
            salary >=17750 && salary <= 18249.99 -> 810.0
            salary >=18250 && salary <= 18749.99 -> 832.5
            salary >=18750 && salary <= 19249.99 -> 855.0
            salary >=19250 && salary <= 19749.99 -> 877.5
            salary >=19750 && salary <= 20249.99 -> 900.0
            salary >=20250 && salary <= 20749.99 -> 922.5
            salary >=20750 && salary <= 21249.99 -> 945.0
            salary >=21250 && salary <= 21749.99 -> 967.5
            salary >=21750 && salary <= 22249.99 -> 990.0
            salary >=22250 && salary <= 22749.99 -> 1012.5
            salary >=22270 && salary <= 23249.99 -> 1035.0
            salary >=23250 && salary <= 23749.99 -> 1057.5
            salary >=23750 && salary <= 24249.99 -> 1080.0
            salary >=24250 && salary <= 24279.99 -> 1102.5
            salary >=24750 && salary <= 25249.99 -> 1125.0
            salary >=25250 && salary <= 25749.99 -> 1147.5
            salary >=25750 && salary <= 26249.99 -> 1170.0
            salary >=26250 && salary <= 26749.99 -> 1192.5
            salary >=26750 && salary <= 27249.99 -> 1215.0
            salary >=27250 && salary <= 27749.99 -> 1237.5
            salary >=27750 && salary <= 28249.99 -> 1260.0
            salary >=28250 && salary <= 28749.99 -> 1282.5
            salary >=28750 && salary <= 29249.99 -> 1305.0
            salary >=29250 && salary <= 29749.99 -> 1327.5
            else -> 1350.0
        } 
        
        return SSS
    }

    /*  Pag-Ibig Calculator 
        - If salary is less than 1,500, Pag-Ibig is 1% of salary
        - If salary is greater than 1,500, Pag-Ibig is 2% of salary
        - If Pag-Ibig is greater than 100, Pag-Ibig is capped at 100
    */
    fun PagIbigCalc(salary:Double): Double {
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
    fun PhilHealthCalc(salary:Double): Double {
        if(salary > 0 && salary <= 10000) {
            return (450.0 / 2)
        } else if (salary > 10000 && salary < 90000){
            return ((salary * 0.45) / 2)
        } else {
            return 4050.0
        }
    }

    /*  Contributions Calculator
        - Returns the total contributions of SSS, Pag-Ibig, and PhilHealth
    */
    fun ContributionsCalc(salary:Double): Double {
        return SSSCalc(salary) + PagIbigCalc(salary) + PhilHealthCalc(salary)
    }

    /*  Income Tax Calculator
        - Returns the total income tax respective to the taxable income
    */ 
    fun IncomeTaxCalc(salary:Double): Double {
        var taxableIncome:Double = salary - ContributionsCalc(salary)
        var incomeTax:Double = when {
            taxableIncome <= 20833 -> 0.0
            taxableIncome >= 20833 && taxableIncome <= 33332 -> (taxableIncome - 20833) * 0.15
            taxableIncome >= 33333 && taxableIncome <= 66666 -> ((taxableIncome - 33333) * 0.20) + 2500
            taxableIncome >= 66667 && taxableIncome <= 166666 -> ((taxableIncome - 66667) * 0.25) + 10833.33
            taxableIncome >= 166667 && taxableIncome <= 666666 -> ((taxableIncome - 166667) * 0.30) + 40833.33
            else -> ((taxableIncome - 666667) * 0.32) + 200833.33
        }

        return incomeTax
    }

    /* Net Pay Calculator
        - Returns the net pay before contributions and after income tax 
    */
    fun NetPayCalc(salary:Double): Double {
        return salary - IncomeTaxCalc(salary)
    }

    /* Net Income Calculator
        - Returns the net income after contributions 
    */
    fun NetIncomeCalc(salary:Double): Double {
        return salary - ContributionsCalc(salary) - IncomeTaxCalc(salary)
    }

    fun main() {
        var salary = 20000.0
        println(SSSCalc(salary))
        println(PagIbigCalc(salary))
        println(PhilHealthCalc(salary))
        println(ContributionsCalc(salary))
        println(IncomeTaxCalc(salary))
        println(NetPayCalc(salary))
        println(NetIncomeCalc(salary))
    }
}