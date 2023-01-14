package lesson_18;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions_1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        //  2- https://www.amazon.com sayfasina gidelim
        String url = "https://www.amazon.com";
        driver.get(url);
        //  3- Arama kutusuna actions method’larine kullanarak Samsung A71 yazdirin
        //     ve Enter’a basarak arama yaptirin
        WebElement seacrhBox = driver.findElement(By.id("twotabsearchtextbox"));
        Actions actions = new Actions(driver);
        //actions.click(seacrhBox).
        //        keyDown(Keys.SHIFT).
        //        sendKeys("s").
        //        keyUp(Keys.SHIFT).
        //        sendKeys("amsung").
        //        sendKeys(Keys.SPACE).
        //        sendKeys("A71").
        //        sendKeys(Keys.ENTER).
        //        perform();

        actions.click(seacrhBox).
                sendKeys("Samsung A71").
                sendKeys(Keys.ENTER).
                perform();

        //  4- aramanin gerceklestigini test edin
        String expectedResult = "\"Samsung A71\"";
        String actualResult = driver.findElement(By.xpath("//*[.='\"Samsung A71\"']")).getText();
        if(actualResult.equals(expectedResult)){
            System.out.println("Test Passed ");
        }

        // Browser kapatılır
        driver.close();







    }
}
