import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteUsingBufferedOutputStream {
    public static void main(String[] args) {
        String text = "Hello, World!";
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\internship\\ZALA\\JAVA_PDFs\\Java\\java_io_1.txt"))) {
            bos.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
