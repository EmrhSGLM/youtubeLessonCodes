package lesson_12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_01 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts ");

        WebElement alertButton1 = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
        WebElement result = driver.findElement(By.id("result"));

        alertButton1.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        // JS ALert de tamam butonuna tiklamak icin accept() methodunu kullanırız
        Thread.sleep(2000);
        String expectedResult = "You successfully clicked an alert";
        String actualResult = result.getText();

        if(actualResult.equals(expectedResult)){
            System.out.println("Test 1 Passed");
        }

        Thread.sleep(2000);
        driver.close();


    }


}
