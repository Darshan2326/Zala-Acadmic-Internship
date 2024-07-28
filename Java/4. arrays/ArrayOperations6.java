import java.util.Arrays;

public class ArrayOperations6 {
    
    public static int[] copyArray(int[] arr) {
        return Arrays.copyOf(arr, arr.length);
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] copiedArray = copyArray(array);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
    }
}
