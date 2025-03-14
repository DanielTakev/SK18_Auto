package lecture11.exercises.exercise3;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine("LG", 1500, 7);
        Refrigerator refrigerator = new Refrigerator("Samsung", 200);

        // Update state and display information for WashingMachine
        washingMachine.turnOn();
        washingMachine.startWashCycle();
        washingMachine.displayInfo();

        // Update state and display information for Refrigerator
        refrigerator.turnOn();
        refrigerator.setTemperature(4);
        refrigerator.displayInfo();

        // Use factory reset and display information again for WashingMachine
        washingMachine.factoryReset();
        washingMachine.displayInfo();

        // Use factory reset and display information again for Refrigerator
        refrigerator.factoryReset();
        refrigerator.displayInfo();
    }
}