import entity.Developer;
import entity.Employee;

public class App {
    public static void main(String[] args) {
        var employee = new Employee("zoro", 20);

        System.out.println(employee);
        System.out.println(employee.generatePayslip(200, "24/09"));
        System.out.println();
    }
}
