package lecture13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person child = new Child("Alice", "female", "Catholic", "English", "American", "8001011234", "USA");
        Person american = new American("John", "male", "Catholic", "Teacher", "6903123456", "USA");
        Person italian = new Italian("Maria", "female", "Catholic", "Doctor", "5507078901", "Italy");

        Person bulgarian = new Bulgarian("Ivan", "male", "Orthodox", "Engineer", "7505056789", "Bulgaria");
        Bulgarian bashBulgarian = new Bulgarian("Bai", "male", "Ortodox", "Grynchar", "9104110000", "Bulgaria");

        child.sayHello();
        child.celebrateEaster();
        System.out.println("Is adult: " + child.isAdult());
        System.out.println("Can take loan: " + child.canTakeLoan());
        ((Child) child).play("doll");

        bulgarian.sayHello();
        bulgarian.celebrateEaster();
        System.out.println("Is adult: " + bulgarian.isAdult());
        System.out.println("Can take loan: " + bulgarian.canTakeLoan());
        ((Bulgarian) bulgarian).celebrateBabaMarta();
        // Type Bulgarian:
        bashBulgarian.celebrateBabaMarta();

        american.sayHello();
        american.celebrateEaster();
        System.out.println("Is adult: " + american.isAdult());
        System.out.println("Can take loan: " + american.canTakeLoan());
        ((American) american).celebrateThanksgiving();

        italian.sayHello();
        italian.celebrateEaster();
        System.out.println("Is adult: " + italian.isAdult());
        System.out.println("Can take loan: " + italian.canTakeLoan());
        ((Italian) italian).makePizza(List.of("tomato", "cheese", "basil"));
    }
}