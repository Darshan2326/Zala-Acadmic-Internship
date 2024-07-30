import java.lang.reflect.Field;

public class GenerateNoSuchFieldException {
    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("java.lang.String");
            Field field = cls.getField("nonExistentField");
        } catch (ClassNotFoundException | NoSuchFieldException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
