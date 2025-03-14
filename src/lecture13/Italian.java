package lecture13;

import java.util.List;

public class Italian extends Person {
    public Italian(String name, String sex, String religion, String job, String egn, String country) {
        super(name, sex, religion, "Italian", job, "Italian", egn, country);
    }

    @Override
    public void sayHello() {
        System.out.println("Ciao!");
    }

    public void makePizza(List<String> ingredients) {
        System.out.println("I am making a pizza with the following ingredients: " + ingredients);
    }
}