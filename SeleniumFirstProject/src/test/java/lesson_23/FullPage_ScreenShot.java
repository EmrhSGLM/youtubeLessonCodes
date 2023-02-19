package lesson_23;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class FullPage_ScreenShot {

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Amazon'a git
        driver.get("https://www.amazon.com");

        // Arama kutusuna Apple yaz ve ara
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Apple" , Keys.ENTER);

        // Tum sayfanin ekran goruntusune al

        // ScreenShot islemi 4 adimda gerceklesir

        //1. TakeScreenShot objesi olusturuyorum
        TakesScreenshot tss = (TakesScreenshot) driver;
        //2. Kaydedecegimiz dosyayı olusturacagiz
        String output = System.getProperty("user.dir") + "//ScreenShot//tumSayfa.png";
        File tumSayafaSS = new File(output);
        //3. Bir dosya daha olusturacagiz ve screenshot objesi ile ekran goruntusu alma islemi yapacagiz
        File geciciResim = tss.getScreenshotAs(OutputType.FILE);
        //4. GeciciResmi kaydetmek istedigimiz asil dosyaya copy islemi yapilir.
        FileUtils.copyFile(geciciResim,tumSayafaSS);

        // Driver'i kapat
        driver.quit();



    }
}
