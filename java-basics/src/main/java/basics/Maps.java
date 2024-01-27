package basics;

import java.util.Map;

public class Maps {
    public static int[] TwoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException("Array has less then 2 elements.");
        }

        Map<Integer, Integer> map = new HashMap();

        for (int i = 0; i <= numbers.length; i++) {
            int complement = target - numbers[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(numbers[i], i);
        }

        return new int[] {};
    }
}
