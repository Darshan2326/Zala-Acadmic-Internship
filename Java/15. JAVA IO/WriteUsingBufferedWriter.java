import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUsingBufferedWriter {
    public static void main(String[] args) {
        String text = "Hello, World!";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\internship\\ZALA\\JAVA_PDFs\\Java\\java_io_1.txt"))) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
