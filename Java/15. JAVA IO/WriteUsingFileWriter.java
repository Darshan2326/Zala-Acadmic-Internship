import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingFileWriter {
    public static void main(String[] args) {
        String text = "Hello, World!";
        try (FileWriter writer = new FileWriter("E:\\internship\\ZALA\\JAVA_PDFs\\Java\\java_io_1.txt")) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
