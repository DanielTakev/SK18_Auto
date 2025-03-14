package lecture12.exarcises.exercise03;

public abstract class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double baseSalary;

    public Employee(int id, String firstName, String lastName, double baseSalary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateMonthlySalary();

    protected double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public double getAnnualSalary() {
        return 12 * baseSalary;
    }

    public double raiseSalary(double percentage) {
        baseSalary = baseSalary + (baseSalary * (percentage / 100));
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + baseSalary +
                '}';
    }
}
