package com.switchfully.domain;

import com.switchfully.domain.TaxCalculation.AmericanTaxCalculation;
import com.switchfully.domain.TaxCalculation.BelgianTaxCalculation;
import com.switchfully.domain.TaxCalculation.FrenchTaxCalculation;
import com.switchfully.domain.TaxCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.verification.Times;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class TaxCalculatorTest {

    @Mock
    private AmericanTaxCalculation americanTax = new AmericanTaxCalculation();

    @InjectMocks
    private TaxCalculator taxCalculator;

    @Test
    void calculateTaxt_givenAmericantax_verifyMethodOfAmericanTaxIsCalled(){
        taxCalculator.calculateTax(100000);

        Mockito.verify(americanTax, new Times(1)).taxCalculation(100000);
    }

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