package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class SingletonPattern {

    // 1. Private static instance
    private static DriverManager instance = null;

    // 2. Private WebDriver reference
    private WebDriver driver;

    // 3. Private constructor (Prevents external instantiation)
    private DriverManager() {
        // Initialize driver only once
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // 4. Public method to provide a global access point
    public static DriverManager getInstance() {
        if (instance == null) {
            instance = new DriverManager();
        }
        return instance;
    }

    // 5. Public method to get WebDriver
    public WebDriver getDriver() {
        return driver;
    }

    // 6. Method to quit browser and reset instance
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
            instance = null;
        }
    }
}
