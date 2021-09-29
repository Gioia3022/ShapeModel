import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    //creates a test object
    Circle c= new Circle(3);

    //tests the efficiency of these methods
    @Test
    void getCenter() {
        Point p= new Point(3,3);
        assertEquals(c.getCenter(), p);
    }

    @Test
    void area() {
        float a= (float) (c.radius*c.radius*Math.PI);
        assertEquals(a, c.Area());
    }

    @Test
    void circumfernce() {
        float circumference= (float) (2*Math.PI*c.radius);
        assertEquals(circumference, c.Circumfernce());
    }

    @Test
    void wherePoint() {
        assertTrue(c.WherePoint(2, 3));
    }
}