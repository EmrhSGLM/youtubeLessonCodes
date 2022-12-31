package lesson_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_02 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts ");

        WebElement alertButton2 = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
        WebElement result = driver.findElement(By.id("result"));

        alertButton2.click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        // JS Alert isleminde Cancel tusuna basmak istiyorsak dismiss() methodunu kullanmamız gerekiyor
        Thread.sleep(2000);

        String expectedResult = "You clicked: Cancel";
        String actualResult = result.getText();

        if(actualResult.equals(expectedResult)){
            System.out.println("Test 2 Passed");
        }

        Thread.sleep(2000);
        driver.close();



    }
}
