package SeleniumPOMFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

/**
 * Reads and prints data from all rows and cells of an HTML table using Selenium WebDriver.
 */
public class ReadDataFromRowsAndCells {

    public static void main(String[] args) {
        // Initialize WebDriver (make sure chromedriver is in your PATH)
        WebDriver driver = new ChromeDriver();

        // Navigate to the target web page
        driver.get("https://example.com"); // Replace with your actual URL

        // Locate the table by its ID (replace 'tableId' with the actual table ID)
        WebElement table = driver.findElement(By.id("tableId"));

        // Get all rows in the table
        List<WebElement> rows = table.findElements(By.tagName("tr"));

        // Iterate through each row
        for (WebElement row : rows) {
            // Get all cells in the current row
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                // Print the cell text
                System.out.print(cell.getText() + "\t");
            }
            System.out.println();
        }

        // Close the browser
        driver.quit();
    }
}