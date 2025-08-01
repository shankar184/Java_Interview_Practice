package SeleniumPOMFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * The `dBConnection` class demonstrates a Selenium WebDriver and database integration example.
 * It performs the following tasks:
 * - Launches a browser and navigates to a specified URL.
 * - Inputs user data into a web form and submits it.
 * - Connects to a MySQL database to retrieve user information.
 * - Compares the input data with the database records and validates them.
 */
public class dBConnection {

    /**
     * The main method initializes the WebDriver, interacts with a web form, connects to a database,
     * and validates the data retrieved from the database against the input data.
     *
     * @param args Command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {

        // Initialize the WebDriver (ChromeDriver in this case)
        WebDriver driver = new ChromeDriver();

        // Navigate to the specified URL
        driver.get("url");

        // Input data for the web form
        String firstNameInput = "abc";
        String lastNameInput = "xyz";

        // Locate and interact with web elements to input data and submit the form
        driver.findElement(By.id("some id")).sendKeys(firstNameInput);
        driver.findElement(By.id("some id")).sendKeys(lastNameInput);
        driver.findElement(By.id("some id")).click();

        // Database connection details
        String dBUrl = "jdbc:mysql://localhost:3306/your_database";
        String userName = "dada";
        String password = "saddsad";

        try {
            // Establish a connection to the database
            Connection conn = DriverManager.getConnection(dBUrl, userName, password);

            // SQL query to retrieve user data
            String query = "SELECT first_name, last_name FROM users WHERE email=\"xyz@gmail.com\"";

            // Create a statement and execute the query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // Validate the retrieved data against the input data
            if (rs.next()) {
                String dbFirstName = rs.getString("first_name");
                String dbLastName = rs.getString("last_name");

                if (firstNameInput.equals(dbFirstName) && lastNameInput.equals(dbLastName)) {
                    System.out.println("Both are same");
                } else {
                    System.out.println("There is a mismatch");
                }

                // Close the ResultSet and Statement
                rs.close();
                stmt.close();
            }

            // Close the database connection
            conn.close();

        } catch (Exception e) {
            // Handle exceptions during database operations
            System.out.println("Database error: " + e.getMessage());
        }

        // Close the browser and quit the WebDriver
        driver.close();
    }
}