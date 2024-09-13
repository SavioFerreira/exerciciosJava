package entity.person.pj;

import entity.person.Person;

public abstract class LegalPerson extends Person {

    private double annualTurnover;
    private double annualExpense;

    public LegalPerson(String name, double annualTurnover, double annualExpense) {
        super(name);
        this.annualTurnover = annualTurnover;
        this.annualExpense = annualExpense;
    }

    public double getAnnualTurnover() {
        return annualTurnover;
    }

    public double getAnnualExpense() {
        return annualExpense;
    }

    public double getAnnualProfit() {
        return getAnnualTurnover() - getAnnualExpense();
    }
}
