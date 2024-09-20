package entity;

import entity.person.Person;

public class TaxManager {
    private double totalTaxValue;


    public void add(Person person) {
        System.out.println(person.getName() + ": " + person.taxCalculate());
        totalTaxValue += person.taxCalculate();
    }

    public double getTotalTaxValue() {
        return this.totalTaxValue;
    }
}
