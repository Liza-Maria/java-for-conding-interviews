package basics.test;

public class StringTest {
    @Test
    public void testIsPalindrom() {
        assertTrue(Strings.isPalindrom("level"));
        assertTrue(Strings.isPalindrom("radar"));
    }

    @Test
    public void testIsNotPalindrom() {
        assertFalse(Strings.isPalindrom("test"));
        assertFalse(Strings.isPalindrom("hello"));
    }
}
