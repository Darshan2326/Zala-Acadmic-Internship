public class ThrowExceptionExample {
    public static void main(String[] args) {
        ThrowExceptionExample example = new ThrowExceptionExample();
        example.methodThatThrowsException(); // This will cause an exception to be thrown
    }

    public void methodThatThrowsException() {
        throw new RuntimeException("Exception thrown from method");
    }
}
