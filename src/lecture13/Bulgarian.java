package lecture13;

public class Bulgarian extends Person {
    public Bulgarian(String name, String sex, String religion, String job, String egn, String country) {
        super(name, sex, religion, "Bulgarian", job, "Bulgarian", egn, country);
    }

    @Override
    public void sayHello() {
        System.out.println("Здравей!");
    }

    public void celebrateBabaMarta() {
        System.out.println("I am celebrating Baba Marta on March 1st.");
    }
}