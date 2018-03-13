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

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class TaxCalculatorTest {

    @Mock
    private AmericanTaxCalculation americanTax;

    @InjectMocks
    private TaxCalculator taxCalculator;

    // MOCKING WITH WHEN
    @Test
    void calculateTaxAmericanTax_given100k_return18950() {
        when(americanTax.taxCalculation(100000)).thenReturn(18950.0);
        double actualResult = taxCalculator.calculateTax(100000);

        Assertions.assertEquals(actualResult,18950);
    }

//    @Test
//    void calculateTaxBelgianTax_given100k_return45000() {
//        when(americanTax.taxCalculation(100000.0)).thenReturn(45000.0);
//
//        double actualResult = taxCalculator.calculateTax(100000.0);
//
//        Assertions.assertEquals(actualResult,45000.0);
//    }

    // NO-MOCKING
    @Test
    void calculateTaxFrenchTax_given100k_return48000() {
        taxCalculator = new TaxCalculator(new FrenchTaxCalculation());
        double actualResult = taxCalculator.calculateTax(100000);

        Assertions.assertEquals(actualResult,48000);
    }
}