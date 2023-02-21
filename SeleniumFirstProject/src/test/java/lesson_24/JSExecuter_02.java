package lesson_24;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class JSExecuter_02 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com/");


        // JavascsriptExecuter classını kullanmak icin 3 adim izlenmesi gerekir

        //1.Adim JSExecuter objesi olusturup driver'i cast edecegiz
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        // 2.Adim ilgili WebElementi locate edilir
        WebElement sellElement = driver.findElement(By.xpath("//*[.='Sell products on Amazon']"));
        //3.Adim jse.executeScript("ilgili script", ilgiliElement)
        jse.executeScript("arguments[0].scrollIntoView(true);", sellElement);
        Thread.sleep(3000);
        jse.executeScript("arguments[0].click();", sellElement);

        WebElement controlElement = driver.findElement(By.xpath("//*[contains(text(),'$1,000,000 in branded sales.')]"));
        if(controlElement.isEnabled()){
            System.out.println("Test Passed !!!");
        }
        driver.quit();




    }
}
