// Abstract class Shape
abstract class Shape {
    // Abstract method to be implemented by subclasses
    abstract void numberOfSides();
}

// Class Trapezoid extending Shape
class Trapezoid extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Trapezoid has 4 sides.");
    }
}

// Class Triangle extending Shape
class Triangle extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Triangle has 3 sides.");
    }
}

// Class Hexagon extending Shape
class Hexagon extends Shape {
    @Override
    void numberOfSides() {
        System.out.println("Hexagon has 6 sides.");
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        // Create instances of each class
        Shape trapezoid = new Trapezoid();
        Shape triangle = new Triangle();
        Shape hexagon = new Hexagon();
        
        // Call the numberOfSides method for each shape
        trapezoid.numberOfSides();
        triangle.numberOfSides();
        hexagon.numberOfSides();
    }
}
