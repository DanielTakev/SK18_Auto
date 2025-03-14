package lecture09;

public class Penguin {

    int age;
    String name;
    boolean isEngaged;

    public Penguin(String penguinName, int penguinAge, boolean isPenguinEngaged) {
        age = penguinAge;
        name = penguinName;
        isEngaged = isPenguinEngaged;
    }

    public Penguin(int penguinAge, boolean isPenguinEngaged) {
        age = penguinAge;
        name = "DaniConst";
        isEngaged = isPenguinEngaged;
    }

    public Penguin(boolean isPenguinEngaged, int penguinAge) {
        age = penguinAge;
        name = "DaniConst";
        isEngaged = isPenguinEngaged;
    }
}
