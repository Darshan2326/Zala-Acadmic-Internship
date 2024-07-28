public class ArrayOperations19 {
    
    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr) {
            sum -= num;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int[] array = new int[99];
        for (int i = 1, j = 0; i <= 100; i++) {
            if (i != 50) {
                array[j++] = i;
            }
        }
        System.out.println("Missing number: " + findMissingNumber(array));
    }
}
