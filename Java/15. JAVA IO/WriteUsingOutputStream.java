import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteUsingOutputStream {
    public static void main(String[] args) {
        String text = "Hello, Darshan Sir I am Java Compiler";
        try (OutputStream outputStream = new FileOutputStream("E:\\internship\\ZALA\\JAVA_PDFs\\Java\\java_io_1.txt")) {
            outputStream.write(text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
