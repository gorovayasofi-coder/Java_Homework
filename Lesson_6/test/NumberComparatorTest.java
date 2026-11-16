
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NumberComparatorTest {

    @Test
    public void testFirstNumberIsGreater() {
        assertEquals(NumberComparator.compare(10, 5), 1);
    }

    @Test
    public void testFirstNumberIsLess() {
        assertEquals(NumberComparator.compare(5, 10), -1);
    }

    @Test
    public void testNumbersAreEqual() {
        assertEquals(NumberComparator.compare(5, 5), 0);
    }
}
