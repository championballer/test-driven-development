package shapes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {


    @Test
    void testIfRectangleWithMaximumAreaCanBeRetrieved() {
        List<Rectangle> testRectangles = new ArrayList<Rectangle>();
        testRectangles.add(new Rectangle(1,2));
        testRectangles.add(new Rectangle(3,2));
        testRectangles.add(new Rectangle(7,6));
        testRectangles.add(new Rectangle(1,8));

        assertEquals(new Rectangle(7,6), Rectangle.max(testRectangles));

    }
}