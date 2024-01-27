package basics;

public class ReverseNumber {
    public static int reverseNumber1(int n) {
        boolean isNegative = false;

        if (n < 0) {
            isNegative = true;
            n = Math.abs(n);
        }

        String numberStr = Integer.toString(n);
        StringBuilder reversedStr = new StringBuilder(numberStr).reverse();
        int reversedNumber = Integer.parseInt(reversedStr.toString());

        return isNegative ? reversedNumber : -reversedNumber;
    }

    public static int reverseNumber2(int n) {
        int reversed = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n = n / 10;
        }

        return reversed;
    }

    public static void main(String[] args) {
        int reversed1 = reverseNumber2(12345);
        System.out.println("Reversed number is: " + reversed1);
        //Reversed number is: 54321

        int reversed2 = reverseNumber2(-9876);
        System.out.println("Reversed number is: " + reversed2);
        //Reversed number is: -6789
    }
}
