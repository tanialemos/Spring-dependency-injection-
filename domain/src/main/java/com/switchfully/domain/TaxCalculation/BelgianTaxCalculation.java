package com.switchfully.domain.TaxCalculation;

import org.springframework.context.annotation.Primary;

import javax.inject.Named;

@Named("BelgianTax")
@Primary
public class BelgianTaxCalculation implements Calculation {

    public double taxCalculation(double yearlyIncome) {
        return yearlyIncome * 0.45;
    }

}
