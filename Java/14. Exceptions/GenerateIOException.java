import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class GenerateIOException {
    public static void main(String[] args) {
        try {
            File file = new File("file.txt");
            FileReader fr = new FileReader(file);
            fr.read();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
