package lecture12.examples.abstraction.abstractionclass;

public abstract class Vehicle {
    private String regNumber;
    private int maxSpeed;
    private int currentSpeed;
    private String brand;
    private String model;
    private double fuelConsumption;

    public Vehicle(String brand, String model, int maxSpeed) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }

    public abstract void inspect();

    public abstract void drive();

    public void startEngine() {
        System.out.println(brand + " " + model + " engine started.");
    }

    public void stopEngine() {
        System.out.println(brand + " " + model + " engine stopped.");
    }

    private void updateFuelConsumption(int increment) {
        fuelConsumption += increment * 0.05;
    }

    public void accelerate(int increment) {
        if (currentSpeed + increment <= maxSpeed) {
            currentSpeed += increment;
            updateFuelConsumption(increment);
            System.out.println(brand + " " + model + " accelerated to " + currentSpeed + " km/h. Fuel consumption: " + fuelConsumption + " L/100km");
        } else {
            currentSpeed = maxSpeed;
            System.out.println(brand + " " + model + " is at max speed: " + maxSpeed + " km/h");
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}