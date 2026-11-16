
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(Calculator.add(5, 5), 10);
    }

    @Test
    public void testSubtract() {
        assertEquals(Calculator.subtract(10, 5), 5);
    }

    @Test
    public void testMultiply() {
        assertEquals(Calculator.multiply(5, 5), 25);
    }

    @Test
    public void testDivide() {
        assertEquals(Calculator.divide(10, 5), 2.0);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator.divide(10, 0);
    }
}
