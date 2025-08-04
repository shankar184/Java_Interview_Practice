package SeleniumPOMFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Demonstrates multithreading with Selenium WebDriver.
 */
public class MultiThreading extends Thread {

    /**
     * The run method is executed when the thread starts.
     * It opens a browser, navigates to Amazon, prints the title, and quits the browser.
     */
    @Override
    public void run() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }

    /**
     * The main method creates and starts two threads.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Thread t1 = new MultiThreading();
        Thread t2 = new MultiThreading();
        t1.start();
        t2.start();

    }
}