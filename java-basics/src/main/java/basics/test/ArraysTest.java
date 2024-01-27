package basics.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import basics.ArrayMaxFinder;
import basics.Arrays;

public class ArraysTest {
    @Test
    public void testReverse() {
        int[] numbers = {4, 12, 3, 1, 67, 2, 0};
        int[] res = {0, 2, 67, 1, 3, 12, 4};
        Arrays.reverse(numbers);
        assertEquals(res, numbers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReverseWithEmptyArray() {
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> Arrays.reverse(numbers));
    }
}
