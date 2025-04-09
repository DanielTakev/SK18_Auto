package lecture11.exercises.exercise4;

public class Main {
    public static void main(String[] args) {
        Microwave microwave = new Microwave("Panasonic", 1200, 200, 30);

        // Update state and display information for Microwave
        microwave.turnOn();
        microwave.setTemperature(150);
        microwave.putFood(10);
        microwave.startHeating();
        microwave.displayInfo();

        // Use factory reset and display information again for Microwave
        microwave.factoryReset();
        microwave.displayInfo();
    }
}