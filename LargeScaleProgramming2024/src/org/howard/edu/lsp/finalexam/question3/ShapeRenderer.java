package org.howard.edu.lsp.finalexam.question3;

public class ShapeRenderer {
	public void renderShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            Circle circle = new Circle();
            circle.draw();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            Rectangle rectangle = new Rectangle();
            rectangle.draw();
        } else if (shapeType.equalsIgnoreCase("triangle")) {
            Triangle triangle = new Triangle();
            triangle.draw();
        } else {
            System.out.println("Unknown shape type: " + shapeType);
        }
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();

        // Render different shapes
        renderer.renderShape("circle");    // Output: Drawing a Circle
        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
        renderer.renderShape("triangle");  // Output: Drawing Triangle
        renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon  
    }
}

// Supporting Shape Classes
class Circle {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle {
    public void draw() {
        System.out.println("Drawing a Triangle");
    }


}
