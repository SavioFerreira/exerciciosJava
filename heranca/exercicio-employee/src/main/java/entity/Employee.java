package entity;

public class Employee {

    private String name;
    private double hourlyRate;

    public Employee(String name, double hourlyRate){
        this.name = name;
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    protected double calculateSalary(int workedHours) {
        return workedHours * getHourlyRate();
    }

    public Payslip generatePayslip(int workedHours, String yearMonth) {
        return  new Payslip(getName(), yearMonth, calculateSalary(workedHours));
    }

    @Override
    public String toString() {
        return "[Employee Name: " + getName() + ", hourly value " + getHourlyRate() + "]";
    }
}
