package lecture11.exercises.exercise4;

public class WashingMachine extends Appliance {
    int loadCapacity;

    public WashingMachine(String brand, int powerConsumption, int loadCapacity) {
        super(brand, powerConsumption);
        this.loadCapacity = loadCapacity;
    }

    public void startWashCycle() {
        if (super.isOn) {
            System.out.println("Starting wash cycle with load capacity: " + loadCapacity + "kg.");
        } else {
            System.out.println("Cannot start wash cycle. The washing machine is OFF.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + "kg");
    }

    @Override
    public void factoryReset() {
        super.factoryReset();
        this.loadCapacity = 0;
    }
}