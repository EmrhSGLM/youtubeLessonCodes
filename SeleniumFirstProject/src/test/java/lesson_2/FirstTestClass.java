package lesson_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstTestClass {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);


        driver.get("https:\\www.amazon.com");

        Thread.sleep(3000);

        driver.close();

    }
}
