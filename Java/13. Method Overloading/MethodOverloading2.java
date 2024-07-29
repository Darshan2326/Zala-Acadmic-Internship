public class MethodOverloading2 {
    public static void display(int a) {
        System.out.println("Integer parameter: " + a);
    }

    public static void display(String s) {
        System.out.println("String parameter: " + s);
    }

    public static void main(String[] args) {
        display(10);
        display("Hello");
    }
}

