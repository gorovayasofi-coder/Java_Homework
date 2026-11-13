
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleTest {

    @Test
    public void testCalculateArea() {
        assertEquals(24.0, Triangle.calculateArea(8, 6));
    }

    @Test
    public void testCalculateAreaWithDifferentValues() {
        assertEquals(15.0, Triangle.calculateArea(5, 6));
    }

    @Test
    public void testCalculateAreaWithZero() {
        assertThrows(IllegalArgumentException.class,
                () -> Triangle.calculateArea(0, 6));
    }

    @Test
    public void testCalculateAreaWithNegativeValue() {
        assertThrows(IllegalArgumentException.class,
                () -> Triangle.calculateArea(5, -6));
    }
}
