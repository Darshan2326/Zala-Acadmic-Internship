import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            properties.load(fis);
            System.out.println(properties.getProperty("key1"));
            System.out.println(properties.getProperty("key2"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
