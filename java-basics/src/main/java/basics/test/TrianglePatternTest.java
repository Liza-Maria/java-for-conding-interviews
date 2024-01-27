package basics.test;

import basics.TrianglePattern;

public class TrianglePatternTest {
    @Test
    public void testPrintTriangle() {
        assertEquals("1 \n2 3 \n4 5 6 \n7 8 9 10 ", TrianglePatter.PrintTriangle(4));
    }

    @Test
    public void extraSpaceOutput() {
        asserNotEquals("1 \n2 3 \n4 5 6 \n7 8 9 10  ", TrianglePatter.PrintTriangle(4));
    }
}
