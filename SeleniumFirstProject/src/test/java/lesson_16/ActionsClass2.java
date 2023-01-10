package lesson_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

       //  https://the-internet.herokuapp.com/context_menu sitesine gidelim
        driver.get("https://the-internet.herokuapp.com/context_menu");

       //  Cizili alan uzerinde sag click yapalim
        Actions actions = new Actions(driver);
        WebElement ciziliAlan = driver.findElement(By.id("hot-spot"));
        actions.contextClick(ciziliAlan).perform();

       //  Alert’te cikan yazinin “You selected a context menu” oldugunu test edelim.
        String expectedResult = "You selected a context menu";
        String actualResult = driver.switchTo().alert().getText();
        Thread.sleep(3000);
        if(expectedResult.equals(actualResult)){
            System.out.println("actualResult = " + actualResult);
            System.out.println("Test Passed ");
        }

       //  Tamam diyerek alert’i kapatalim
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.close();

    }

}
