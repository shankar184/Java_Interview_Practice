package SeleniumPOMFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static java.sql.DriverManager.getDriver;

public class DriverFactory {
    private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
    private static WebDriver initDriver(){
        String browser = ConfigReader.getConfig("browser");
            switch(browser){
                case "chrome":
                    WebDriver driver = new ChromeDriver();
                    break;
                case "firefox":
                        driver = new FirefoxDriver();
                default:
                    throw new IllegalArgumentException("Not supporting browser");

            }
           getDriver().manage().window().maximize();
            return getDriver();



    }
    public static WebDriver getDriver(){
        return tlDriver.get();
    }
    public static void quitDriver(){
        if(tlDriver.get() != null){
            tlDriver.get().quit();
            tlDriver.remove();
        }
    }

}
