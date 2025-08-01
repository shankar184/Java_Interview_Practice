package SeleniumPOMFramework;

import com.nimbusds.oauth2.sdk.http.HTTPRequest;
import org.apache.http.HttpResponse;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpRequest;
import java.util.List;

/**
 * The `BrokenLinks` class is used to identify and validate all the links on a webpage.
 * It checks if the links are valid or broken by analyzing their HTTP response codes.
 */
public class BrokenLinks {

    /**
     * The main method initializes the WebDriver, navigates to a webpage, retrieves all links,
     * and validates their status by checking their HTTP response codes.
     *
     * @param args Command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        // Initialize the WebDriver (ChromeDriver in this case)
        WebDriver driver = new ChromeDriver();

        // Navigate to the specified URL
        driver.get("http://www.google.co.in/");
        driver.manage().window().maximize();

        // Retrieve all anchor elements (<a>) from the webpage
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("All the links : " + allLinks.size());

        // Iterate through each link and validate its status
        for (WebElement link : allLinks) {
            // Get the href attribute of the link
            String url = link.getAttribute("href");

            // Check if the URL is null or empty
            if (url == null || url.isEmpty()) {
                System.out.println("No links found");
                continue;
            }

            // Check if the URL starts with "https://"
            if (!url.startsWith("https://")) {
                System.out.println("Links found are invalid :" + url);
                continue;
            }

            try {
                // Create a connection to the URL and set a timeout
                URL link1 = new URL(url);
                HttpURLConnection connection = (HttpURLConnection) link1.openConnection();
                connection.connect();

                // Get the HTTP response code
                int code = connection.getResponseCode();

                // Check if the response code indicates a broken link
                if (code >= 400) {
                    System.out.println("It's a broken link:" + url + "|Response code: " + code);
                } else {
                    System.out.println("Valid link:" + url + "|Response code: " + code);
                }

            } catch (Exception e) {
                // Handle exceptions during URL validation
                System.out.println("Error checking the url:" + url + "|Exception :" + e.getMessage());
            }
        }

        // Close the browser and quit the WebDriver
        driver.quit();
    }
}