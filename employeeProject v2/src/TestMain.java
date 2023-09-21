import java.util.Date;
import employee.*;

public class TestMain {

    public static void main(String[] args) {
        employee employee1 = new HourlyEmployee(1, "Nino", new Date(), new Date(), 40, 60);
        employee employee2 = new HourlyEmployee(2, "Ed", new Date(), new Date(), 49, 65);
        employee employee3 = new BasePlusCommissionEmployee(3, "James", new Date(), new Date(), 23000, 5000);
        employee employee4 = new BasePlusCommissionEmployee(4, "Dan", new Date(), new Date(), 5000, 5000);

        System.out.println("Employee 1:");
        employee1.displayInfo();

        System.out.println("\nEmployee 2:");
        employee2.displayInfo();

        System.out.println("\nEmployee 3:");
        employee3.displayInfo();

        System.out.println("\nEmployee 4:");
        employee4.displayInfo();
    }
}
