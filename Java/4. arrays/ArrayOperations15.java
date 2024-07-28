public class ArrayOperations15 {
    
    public static int[] countEvenOdd(int[] arr) {
        int countEven = 0, countOdd = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        return new int[]{countEven, countOdd};
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] result = countEvenOdd(array);
        System.out.println("Even: " + result[0] + ", Odd: " + result[1]);
    }
}
