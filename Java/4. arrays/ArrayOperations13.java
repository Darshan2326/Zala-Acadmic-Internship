public class ArrayOperations13 {
    
    public static int findSecondLargest(int[] arr) {
        int firstLargest, secondLargest;
        firstLargest = secondLargest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Second largest: " + findSecondLargest(array));
    }
}
