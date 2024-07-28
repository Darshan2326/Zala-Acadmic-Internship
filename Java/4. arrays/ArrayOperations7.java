import java.util.Arrays;

public class ArrayOperations7 {
    
    public static int[] insertElement(int[] arr, int index, int value) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == index) {
                newArray[i] = value;
            } else {
                newArray[i] = arr[j++];
            }
        }
        return newArray;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        array = insertElement(array, 2, 99);
        System.out.println("Array after insertion: " + Arrays.toString(array));
    }
}
