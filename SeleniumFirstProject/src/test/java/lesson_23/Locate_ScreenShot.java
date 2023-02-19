package lesson_23;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Locate_ScreenShot {

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

        // Arama sonucunun ekran goruntusune al

        // Belli bir alanin SS islemide 4 adimda gerceklesir
        //1. ScreenShot islemini yapacagimiz elementi locate etmek
        WebElement locateSS = driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"])[1]"));
        //2. ScreenShot'i kayıt edecegimiz bir File olusturacagiz
        String output = System.getProperty("user.dir") + "//ScreenShot//locateSS.png";
        File webElementSS = new File(output);
        //3. Gecici Resim icin bir screenshot dosyasi olusturacagiz
        File geciciResim = locateSS.getScreenshotAs(OutputType.FILE);
        //4. Gecici REsmi asil dosyasina copy islemi yapilir.
        FileUtils.copyFile(geciciResim, webElementSS);

        // Driver'i kapat
        driver.quit();



    }

}
