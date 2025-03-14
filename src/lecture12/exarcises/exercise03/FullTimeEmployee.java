package lecture12.exarcises.exercise03;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int id, String firstName, String lastName, double baseSalary) {
        super(id, firstName, lastName, baseSalary);
    }

    @Override
    public double calculateMonthlySalary() {
        return getBaseSalary();
    }
}