package lesson_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestClass {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https:\\www.amazon.com");

        Thread.sleep(3000);

        driver.close();

    }
}
