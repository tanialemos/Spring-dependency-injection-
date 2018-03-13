package com.switchfully.domain.TaxCalculation;

import javax.inject.Named;

@Named("AmericanTax")
public class AmericanTaxCalculation implements Calculation {

    public double taxCalculation(double yearlyIncome) {
        return yearlyIncome * 0.18 + 950;
    }

}
