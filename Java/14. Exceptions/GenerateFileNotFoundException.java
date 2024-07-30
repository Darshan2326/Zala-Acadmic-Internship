import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class GenerateFileNotFoundException {
    public static void main(String[] args) {
        try {
            File file = new File("non_existent_file.txt");
            FileInputStream fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        }
    }
}
