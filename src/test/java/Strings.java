//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.remote.DesiredCapabilities;
//
//import java.io.File;
//import java.io.IOException;
//import java.net.URL;
//import java.nio.file.Files;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Objects;
//import java.util.Set;
//
//public class Strings {
//    public static void main(String[] args) throws IOException {
//        String xyz = "Hello world";
//        StringBuilder builder = new StringBuilder(xyz);
//        builder.reverse().toString();
//        System.out.println(builder);
//        AppiumDriver<MobileElement> driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723"),caps);
//
////        Desired capabilities for Android
//        DesiredCapabilities caps = new DesiredCapabilities();
//        public AppiumDriver createLocalAndroidDriverForEmulator(String appName){
//        caps.setCapability("platformName,"Android");
//                caps.setCapability("deviceName","Android-Emulator");
//        caps.setCapability("autoGrantPermissions","true");
//        caps.setCapability("appActivity","com.example.MainActivity");
//        caps.setCapability("automationName","uiAutomator2");
//        caps.setCapability("app",System.getProperty("user.dir")+("src/main/resources/testsApp")+appName);
//        }
//
//
//
//
//
//
//
//
//// list all the contexts
//        Set<String> contexts = driver.getContextHandles();
//        for (String allContext: contexts){
//            System.out.println("Available context :" +allContext);
//
////        switch to webview Context
//            for (String contextView: +allContext){
//                if (contextView.toLowerCase().equals("webview")){
//                    driver.context(contextView);
//                    System.out.println("Current context:"+ contextView);
//                    break;
//                }
//            }
//            driver.context("Native App");
//
//
//
//
////            ###############################################
//            File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//            File targetFile = new File("Screenshot.png");
//            Files.copy(scrFile.toPath(),targetFile.toPath());
//            driver.quit();
//
//            driver.executeScript("mobile: reset");
//            driver.executeScript("mobile: launchApp");
//            driver.executeScript("mobile: terminateApp", Map.of("appId","com.example.app"));
//
////            #############################################
//            MobileElement element = ((MobileElement)driver).findElement(By.id("some id"));
//            Map<String, Object> tapparams = new HashMap<>();
//            tapparams.put("elemnetId",element.getId());
//            driver.executeScript("mobile : clickGesture",tapparams);
//
//
////            longpress
//            Map<String,Object> longPress = new HashMap<>();
//            longPress.put("elementId",element.getId());
//            longPress.put("duration",2000);
//            driver.executeScript("mobile: longClickGesture",longPress);
//
//
//
//
//
//
//
//    }
//    }}
//
