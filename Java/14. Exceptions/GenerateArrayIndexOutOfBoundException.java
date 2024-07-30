public class GenerateArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int element = arr[10]; // This will generate ArrayIndexOutOfBoundException
    }
}
