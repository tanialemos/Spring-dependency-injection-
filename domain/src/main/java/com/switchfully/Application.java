package com.switchfully;

import com.switchfully.domain.TaxCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.switchfully.domain.Application"})
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);

        TaxCalculator taxCalculator = applicationContext.getBean(TaxCalculator.class);

        System.out.println(taxCalculator.calculateTax(100000));

    }

}
