import java.lang.reflect.Method;

public class GenerateNoSuchMethodException {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("java.lang.String");
            Method method = cls.getMethod("nonExistentMethod");
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
