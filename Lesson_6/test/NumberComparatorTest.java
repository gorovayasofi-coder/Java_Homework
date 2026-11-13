
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberComparatorTest {

    @Test
    public void testFirstNumberIsGreater() {
        assertEquals(1, NumberComparator.compare(10, 5));
    }

    @Test
    public void testFirstNumberIsLess() {
        assertEquals(-1, NumberComparator.compare(5, 10));
    }

    @Test
    public void testNumbersAreEqual() {
        assertEquals(0, NumberComparator.compare(5, 5));
    }
}
