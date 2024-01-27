package basics.test;

import static org.junit.Assert.assertArrayEquals;

import basics.Maps;

public class MapsTest {
    @Test
    public void testTwoSum() {
        int[] numbers = new int[]{2, 3, 5, 8, 11, 3};
        assertArrayEquals(new int[]{0, 4}, Maps.TwoSum(numbers, 13));
    }
}
