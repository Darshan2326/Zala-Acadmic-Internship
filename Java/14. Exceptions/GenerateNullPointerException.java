public class GenerateNullPointerException {
    public static void main(String[] args) {
        String str = null;
        str.length(); // This will generate NullPointerException
    }
}
