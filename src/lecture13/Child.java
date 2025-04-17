package lecture13;

public class Child extends Person {
    public Child(String name, String sex, String religion, String language, String nationality, String egn, String country) {
        super(name, sex, religion, language, null, nationality, egn, country);
    }

    @Override
    public void sayHello() {
        System.out.println("Hi!");
    }

    @Override
    public boolean isAdult() {
        System.out.println("The child is not an adult.");
        return false;
    }

    @Override
    public boolean canTakeLoan() {
        System.out.println("The child cannot take a loan.");
        return false;
    }

    public void play(String toy) {
        System.out.println("I am playing with a " + toy);
    }
}