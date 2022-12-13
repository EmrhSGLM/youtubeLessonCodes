package lesson_8;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // https://www.amazon.com.tr/ URL git
        driver.get("https://www.amazon.com.tr/");



        // Arama butonuna iphone 11 yaz ve arama işlemini yap
        driver.findElement(By.name("field-keywords")).sendKeys("iphone 11" , Keys.ENTER);

        // Cerezleri kabul et
        driver.findElement(By.id("sp-cc-accept")).click();

        // Arama sonucunun iphone 11 icerip icermedigini kontrol edin
        String aramaSonucuText =
                driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small']/span)[1]")).getText() +
                driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span)[3]")).getText();
        System.out.println("Arama Sonucu : " + aramaSonucuText);

        if(aramaSonucuText.contains("iphone 11")){
            System.out.println("Arama Sonucu iphone 11 iceriyor");
        }else{
            System.out.println("Arama Sonucu iphone 11 icermiyor");
        }

        // İlk urunun fiyatını console yazdirin
        System.out.println("İlk urun fiyatı : " + driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[1]")).getText());

        // 2 sn bekletin ve browseri kapatın
        Thread.sleep(2000);
        driver.quit();


    }
}
