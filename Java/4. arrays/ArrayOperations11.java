import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayOperations11 {
    
    public static Set<Integer> findCommonValues(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonValues = new HashSet<>();
        for (int num : arr1) {
            set1.add(num);
        }
        for (int num : arr2) {
            if (set1.contains(num)) {
                commonValues.add(num);
            }
        }
        return commonValues;
    }
    
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};
        System.out.println("Common values: " + findCommonValues(array1, array2));
    }
}
