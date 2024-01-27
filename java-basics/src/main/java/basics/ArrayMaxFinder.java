package basics;

public class ArrayMaxFinder {
    public static int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must contain at least one element.");

        }

        int maxNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxNumber)
                maxNumber = numbers[i];
        }

        return maxNumber;
    }
}
