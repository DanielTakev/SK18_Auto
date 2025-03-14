package lecture09.exercises;

public class MyMovie {

    String title;
    String genre;
    float rating;

    public MyMovie(String title, String genre, float rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public static void main(String[] args) {
        MyMovie matrix = new MyMovie("Matrix", "action", 10.0f);
        System.out.println(matrix.title);
        System.out.println(matrix.genre);
        System.out.println(matrix.rating);
        System.out.println(matrix);
    }
}
