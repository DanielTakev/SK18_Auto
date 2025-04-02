package lecture09.exercises;

public class Movie {
    // Attributes of the Movie class
    String title;
    String genre;
    double rating;

    // Constructor to initialize the Movie object
    public Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public static void main(String[] args) {
        // Creating movie objects
        Movie movie1 = new Movie("Inception", "Sci-Fi", 8.8);
        Movie movie2 = new Movie("The Godfather", "Crime", 9.2);
        Movie movie3 = new Movie("Toy Story", "Animation", 8.3);

        // Displaying the details of each movie
        movie1.displayDetails();
        movie2.displayDetails();
        movie3.displayDetails();
    }

    // Method to display the movie details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating + "/10");
        System.out.println();
    }
}