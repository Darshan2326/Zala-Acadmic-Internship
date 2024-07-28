public class ArrayOperations8 {
    
    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new int[]{min, max};
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] minMax = findMinMax(array);
        System.out.println("Minimum: " + minMax[0] + ", Maximum: " + minMax[1]);
    }
}
