package lecture13;

public class American extends Person {
    public American(String name, String sex, String religion, String job, String egn, String country) {
        super(name, sex, religion, "English", job, "American", egn, country);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello!");
    }

    public void celebrateThanksgiving() {
        System.out.println("I am celebrating Thanksgiving on the fourth Thursday in November.");
    }
}