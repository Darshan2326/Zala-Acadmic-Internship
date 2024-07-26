public class variabels {
    
    // Global
    static int var = 10;
    
    public static void main(String[] args) {
        // Local
        int var = 20;
        
        System.out.println("Local variable: " + var);
        System.out.println("Global variable: " + variabels.var);
    }
}
