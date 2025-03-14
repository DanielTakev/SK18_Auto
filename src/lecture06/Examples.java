package lecture06;
import java.util.*;

public class Examples {
    public static void main(String[] args) {
        demoStack();
    }

    public static void demoArrayDeclarationElementInit() {
        // Creates an array with initialized elements
                         // index 0  index 1  index 2   index 3
        String[] carBrands = {"Audi", "Bmw", "Volvo", "Mercedes"};
        int[] evenNumbers = {2, 4, 6, 8, 10};
        double[] degrees = {0, 0.5, 1, 1.5, 2, 2.5};

        System.out.println(carBrands[0]);
        System.out.println(evenNumbers[2]);
        System.out.println(degrees[5]);

        System.out.println(carBrands.length);
        System.out.println(evenNumbers.length);
        System.out.println(degrees.length);
    }

    public static void demoArrayDeclaration() {
        // Creates an array with fixed size. Then adds elements one by one.
        String[] cars = new String[3];
        cars[0] = "Volvo";
        cars[1] = "Bmw";
        cars[2] = "Mercedes";
        System.out.println(cars[1]);
    }

    public static void demoArrayElementValue() {
        String[] carBrands = {"Audi", "Bmw", "Volvo", "Mercedes"};
        System.out.println("carBrands[1]: " + carBrands[1]);
        carBrands[1] = "Opel";
        System.out.println("carBrands[1]: " + carBrands[1]);
    }

    public static void demoArrayLoop() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println(cars[i]);
        }
    }

    public static void demoArrayForEachLoop() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars) {
            System.out.println(car);
        }
    }

    public static void demoMultidimensionalArray() {
        // Create a 2D array with 4 rows and n columns
        int[][] matrix = {
                {1, 2, 3, 44, 55},  // Technology 1
                {4, 5, 6, 11},  // Technology 2
                {7, 8, 9, 22, 22, 22, 22, 22}, // Technology 3
                {2, 3}
        };

        // Print the elements of the 2D array
        for (int[] integers : matrix) {

            for (int integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void demoArrayListDeclaration() {
        // Create an empty ArrayList
        ArrayList<String> cars = new ArrayList<>();

        //Adding elements to the ArrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        //Getting element by index
        System.out.println(cars.get(1));
    }

    public static void demoArrayListOperations() {
        ArrayList<String> cars = new ArrayList<>();

        //Adding elements to the ArrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println("Initial cars: " + cars);

        // Changing element by index
        cars.set(1, "Mercedes");
        System.out.println("Cars after changing element: " + cars);

        //Removing element by index
        cars.remove(2);
        System.out.println("Cars after removing element: " + cars);

        //Sorting elements in ascending order, according to the natural ordering of its elements
        Collections.sort(cars);
        System.out.println("Cars after sorting element: " + cars);
    }

    public static void demoArrayListLoop() {
        ArrayList<String> cars = new ArrayList<>();

        //Adding elements to the ArrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        //Loop trough ArrayList
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println("_______");
        //Loop for-each through ArrayList
        for (String car : cars) {
            System.out.println(car);
        }
    }

    public static void demoLinkedListInit() {
        //Creating an empty LinkedList
        LinkedList<String> cars = new LinkedList<>();

        //Adding elements
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);

        //Getting element by index
        System.out.println(cars.get(0));
    }

    public static void demoLinkedListOperations() {
        LinkedList<String> cars = new LinkedList<>();

        //Adding element at the end
        cars.add("Volvo");

        //Adding element at beginning
        cars.addFirst("BMW");
        System.out.println("After addFirst: " + cars);

        // Adding element at the end - a more descriptive and explicitly indicates that you are adding an element to the end
        cars.addLast("Ford");
        System.out.println("After addLast: " + cars);

        //Adding element at a specified position
        cars.add(2, "Mazda");
        System.out.println("After add at a specified position: " + cars);

        //Getting element at specific index
        System.out.println("Element as specific position: " + cars.get(1));

        //Getting first element
        System.out.println("First element: " + cars.getFirst());

        //Getting last element
        System.out.println("Last element " + cars.getLast());

        //Removing first element
        cars.remove();
        System.out.println("After removing first element: " + cars);

        //Removing first element
        cars.removeFirst();
        System.out.println("After removing first element: " + cars);

        //Removing last element
        cars.removeLast();
        System.out.println("After removing last element: " + cars);

        //Removing all elements
        cars.removeAll(cars);
        System.out.println("After removing all elements: " + cars);
    }

    public static void demoQueue() {

        /*
        Elements of the priority queue are processed according to the priority. The priority is according to the natural ordering.
        This means that elements are not retrieved in the order they were added, but rather in priority order.
        For integers, this typically means the smallest number will be at the head of the queue.
        Ideal for scenarios where you need elements to be processed based on priority, not the order of insertion
         */
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        /*
        Maintains the order of elements in the sequence they were added.
        Suitable for a simple FIFO queue where order matters
         */
        Queue<Integer> queue = new LinkedList<>();

        //Adding items to the queue using add()
        queue.add(10);
        queue.add(20);
        queue.add(15);

        //Getting the size of the queue
        int numElements = queue.size();

        System.out.println("Queue elements: " + queue);

        for (int i = 0; i < numElements; i++) {
            // Prints the first element and remove it from the queue
            System.out.println("Removed element: " + queue.poll());
        }

        System.out.println("Queue elements: " + queue);
    }

    public static void demoStack() {
        //Creating an empty Stack
        Stack<String> stackOfPlates = new Stack<>();

        // Pushing new items onto the top of the Stack
        stackOfPlates.push("Plate1");
        stackOfPlates.push("Plate2");
        stackOfPlates.push("Plate3");
        stackOfPlates.push("Plate4");
        System.out.println("Stack elements: " + stackOfPlates);

        // Returns top element and remove it from the Stack
        System.out.println("Element removed: " + stackOfPlates.pop());
        System.out.println("Stack elements: " + stackOfPlates);

        // Pushing an element onto top of the stack
        stackOfPlates.push("Plate5");
        System.out.println("Stack elements: " + stackOfPlates);

        System.out.println("Element removed: " + stackOfPlates.pop());
        System.out.println("Stack elements: " + stackOfPlates);

        System.out.println("Element removed: " + stackOfPlates.pop());
        System.out.println("Stack elements: " + stackOfPlates);

        System.out.println("Element removed: " + stackOfPlates.pop());
        System.out.println("Stack elements: " + stackOfPlates);

        System.out.println("Element removed: " + stackOfPlates.pop());
        System.out.println("Stack elements: " + stackOfPlates);

//        System.out.println("Element removed: " + stackOfPlates.pop());
//        System.out.println("Stack elements: " + stackOfPlates);
    }
}
