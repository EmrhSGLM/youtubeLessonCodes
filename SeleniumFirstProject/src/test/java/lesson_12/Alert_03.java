package lesson_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_03 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts ");

        WebElement alertButton3 = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        WebElement result = driver.findElement(By.id("result"));

        alertButton3.click();
        Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Emrah Saglam");
        // JS Alert icinde bulunan box icine veri girmek icin sendKeys() methodunu kullanırız
        Thread.sleep(5000);
        driver.switchTo().alert().accept();

        String expectedResult = "You entered: Emrah Saglam";
        String actualResult = result.getText();

        if(actualResult.equals(expectedResult)){
            System.out.println("Test 3 Passed");
        }

        Thread.sleep(2000);
        driver.close();

    }
}
