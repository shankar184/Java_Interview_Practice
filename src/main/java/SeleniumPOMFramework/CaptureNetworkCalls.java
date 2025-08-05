package SeleniumPOMFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v117.network.Network;

import java.util.Optional;

public class CaptureNetworkCalls {

    /**
     * Captures network traffic using Selenium DevTools Protocol.
     */
    public void captureNetworkTraffic() {
        WebDriver driver = new ChromeDriver();
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        // Enable Network tracking
        devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

        // Listen to network requests
        devTools.addListener(Network.requestWillBeSent(), request ->
                System.out.println("Request URL: " + request.getRequest().getUrl())
        );

        driver.get("https://www.example.com");
        driver.quit();
    }
}