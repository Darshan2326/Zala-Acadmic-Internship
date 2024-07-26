public class ArrayOperations2 {
    
    public static double averageArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Average of array: " + averageArray(array));
    }
}
