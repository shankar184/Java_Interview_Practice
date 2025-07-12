//package SeleniumPOMFramework;
//
//import com.nimbusds.oauth2.sdk.http.HTTPRequest;
//import org.apache.http.HttpResponse;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.io.IOException;
//import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
//import java.net.URI;
//import java.net.URL;
//import java.net.http.HttpRequest;
//import java.util.List;
//
//public class BrokenLinks {
//    public static void main(String[] args){
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://www.google.co.in/");
//        driver.manage().window().maximize();
//        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//        System.out.println("All the links : " +allLinks.size());
//
//        for(WebElement link : allLinks){
//            String url = link.getAttribute("href");
//
//            if (url == null || url.isEmpty()){
//                System.out.println("No links found");
//                continue;
//            }
//            if (!url.startsWith("https://")){
//                System.out.println("Links found are invalid :" +url);
//                continue;
//            }
//             try{
//            //create connection and set timeout
//                 URL link1 = new URL(url);
//                 HttpURLConnection connection = (HttpURLConnection) link1.openConnection();
//                 connection.connect();
//                 //Getting the response code
//                 int code = connection.getResponseCode();
//
//                 if ((code>= 400)){
//                     System.out.println("It's a broken link:" +url +"|Response code: " +code);
//                 }
//                 else {
//                     System.out.println("valid link:"+url +"|Response code: " +code);
//                 }
//
//
//             }catch (Exception e){
//                 System.out.println("Error checking the url:" +url+ "|Exception :" +e.getMessage());
//
//             }
//
//             }
//        driver.quit();
//    }
//}
