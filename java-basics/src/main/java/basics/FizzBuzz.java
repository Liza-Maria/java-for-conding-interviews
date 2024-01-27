package basics;

public class FizzBuzz {
    public static String getString(int n) {
       
        StringBuilder result = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.append("FizzBuzz");
            } else if (i % 3 == 0) {
                result.append("Fizz");
            } else if (i % 5 == 0) {
                result.append("Buzz");
            } else {
                result.append(i);
            }
            
            result.append(" ");
        }

        result.deleteCharAt(result.length() - 1);
        
        return result.toString();
     }
}
