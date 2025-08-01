import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * The `ExcelReader` class demonstrates how to read data from an Excel file using the Apache POI library.
 * It reads the content of the first sheet in an Excel file and prints the cell values to the console.
 */
public class ExcelReader {

    /**
     * The main method opens an Excel file, reads its content, and prints the cell values.
     *
     * @param args Command-line arguments (not used in this implementation).
     * @throws Exception If an error occurs while reading the file or processing the workbook.
     */
    public static void main(String[] args) throws Exception {
        // Open the Excel file
        FileInputStream file = new FileInputStream("data.xlsx"); // Opening Excel file

        // Create a Workbook instance for the .xlsx file
        Workbook wb = new XSSFWorkbook(file); // Creating Workbook instance for .xlsx file

        // Access the first sheet (index 0) in the workbook
        Sheet sheet = wb.getSheetAt(0); // Accessing the first sheet (index 0)

        // Iterate through each row in the sheet
        for (Row row : sheet) { // Loop through each row
            // Iterate through each cell in the current row
            for (Cell cell : row) { // Loop through each cell in a row
                // Print the content of the cell as a string
                System.out.println(cell.getStringCellValue()); // Print cell content as string
            }
        }

        // Close the workbook to free memory
        wb.close(); // Close the workbook to free memory
    }
}