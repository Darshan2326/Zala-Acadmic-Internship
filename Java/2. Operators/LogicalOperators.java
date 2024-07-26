public class LogicalOperators {
    
    public static void logicalOperations(boolean a, boolean b) {
        System.out.println("a && b: " + (a && b)); // Logical AND
        System.out.println("a || b: " + (a || b)); // Logical OR
        System.out.println("!a: " + (!a));         // Logical NOT
    }
    
    public static void main(String[] args) {
        logicalOperations(true, false);
    }
}
