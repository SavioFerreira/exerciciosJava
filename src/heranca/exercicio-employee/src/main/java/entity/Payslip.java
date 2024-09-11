package entity;

public record Payslip(String name, String month, double salaryValue) {

    public void print() {
        System.out.printf("Employee name: %s\nMonth and year: %s\nSalary value: %.2f ", name(), month(), salaryValue());
    }
}
