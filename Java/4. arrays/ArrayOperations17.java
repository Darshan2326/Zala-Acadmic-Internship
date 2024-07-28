public class ArrayOperations17 {
    
    public static boolean containsElements(int[] arr, int elem1, int elem2) {
        boolean foundElem1 = false, foundElem2 = false;
        for (int num : arr) {
            if (num == elem1) {
                foundElem1 = true;
            }
            if (num == elem2) {
                foundElem2 = true;
            }
        }
        return foundElem1 && foundElem2;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 12, 3, 23, 5};
        System.out.println("Array contains 12 and 23: " + containsElements(array, 12, 23));
    }
}
