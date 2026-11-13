
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void testFactorial() {
        assertEquals(120, Factorial.calculate(5));
    }

    @Test
    public void testFactorialZero() {
        assertEquals(1, Factorial.calculate(0));
    }

    @Test
    public void testFactorialNegativeNumber() {
        assertThrows(IllegalArgumentException.class,
                () -> Factorial.calculate(-5));
    }
}
