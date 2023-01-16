package lesson_19;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practise_2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // https://html.com/tags/iframe/ sayfasina gidelim
        String url = "https://html.com/tags/iframe/";
        driver.get(url);

        // video’yu gorecek kadar asagi inin
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.ARROW_UP).
                perform();

        // videoyu izlemek icin Play tusuna basin
        WebElement iframe = driver.findElement(By.xpath("(//iframe)[1]"));
        driver.switchTo().frame(iframe);
        Thread.sleep(2000);
        WebElement playElement = driver.findElement(By.xpath("//button[@aria-label='Oynat']"));
        playElement.click();
        // videoyu calistirdiginizi test edin
        WebElement duraklatElement = driver.findElement(By.xpath("//button[@title='Duraklat (k)']"));
        if(duraklatElement.isEnabled()){
            System.out.println("Video oynatiliyor ....");
        }
        // video durdurun
        Thread.sleep(2000);
        duraklatElement.click();
        Thread.sleep(2000);
        // Browser'i kapatın
        driver.close();
    }


}
