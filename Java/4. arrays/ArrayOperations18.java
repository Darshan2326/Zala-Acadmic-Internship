import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayOperations18 {
    
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 3, 2};
        int[] result = removeDuplicates(array);
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}
