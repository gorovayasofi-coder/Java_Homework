
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TriangleTest {

    @Test
    public void testCalculateArea() {
        assertEquals(Triangle.calculateArea(8, 6), 24.0);
    }

    @Test
    public void testCalculateAreaWithDifferentValues() {
        assertEquals(Triangle.calculateArea(5, 6), 15.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateAreaWithZero() {
        Triangle.calculateArea(0, 6);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateAreaWithNegativeValue() {
        Triangle.calculateArea(5, -6);
    }
}
