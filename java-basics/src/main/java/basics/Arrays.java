package basics;

public class Arrays {
    public static void reverse(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one element.");

        }

        int startIdx = 0;
        int endIdx = numbers.length - 1;

        while (startIdx < endIdx) {
            int tmp = numbers[startIdx];
            numbers[startIdx] = numbers[endIdx];
            numbers[endIdx] = tmp;

            startIdx++;
            endIdx--;
        }
    }
}
