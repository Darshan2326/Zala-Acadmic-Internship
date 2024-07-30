// import org.apache.poi.ss.usermodel.*;
// import org.apache.poi.xssf.usermodel.XSSFWorkbook;

// import java.io.FileOutputStream;
// import java.io.IOException;

// public class WriteExcelFile {
//     public static void main(String[] args) {
//         Workbook workbook = new XSSFWorkbook();
//         Sheet sheet = workbook.createSheet("Sheet1");

//         Row row = sheet.createRow(0);
//         Cell cell = row.createCell(0);
//         cell.setCellValue("Hello, World!");

//         try (FileOutputStream fos = new FileOutputStream("example.xlsx")) {
//             workbook.write(fos);
//         } catch (IOException e) {
//             e.printStackTrace();
//         } finally {
//             try {
//                 workbook.close();
//             } catch (IOException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }
