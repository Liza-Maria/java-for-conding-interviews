package basics.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import basics.ArrayMaxFinder;

public class ArrayMaxFinderTest {
    @Test
    public void testFindMax() {
        int[] numbers = {4, 12, 3, 1, 67, 2, 0};
        assertEquals(67, ArrayMaxFinder.findMax(numbers));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithEmptyArray() {
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> ArrayMaxFinder.findMax(numbers));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithNullArray() {
        int[] numbers = null;
        assertThrows(IllegalArgumentException.class, () -> ArrayMaxFinder.findMax(numbers));
    }
}
