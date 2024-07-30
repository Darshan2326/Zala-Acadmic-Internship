public class HandleArithmeticException {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will generate ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}
