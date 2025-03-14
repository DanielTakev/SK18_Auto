package lecture06;
import java.util.*; // Another way to add dependency

public class Exercises {
    public static void main(String[] args) {
        printDynamicMatrixElements();

//        // https://docs.oracle.com/javase/tutorial/essential/io/formatting.html
//        int myNumber = 2;
//        double sqRoot = Math.sqrt(myNumber);
//
//        System.out.format("The square root of %d is %f.%n", myNumber, sqRoot);

//        String[] myArrayIntegers = new String[6];
//        for (String element: myArrayIntegers) {
//            System.out.println(element);
//        }
    }

    public static void printArraySum() {
                        //  0   1   2  3    4   5    6 => null/undefined
        double[] numbers = {0, 0.5, 1, 1.5, 2, 2.5};
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
//        for (double num : numbers) {
//            sum += num;
//        }

        System.out.println("The sum of the array is: " + sum);
    }

    public static void printMatrixElements() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("%d ", matrix[row][col]);
            }
        }

        System.out.println("\n______________");

        for (int[] row : matrix) {
            for (int i : row) {
                System.out.printf("%d ", i);
            }
        }
    }

    public static void printDynamicMatrixElements() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int rows = input.nextInt();

        System.out.println("Please enter the number of columns: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.printf("matrix[%d,%d] = ", row, col);
                matrix[row][col] = input.nextInt();
            }
        }
        System.out.println("The matrix is created: " + Arrays.deepToString(matrix));
    }

    public static void printBiggestNum() {
        int[] numbers = {10, 30, 20, 50, 40};

        int biggestNum = numbers[0];

        // Traverse array elements from second and compare every element with current biggest number
        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > biggestNum)
                biggestNum = numbers[i];

        System.out.println("The biggest number is: " + biggestNum);
    }

    public static void manageToDoList() {
        // Create an ArrayList to hold to-do tasks
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Add initial tasks to the list
        toDoList.add("Buy groceries");
        toDoList.add("Clean the house");
        toDoList.add("Finish homework");

        // Display all tasks with their index
        System.out.println("To-Do List: ");
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i + ": " + toDoList.get(i));
        }

        // Prompt user to mark a task as completed
        System.out.print("Enter the index of the task you have completed: ");
        int index = scanner.nextInt();

        // Check if the index is valid and remove the task
        if (index >= 0 && index < toDoList.size()) {
            toDoList.remove(index);
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Invalid index. No task was removed.");
        }

        // Print the updated to-do list
        System.out.println("Updated To-Do List:");
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i + ": " + toDoList.get(i));
        }

        scanner.close();
    }

    public static void checkLotteryNumber() {
        // Create an ArrayList to hold lottery numbers
        ArrayList<Integer> lotteryNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Add initial winning lottery numbers to the list
        lotteryNumbers.add(5);
        lotteryNumbers.add(17);
        lotteryNumbers.add(23);
        lotteryNumbers.add(42);
        lotteryNumbers.add(58);

        // Ask user to enter a lottery number to check
        System.out.print("Enter a lottery number to see if it's a winning number: ");
        int userNumber = scanner.nextInt();

        // Check if the number is a winning number
        if (lotteryNumbers.contains(userNumber)) {
            System.out.println("Congratulations! " + userNumber + " is a winning number!");
        } else {
            System.out.println("Sorry, " + userNumber + " is not a winning number.");
        }

        // Print all winning lottery numbers
        System.out.println("Winning Lottery Numbers:");
        for (int number : lotteryNumbers) {
            System.out.println(number);
        }

        scanner.close();
    }

    public static void removeContact() {
        // Create a LinkedList to hold contact names
        LinkedList<String> contactList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Add initial contacts to the list
        contactList.add("Alice");
        contactList.add("Bob");
        contactList.add("Charlie");
        contactList.add("David");

        // Print all contacts in the list
        System.out.println("Contact List:");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i + 1) + ": " + contactList.get(i));
        }

        // Ask user to enter the position of the contact they want to remove
        System.out.print("Enter the position of the contact to remove (1-" + contactList.size() + "): ");
        int position = scanner.nextInt() - 1; // Adjust for zero-based index

        // Check if the position is valid and remove the contact
        if (position >= 0 && position < contactList.size()) {
            String removedContact = contactList.remove(position);
            System.out.println("Removed contact: " + removedContact);
        } else {
            System.out.println("Invalid position. No contact was removed.");
        }

        // Print the updated contact list
        System.out.println("Updated Contact List:");
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println((i + 1) + ": " + contactList.get(i));
        }

        scanner.close();
    }

    public static void serveCoffeeShopLine() {
        // Create a Queue to represent customers waiting in line
        Queue<String> customerQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        // Add customers to the queue
        customerQueue.add("Customer 1: Alice");
        customerQueue.add("Customer 2: Bob");
        customerQueue.add("Customer 3: Charlie");
        customerQueue.add("Customer 4: Dana");
        customerQueue.add("Customer 5: Eve");

        // Print the current queue of customers
        System.out.println("Current Queue of Customers:");
        for (String customer : customerQueue) {
            System.out.println(customer);
        }

        // Serve each customer in the order they arrived
        System.out.println("Serving customers...");
        while (true) {
            //Remove and get the customer at the front of the queue
            String customer = customerQueue.poll();
            System.out.println("Serving: " + customer);

            // Stop serving if no customers left
            if (customerQueue.isEmpty()) {
                System.out.println("All customers have been served.");
                break;
            }

            // Print the updated status of the queue
            System.out.println("Current Queue of Customers:");
            for (String customerInLine : customerQueue) {
                System.out.println(customerInLine);
            }
        }
        scanner.close();
    }

    public static void getBook() {
        // Create a Stack to hold 5 book titles
        Stack<String> bookStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        // Add initial books to the stack
        bookStack.push("Book 1: Introduction to Programming");
        bookStack.push("Book 2: Data Structures");
        bookStack.push("Book 3: Algorithms");
        bookStack.push("Book 4: Advanced Java");
        bookStack.push("Book 5: Design Patterns");

        // Print the current stack of books
        System.out.println("Current Stack of Books:");
        for (String book : bookStack) {
            System.out.println(book);
        }

        // Ask user to enter the title of the book to search for
        System.out.print("Enter the title of the book you want to find: ");
        String bookToFind = scanner.nextLine();

        // Create a temporary stack to help with the search and removal
        Stack<String> tempStack = new Stack<>();
        String foundBook = null;

        // Search for the book in the stack
        while (!bookStack.isEmpty()) {
            String book = bookStack.pop();
            if (book.equalsIgnoreCase(bookToFind)) {
                foundBook = book; // Store the found book
                break; // Stop searching after finding the book
            } else {
                tempStack.push(book); // Put other books in the temporary stack
            }
        }

        // Restore books to the original stack
        while (!tempStack.isEmpty()) {
            bookStack.push(tempStack.pop());
        }

        // Print the found book or a message if not found
        if (foundBook != null) {
            System.out.println("Found and retrieved book: " + foundBook);
        } else {
            System.out.println("Book not found in the stack.");
        }

        // Print the updated stack of books
        System.out.println("Updated Stack of Books:");
        for (String book : bookStack) {
            System.out.println(book);
        }

        scanner.close();
    }
}