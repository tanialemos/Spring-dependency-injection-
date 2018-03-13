package com.switchfully.domain.TaxCalculation;

import javax.inject.Named;

@Named("BelgianTax")
public class BelgianTaxCalculation implements Calculation {

    public double taxCalculation(double yearlyIncome) {
        return yearlyIncome * 0.45;
    }

}
