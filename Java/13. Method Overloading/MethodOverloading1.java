public class MethodOverloading1 {
    public static void display(int a) {
        System.out.println("One parameter: " + a);
    }

    public static void display(int a, int b) {
        System.out.println("Two parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        display(10);
        display(10, 20);
    }
}
