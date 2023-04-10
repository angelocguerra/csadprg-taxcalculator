class CalculatorModel {
    /*  SSS Calculator
        - returns the respective SSS contribution based on the salary
    */
    fun computeSSS(salary:Double): Double {
        val SSS: Double = when (salary){
            in 0.0..4249.99 -> 180.0
            in 4250.0..4749.99 -> 202.5
            in 4750.0..5249.99 -> 225.0
            in 5250.0..5749.99 -> 247.5
            in 5750.0..6249.99 -> 270.0
            in 6250.0..6749.99 -> 292.5
            in 6750.0..7249.99 -> 315.0
            in 7250.0..7749.99 -> 337.5
            in 7750.0..8249.99 -> 360.0
            in 8250.0..8749.99 -> 382.5
            in 8750.0..9249.99 -> 405.0
            in 9250.0..9749.99 -> 427.5
            in 9750.0..10249.99 -> 450.0
            in 10250.0..10749.99 -> 472.5
            in 10750.0..11249.99 -> 495.0
            in 11250.0..11749.99 -> 517.5
            in 11750.0..12249.99 -> 540.0
            in 12250.0..12749.99 -> 562.5
            in 12750.0..13249.99 -> 585.0
            in 13250.0..13749.99 -> 607.5
            in 13750.0..14249.99 -> 630.0
            in 14250.0..14749.99 -> 652.5
            in 14750.0..15249.99 -> 675.0
            in 15250.0..15749.99 -> 697.5
            in 15750.0..16249.99 -> 720.0
            in 16250.0..16749.99 -> 742.5
            in 16750.0..17249.99 -> 765.0
            in 17250.0..17749.99 -> 787.5
            in 17750.0..18249.99 -> 810.0
            in 18250.0..18749.99 -> 832.5
            in 18750.0..19249.99 -> 855.0
            in 19250.0..19749.99 -> 877.5
            in 19750.0..20249.99 -> 900.0
            in 20250.0..20749.99 -> 922.5
            in 20750.0..21249.99 -> 945.0
            in 21250.0..21749.99 -> 967.5
            in 21750.0..22249.99 -> 990.0
            in 22250.0..22749.99 -> 1012.5
            in 22750.0..23249.99 -> 1035.0
            in 23250.0..23749.99 -> 1057.5
            in 23750.0..24249.99 -> 1080.0
            in 24250.0..24749.99 -> 1102.5
            else -> 1125.0
        }

        return SSS
    }

    /*  Pag-Ibig Calculator
        - If salary is less than 1,500, Pag-Ibig is 1% of salary
        - If salary is greater than 1,500, Pag-Ibig is 2% of salary
        - If Pag-Ibig is greater than 100, Pag-Ibig is capped at 100
    */
    fun computePagIbig(salary:Double): Double {
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
    fun computePhilHealth(salary:Double): Double {
        if(salary > 0 && salary <= 10000) {
            return (450.0 / 2)
        } else if (salary > 10000 && salary < 80000){
            return ((salary * 0.04) / 2)
        } else {
            return 3200.0 / 2
        }
    }

    /*  Contributions Calculator
        - Returns the total contributions of SSS, Pag-Ibig, and PhilHealth
    */
    fun computeContribution(salary:Double): Double {
        return computeSSS(salary) + computePagIbig(salary) + computePhilHealth(salary)
    }

    /*  Income Tax Calculator
        - Returns the total income tax respective to the taxable income
    */
    fun computeIncomeTax(salary:Double): Double {
        val taxableIncome:Double = salary - computeContribution(salary)
        val incomeTax:Double = when (taxableIncome){
            in 0.0..20833.0 -> 0.0
            in 20833.0..33332.99 -> (taxableIncome - 20833) * 0.20
            in 33333.0..66666.99 -> (taxableIncome - 33333) * 0.25 + 2500
            in 66667.0..166666.99 -> (taxableIncome - 66667) * 0.30 + 10833.33
            in 166667.0..666666.99 -> (taxableIncome - 166667) * 0.32 + 200833.33
            else -> ((taxableIncome - 666667) * 0.35) + 200833.33
        }

        return incomeTax
    }

    /* Total Deductions Calculator
        - Returns the total deductions of contributions and income tax
    */
    fun computeTotalDeductions(salary:Double): Double {
        return computeContribution(salary) + computeIncomeTax(salary)
    }

    /* Net Income Calculator
        - Returns the net income after contributions
    */
    fun computeNetIncome(salary:Double): Double {
        return salary - computeContribution(salary) - computeIncomeTax(salary)
    }
}