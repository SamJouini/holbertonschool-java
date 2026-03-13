public class Number {
    public static void todivide(int a, int b) {
        int result = 0;  // default value for division by zero
        
        try {
            result = a / b;
        } catch (Exception e) {
        } finally {
            System.out.printf("%d / %d = %d\n", a, b, result);
        }
    }
}