public class CompareNumbers {
    
    public static void compareNumbers(int a, int b) {
        if (a > b) {
            System.out.println("Larger number: " + a);
            System.out.println("Smaller number: " + b);
        } else if (b > a) {
            System.out.println("Larger number: " + b);
            System.out.println("Smaller number: " + a);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
    
    public static void main(String[] args) {
        compareNumbers(10, 20);
    }
}
