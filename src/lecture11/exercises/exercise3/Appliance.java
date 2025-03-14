package lecture11.exercises.exercise3;

public class Appliance {
    String brand;
    int powerConsumption;
    boolean isOn;

    public Appliance(String brand, int powerConsumption) {
        this.brand = brand;
        this.powerConsumption = powerConsumption;
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println(brand + " appliance is now ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(brand + " appliance is now OFF.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Power Consumption: " + powerConsumption + "W");
        System.out.println("Status: " + (isOn ? "ON" : "OFF"));
    }

    public void factoryReset() {
        turnOff();
    }
}