package entity.person.pj;

public class RealCompanyProfit extends LegalPerson {

    public static final double PROFIT_TAX_RATE = 0.25;

    public RealCompanyProfit(String name, double annualTurnover, double annualExpense) {
        super(name, annualTurnover, annualExpense);
    }

    @Override
    public double taxCalculate() {
        return getAnnualProfit() * PROFIT_TAX_RATE;
    }
}
