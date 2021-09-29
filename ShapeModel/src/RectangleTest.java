import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    //creates a test object
    Rectangle r= new Rectangle(4, 6);

    //tests the efficiency of these methods
    @org.junit.jupiter.api.Test
    void getCenter() {
        Point c= new Point(2,3);
        assertEquals(r.getCenter(), c);
    }

    @org.junit.jupiter.api.Test
    void area() {
        assertEquals(r.Area(), 24);
    }

    @org.junit.jupiter.api.Test
    void circumfernce() {
        assertEquals(r.Circumfernce(), 20);
    }

    @org.junit.jupiter.api.Test
    void wherePoint() {
        assertTrue(r.WherePoint(2, 3));
    }
}