package lecture11.examples.polymorphism;

// Parent class
class Shape {
    public void draw() {
        System.out.println("Drawing a shape.");
    }
}

// Child class
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // Overridden method for Circle
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }
}

// Another child class
class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class Main {
    public static void main(String[] args) {
        // 1. Using Parent Type (Shape myShape = new Circle();)
        // You can store any subclass of Shape in a Shape reference.
        // This allows for polymorphism, treating different objects (e.g., Circle, Rectangle) uniformly.
        Shape myShape1 = new Circle(5);
        myShape1.draw();  // Calls Circle's draw() because of polymorphism.

        // 2. Specialized behavior (Circle myShape = new Circle();)
        // You can access specific methods and properties of the Circle class, such as getRadius().
        Circle myCircle = new Circle(5);  // Specific to Circle
        System.out.println("Circle's radius: " + myCircle.getRadius());

        // 3. Using Parent Type for collections (List of Shapes)
        // A collection (or array) of Shapes can hold various types of shapes.
        // Each object calls its own draw() method, even if it's stored as a Shape reference.
        Shape[] shapes = new Shape[]{new Circle(3), new Rectangle()};
        for (Shape shape : shapes) {
            shape.draw();  // Will call the correct draw method for each shape (Circle/Rectangle).
        }
    }
}
