public class GenerateStringIndexOutOfBoundsException {
    public static void main(String[] args) {
        String str = "hello";
        char ch = str.charAt(10); // This will generate StringIndexOutOfBoundsException
    }
}
