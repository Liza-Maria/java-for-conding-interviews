package basics.test;

import static org.junit.Assert.assertEquals;

import basics.FizzBuzz;
import basics.ReverseNumber;

public class ReverseNumberTest {
    @Test
    public void test() {
        assertEquals(54321, ReverseNumber.reverseNumber2(12345));
        assertEquals(-54321, ReverseNumber.reverseNumber2(-12345));
    }
}
