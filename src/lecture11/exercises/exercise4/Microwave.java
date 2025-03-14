package lecture11.exercises.exercise4;

public class Microwave extends Appliance {
    int maxTemperature;
    int currentTemperature;
    int capacity;
    int currentLoad;

    public Microwave(String brand, int powerConsumption, int maxTemperature, int capacity) {
        super(brand, powerConsumption);
        this.maxTemperature = maxTemperature;
        this.currentTemperature = 0;
        this.capacity = capacity;
        this.currentLoad = 0;
    }

    public void setTemperature(int temperature) {
        if (temperature >= 10 && temperature <= maxTemperature) {
            this.currentTemperature = temperature;
            System.out.println("Temperature set to: " + this.currentTemperature + "°C");
        } else {
            System.out.println("Temperature must be between 10°C and " + maxTemperature + "°C");
        }
    }

    public void putFood(int foodVolume) {
        if (currentLoad + foodVolume <= capacity) {
            currentLoad += foodVolume;
            System.out.println("Added " + foodVolume + " liters of food. Current load: " + currentLoad + " liters.");
        } else {
            System.out.println("Cannot add food. Exceeds capacity of " + capacity + " liters.");
        }
    }

    public void startHeating() {
        if (currentTemperature > 0) {
            System.out.println("Heating food at " + currentTemperature + "°C.");
        } else {
            System.out.println("Cannot start heating. Temperature is not set.");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Max Temperature: " + maxTemperature + "°C");
        System.out.println("Current Temperature: " + currentTemperature + "°C");
        System.out.println("Capacity: " + capacity + " liters");
        System.out.println("Current Load: " + currentLoad + " liters");
    }

    @Override
    public void factoryReset() {
        super.factoryReset();
        this.currentTemperature = 0;
        this.currentLoad = 0;
    }
}