
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FactorialTest {

    @Test
    public void testFactorial() {
        assertEquals(Factorial.calculate(5), 120);
    }

    @Test
    public void testFactorialZero() {
        assertEquals(Factorial.calculate(0), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegativeNumber() {
        Factorial.calculate(-5);
    }
}
