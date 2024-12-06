package org.howard.edu.lsp.finalexam.question3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeRendererFactoryTest {
    private ShapeRendererFactory shapeRendererFactory;

    @BeforeEach
    void setUp() {
        shapeRendererFactory = ShapeRendererFactory.getInstance();
    }

    @Test
    void testSingletonInstance() {
        // Verifying that the same instance is returned each time (Singleton pattern)
        ShapeRendererFactory anotherRenderer = ShapeRendererFactory.getInstance();
        assertSame(shapeRendererFactory, anotherRenderer, "ShapeRendererFactory should be a singleton.");
    }

    @Test
    void testRenderCircle() {
        // Verifying that rendering a circle calls the correct method and prints "Drawing a Circle"
        shapeRendererFactory.renderShape("circle"); // Should print "Drawing a Circle"
    }

    @Test
    void testRenderRectangle() {
        // Verifying that rendering a rectangle calls the correct method and prints "Drawing a Rectangle"
        shapeRendererFactory.renderShape("rectangle"); // Should print "Drawing a Rectangle"
    }

    @Test
    void testRenderTriangle() {
        // Verifying that rendering a triangle calls the correct method and prints "Drawing a Triangle"
        shapeRendererFactory.renderShape("triangle"); // Should print "Drawing a Triangle"
    }

    @Test
    void testRenderUnknownShape() {
        // Verifying that an unknown shape type is handled and an appropriate message is printed
        shapeRendererFactory.renderShape("hexagon"); // Should print "Unknown shape type: hexagon"
    }

    @Test
    void testCreateShapeWithNullType() {
        // Verifying that passing a null or empty shape type throws an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> shapeRendererFactory.createShape(null));
        assertThrows(IllegalArgumentException.class, () -> shapeRendererFactory.createShape(""));
    }

    @Test
    void testCreateShapeWithInvalidType() {
        // Verifying that passing an invalid shape type throws an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> shapeRendererFactory.createShape("square"));
    }
}
