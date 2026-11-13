
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(10, Calculator.add(5, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(5, Calculator.subtract(10, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(25, Calculator.multiply(5, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, Calculator.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class,
                () -> Calculator.divide(10, 0));
    }
}
