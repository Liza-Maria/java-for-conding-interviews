package basics.test;

import basics.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculatorTest {

    @Test
    public void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
    }

    @ParameterizedTest
    @MethodSource("basics.DataProvider#dataProviderForAdd")
    public void testAddWithDataProvider(int a, int b, int excepted) {
        asserEquals(excepted, Calculator.add(a, b));
    }

    @Test
    public void testSubtract() {
        assertEquals(2, Calculator.subtract(5, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(15, Calculator.multiply(3, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculator.divide(10, 5));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculator.divide(10, 0);
    }
}
