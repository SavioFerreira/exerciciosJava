package entity.person.pj;

public class SimpleCompany extends LegalPerson {

    public static final double TAX_RATE_BILLING = 0.06;

    public SimpleCompany(String name, double annualTurnover, double annualExpense) {
        super(name, annualTurnover, annualExpense);
    }

    @Override
    public double taxCalculate() {
        return getAnnualTurnover() * TAX_RATE_BILLING;
    }
}
