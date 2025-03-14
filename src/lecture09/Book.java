package lecture09;

public class Book {
    // Static variable to keep track of the total number of books created
    static int totalBooks = 0;

    // Instance variables
    String title;
    String author;
    double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        totalBooks++; // Increment the static variable whenever a new book is created
    }

    public Book(String author, double price) {
        this.title = "Default";
        this.author = author;
        this.price = price;
        totalBooks++; // Increment the static variable whenever a new book is created
    }

    // Static method to display the total number of books created
    public static void staticMethodDisplayTotalBooks() {
        System.out.println("Total books created: " + totalBooks);
    }

    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("1984", "George Orwell", 15.99);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 10.99);
        Book bookDefault = new Book("Harper Lee", 10.99);

        Book.staticMethodDisplayTotalBooks();

        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 12.99);

        // Displaying details of each book
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();
        bookDefault.displayDetails();

        // Displaying the total number of books created
        Book.staticMethodDisplayTotalBooks();
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}
