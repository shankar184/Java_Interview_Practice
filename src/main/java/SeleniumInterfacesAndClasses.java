public class SeleniumInterfacesAndClasses {
    public static void main(String[] args){
//        Interface | Purpose
//        WebDriver | Main interface to control browsers (Chrome, Firefox, etc.).

//        WebElement | Represents an element on the web page (button, input box, etc.).

//        SearchContext | Super interface for WebDriver and WebElement; used for findElement() and findElements().
//                TakesScreenshot | Allows capturing screenshots of the browser.
//                JavascriptExecutor | Used to execute JavaScript code within the browser.
//                Alert | Handles JavaScript alerts, confirms, and prompts.
//                Options | Nested interface inside WebDriver; used for browser options like cookies, window management, etc.
//                Navigation | Nested inside WebDriver; used to control browser navigation (forward, back, refresh).
//                Timeouts | Handles different timeout settings like implicit wait, page load timeout, etc.
//        Window | Manages browser window (maximize, fullscreen, switch window, etc.).


//        #####################################################################
//        Class | Purpose
//        ChromeDriver, FirefoxDriver, EdgeDriver, etc. | Browser-specific implementations of WebDriver.
//                By | Locator strategy class (find elements by ID, Name, XPath, CSS Selector, etc.).
//        ExpectedConditions | Contains pre-built conditions to use with WebDriverWait (like elementToBeClickable, visibilityOf, etc.).
//                WebDriverWait | Used for explicit waits — waiting for a certain condition before proceeding.
//                Actions | Used for advanced user interactions like drag-and-drop, hover, double-click, etc.
//                Select | Special class for interacting with dropdown <select> elements.
//        RemoteWebDriver | Class for executing tests remotely (like Selenium Grid, cloud providers).
//                OutputType | Defines output types for screenshot capturing.
//        FluentWait | A special kind of Wait with custom polling frequency and ignoring specific exceptions.
//        DesiredCapabilities (Deprecated, replaced by Options) | Previously used for setting browser capabilities before launch.
    }
}
