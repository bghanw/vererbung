import geometry.Circle;
import geometry.Point;
import geometry.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeometryTest {

    @Test
    void rectancle_calculateArea() {
        Rectangle rect = new Rectangle(new Point(1,1),4,5);
        assertEquals(20, rect.calculateArea());
    }

    @Test
    void rectangle_calculateCircumference() {
        Rectangle rect = new Rectangle(new Point(1,1),4,5);
        assertEquals(18, rect.calculateCircumference());
    }

    @Test
    void circle_calculateArea() {
        Circle circle = new Circle(new Point(1,1), 5);
        assertEquals(25 * Math.PI, circle.calculateArea());
    }

    @Test
    void circle_calculateCircumference() {
        Circle circle = new Circle(new Point(1,1),5);
        assertEquals(10 * Math.PI, circle.calculateCircumference());
    }

}
