import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadUsingInputStream {
    public static void main(String[] args) {
        try (InputStream inputStream = new FileInputStream("E:\\internship\\ZALA\\JAVA_PDFs\\Java\\java_io_1.txt")) {
            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
