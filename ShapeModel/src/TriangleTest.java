import org.junit.jupiter.api.Test;
import java.awt.*;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    //creates a test object
    Triangle t=new Triangle(1,1,5,1,3,5);
    float side1= Math.abs((float) Math.sqrt((t.y1-t.x1)*(t.y1-t.x1)+(t.y2-t.x2)*(t.y2-t.x2)));
    float side2= Math.abs((float) Math.sqrt((t.z1-t.y1)*(t.z1-t.y1)+(t.z2-t.y2)*(t.z2-t.y2)));
    float side3= Math.abs((float) Math.sqrt((t.z1-t.x1)*(t.z1-t.x1)+(t.z2-t.x2)*(t.z2-t.x2)));

    //tests the efficiency of these methods
    @Test
    void getCenter() {
        Point c= new Point(3, (int) 2.3333333);
        assertEquals(t.getCenter(), c);
    }

    @Test
    void area() {
        float s=(side1+side2+side3)/2;
        float area= (float) Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        assertEquals(t.Area(),area);
    }

    @Test
    void circumfernce() {
        float circumference= side1+side2+side3;
        assertEquals(t.Circumfernce(),circumference);
    }

    @Test
    void wherePoint() {
        assertTrue(t.WherePoint(3, 5));
    }
}