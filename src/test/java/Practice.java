import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.security.PrivateKey;
import java.time.Duration;
import java.util.NoSuchElementException;

public class Practice {
    private WebDriver driver;

    Wait<WebDriver> wait = new FluentWait<>(driver)
    .withTimeout(Duration.ofSeconds(10)).
            pollingEvery(Duration.ofSeconds(10)).
            ignoring(NoSuchElementException.class);


    WebElement element = wait.until(driver1 -> driver.findElement(By.id("")));


//    ###########################
//    Mouse Actions:

//    WebElement elementToHover = driver.findElement(By.id("Hover"));
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//    js.executeScript("arguements[0].dispatchEvent(new MouseEvent(mouseover));",elementToHover);
}
