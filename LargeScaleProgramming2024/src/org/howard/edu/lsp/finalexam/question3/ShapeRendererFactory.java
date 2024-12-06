package org.howard.edu.lsp.finalexam.question3;



public class ShapeRendererFactory {
    private static ShapeRendererFactory instance;

    // Private constructor for Singleton pattern
    private ShapeRendererFactory() {}

    // Singleton instance getter
    public static ShapeRendererFactory getInstance() {
        if (instance == null) {
            instance = new ShapeRendererFactory();
        }
        return instance;
    }

    // Factory method to create a shape based on the input
    public Shape createShape(String shapeType) {
        if (shapeType == null || shapeType.trim().isEmpty()) {
            throw new IllegalArgumentException("Shape type cannot be null or empty.");
        }
        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle(); // No need to cast
            case "rectangle":
                return new Rectangle(); // No need to cast
            case "triangle":
                return new Triangle(); // No need to cast
            default:
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }
    }

    // Method to render the shape
    public void renderShape(String shapeType) {
        Shape shape = createShape(shapeType); // Call the createShape method to get the shape
        shape.draw();
    }
}
