package lesson_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class _03_Fluent_Wait {

    static int count = 1;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
        element.sendKeys("iphone");

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(Exception.class);

        WebElement button = wait.until(_03_Fluent_Wait::apply);

        button.click();


    }


    private static WebElement apply(WebDriver driver) {
        System.out.println(count+". Deneme");
        count++;
        return driver.findElement(By.id("nav-search-submit-butto"));
    }
}
