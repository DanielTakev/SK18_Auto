package lecture12.exarcises.exercise03;

public class Main {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee(1, "John", "Doe", 3000);
        Employee partTimeEmployee = new PartTimeEmployee(2, "Jane", "Smith", 80, 20);

        System.out.println(fullTimeEmployee.getName() + " Monthly Salary: " + fullTimeEmployee.calculateMonthlySalary());
        System.out.println(partTimeEmployee.getName() + " Monthly Salary: " + partTimeEmployee.calculateMonthlySalary());
    }
}