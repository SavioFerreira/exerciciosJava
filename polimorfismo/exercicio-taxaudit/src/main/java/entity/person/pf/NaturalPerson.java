package entity.person.pf;

import entity.person.Person;

public class NaturalPerson extends Person {

    public static double ANNUAL_INCOME_EXEMPTION = 50_000;
    public static double INCOME_TAX_RATE = 0.20;
    private double annualRevenue;

    public NaturalPerson(String name, double annualRevenue) {
        super(name);
        this.annualRevenue = annualRevenue;
    }

    public double getAnnualRevenue() {
        return this.annualRevenue;
    }

    @Override
    public double taxCalculate() {
        double finalRevenueValue;
        if(getAnnualRevenue() > ANNUAL_INCOME_EXEMPTION) {
            finalRevenueValue = getAnnualRevenue() * INCOME_TAX_RATE;
        } else {
            finalRevenueValue = 0;
        }
        return finalRevenueValue;
    }
}
