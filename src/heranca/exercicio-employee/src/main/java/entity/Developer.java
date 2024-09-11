package entity;

public class Developer extends Employee{
    private double bonusPercent;

    public Developer(String name, double hourlyRate) {
        super(name, hourlyRate);
    }

    public double getBonusPercent() {
        return bonusPercent;
    }

    public void setBonusPercent(double bonusPercent){
        this.bonusPercent = bonusPercent;
    }

    @Override
    protected final double calculateSalary(int workedHours) {
        double finalValue;
        double bonusValue = ((getHourlyRate() * getBonusPercent()) * workedHours);
        double bonusCalculation =  (getHourlyRate() * workedHours) + bonusValue ;

        finalValue = getBonusPercent() == 0 ? super.calculateSalary(workedHours) : bonusCalculation;
        return  finalValue;
    }

    @Override
    public String toString() {
        return  "[Developer " + super.toString() +
                " | Percent of developer Bonus: " + String.format("%.0f", (getBonusPercent() * 100)) + "%]";
    }
}
