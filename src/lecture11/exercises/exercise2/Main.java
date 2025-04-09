package lecture11.exercises.exercise2;

public class Main {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine("LG", 1500, 7);
        Refrigerator refrigerator = new Refrigerator("Samsung", 200);

        // Display general and specific information for WashingMachine
        washingMachine.displayInfo();
        washingMachine.startWashCycle();
        washingMachine.displayInfo();

        // Display general and specific information for Refrigerator
        refrigerator.displayInfo();
        refrigerator.setTemperature(4);
        refrigerator.displayInfo();
    }
}