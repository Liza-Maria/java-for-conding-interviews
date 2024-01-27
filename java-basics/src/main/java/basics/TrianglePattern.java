package basics;

public class TrianglePattern {
    public static String PrintTriangle(int rowsNo) {
        int count = 1;

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= rowsNo; i++) {
            for (int j = 1; j <= i; j++) {
                result.append(count++).append(" ");
            }

            result.append("\n");
        }

        result.deleteCharAt(result.length() - 1);

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(PrintTriangle(7));
    }
}
