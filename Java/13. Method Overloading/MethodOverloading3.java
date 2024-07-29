public class MethodOverloading3 {
    public static void display(int a) {
        System.out.println("Integer parameter: " + a);
    }

    public static void display(double a) {
        System.out.println("Double parameter: " + a);
    }

    public static void main(String[] args) {
        display(10);
        display(10.5);
    }
}
