package entity.person;

public class NaturalPerson extends Person{

    public static double ANNUAL_INCOME_EXEMPTION = 5000;
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
        return 0;
    }
}
