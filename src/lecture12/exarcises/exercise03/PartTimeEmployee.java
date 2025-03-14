package lecture12.exarcises.exercise03;

public class PartTimeEmployee extends Employee {
    private double workingHours;
    private double hourlyRate;

    public PartTimeEmployee(int id, String firstName, String lastName, double workingHours, double hourlyRate) {
        super(id, firstName, lastName, 0);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateMonthlySalary() {
        return workingHours * hourlyRate;
    }
}
