package basics.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import basics.Calculator;
import basics.FizzBuzz;

public class FizzBuzzTest {
    @Test
    public void testAdd() {
        assertEquals("1 2 Fizz", FizzBuzz.getString(3));
        assertEquals("1 2 Fizz 4", FizzBuzz.getString(4));
        assertEquals("1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz", FizzBuzz.getString(10));
    }
}
