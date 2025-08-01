package SeleniumPOMFramework;

public class MultiThreading {

    public void run() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }


    public static void main(String[] args) {
        Thread t1 = new TestThread();
        Thread t2 = new TestThread();
        t1.start();
        t2.start();
    }


}
