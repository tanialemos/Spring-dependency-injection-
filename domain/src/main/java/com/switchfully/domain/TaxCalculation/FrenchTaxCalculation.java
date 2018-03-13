package com.switchfully.domain.TaxCalculation;

import javax.inject.Named;

@Named("FrenchTax")
public class FrenchTaxCalculation implements Calculation {

    public double taxCalculation(double yearlyIncome) {
        return yearlyIncome * 0.48;
    }

}
