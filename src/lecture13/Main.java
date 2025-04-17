package lecture13;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set child name: ");
        String childName = scanner.nextLine();
        Person child = new Child(childName, "female", "Catholic", "English", "American", "8001011234", "USA");
        String name = child.getName();
        System.out.println("Child name is: " + name);

        System.out.println("---------------");
        American american = new American("John", "male", "Catholic", "Teacher", "6903123456", "USA");
        System.out.println("---------------");
        Person italian = new Italian("Maria", "female", "Catholic", "Doctor", "5507078901", "Italy");
        System.out.println("---------------");

        Person bulgarian = new Bulgarian("Ivan", "male", "Orthodox", "Engineer", "5501010101", "Bulgaria");
        Bulgarian bashBulgarian = new Bulgarian("Bai", "male", "Ortodox", "Grynchar", "9104110000", "Bulgaria");
        System.out.println("---------------");

        child.sayHello();
        child.celebrateEaster();
        System.out.println("Is adult: " + child.isAdult());
        System.out.println("Can take loan: " + child.canTakeLoan());
        ((Child) child).play("doll");
        System.out.println("---------------");

        bulgarian.sayHello();
        bulgarian.celebrateEaster();
        System.out.println("Is adult: " + bulgarian.isAdult());
        System.out.println("Can take loan: " + bulgarian.canTakeLoan());
        ((Bulgarian) bulgarian).celebrateBabaMarta();
        // Type Bulgarian:
        bashBulgarian.celebrateBabaMarta();
        System.out.println("---------------");

        american.sayHello();
        american.celebrateEaster();
        System.out.println("Is adult: " + american.isAdult());
        System.out.println("Can take loan: " + american.canTakeLoan());
        american.celebrateThanksgiving();
        System.out.println("---------------");

        italian.sayHello();
        italian.celebrateEaster();
        System.out.println("Is adult: " + italian.isAdult());
        System.out.println("Can take loan: " + italian.canTakeLoan());
        ((Italian) italian).makePizza(List.of("tomato", "cheese", "basil"));
    }
}