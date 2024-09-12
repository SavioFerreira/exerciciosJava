import entity.Developer;
import entity.Employee;

public class App {
    public static void main(String[] args) {
        var employee = new Employee("zoro", 20);
        var dev = new Developer("saviofc", 20);

        System.out.println(employee);
        System.out.println(employee.generatePayslip(200, "24/09"));
        System.out.println();

        System.out.println(dev);
        System.out.println(dev.generatePayslip(200, "24/09"));
        System.out.println();

        System.out.println("Including developer bonus!");
        dev.setBonusPercent(0.4);
        System.out.println(dev.generatePayslip(200, "24/09"));
        System.out.println(dev);
    }
}
