public class IncrementDecrementOperators {
    
    public static void incrementDecrementOperations(int a) {
        System.out.println("Original value: " + a);
        System.out.println("After increment: " + (++a));
        System.out.println("After decrement: " + (--a));
    }
    
    public static void main(String[] args) {
        incrementDecrementOperations(10);
    }
}
