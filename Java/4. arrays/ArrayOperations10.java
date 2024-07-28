import java.util.HashSet;
import java.util.Set;

public class ArrayOperations10 {
    
    public static Set<Integer> findDuplicates(int[] arr) {
        Set<Integer> duplicates = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        return duplicates;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 3, 2};
        System.out.println("Duplicates: " + findDuplicates(array));
    }
}
