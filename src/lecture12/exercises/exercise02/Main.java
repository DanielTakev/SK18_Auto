package lecture12.exarcises.exercise02;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Alice", "Johnson", 2500);

        System.out.println("Employee Details: " + employee);
        System.out.println("Annual Salary: " + employee.getAnnualSalary());

        employee.raiseSalary(10);
        System.out.println("New Salary after 10% raise: " + employee.getAnnualSalary());
    }
}