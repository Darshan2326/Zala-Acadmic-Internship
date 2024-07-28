import java.util.Arrays;

public class ArrayOperations5 {
    
    public static int[] removeElement(int[] arr, int value) {
        return Arrays.stream(arr).filter(num -> num != value).toArray();
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        array = removeElement(array, 3);
        System.out.println("Array after removing 3: " + Arrays.toString(array));
    }
}
