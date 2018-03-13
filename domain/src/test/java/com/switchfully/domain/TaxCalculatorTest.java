package com.switchfully.domain;

import com.switchfully.domain.TaxCalculation.AmericanTaxCalculation;
import com.switchfully.domain.TaxCalculation.BelgianTaxCalculation;
import com.switchfully.domain.TaxCalculation.FrenchTaxCalculation;
import com.switchfully.domain.TaxCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TaxCalculatorTest {

    private TaxCalculator taxCalculator;

    @Test
    void calculateTaxAmericanTax_given100k_return18950() {
        taxCalculator = new TaxCalculator(new AmericanTaxCalculation());
        double actualResult = taxCalculator.calculateTax(100000);

        Assertions.assertEquals(actualResult,18950);
    }

    @Test
    void calculateTaxBelgianTax_given100k_return45000() {
        taxCalculator = new TaxCalculator(new BelgianTaxCalculation());
        double actualResult = taxCalculator.calculateTax(100000);

        Assertions.assertEquals(actualResult,45000);
    }

    @Test
    void calculateTaxFrenchTax_given100k_return48000() {
        taxCalculator = new TaxCalculator(new FrenchTaxCalculation());
        double actualResult = taxCalculator.calculateTax(100000);

        Assertions.assertEquals(actualResult,48000);
    }
}