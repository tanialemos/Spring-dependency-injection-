package com.switchfully.domain;

import com.switchfully.domain.TaxCalculation.Calculation;

import javax.inject.Inject;

public class TaxCalculator {
    private Calculation calculation;

    @Inject
    public TaxCalculator(Calculation calculation) {
        this.calculation = calculation;
    }

    public double calculateTax(double yearlyIncome){
        return calculation.taxCalculation(yearlyIncome);
    }
}
