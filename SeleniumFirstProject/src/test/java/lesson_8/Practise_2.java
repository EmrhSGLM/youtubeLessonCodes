package lesson_8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        //   Amazon web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        // Search kutusuna "laptop" yazip aratin
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Laptop");
        searchBox.submit();

        //   Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement aramaSonucuElement = driver.findElement(By.xpath("(//div[@class=\"a-section a-spacing-small a-spacing-top-small\"]/span)[1]"));
        System.out.println("Arama Sonucu : " + aramaSonucuElement.getText());

        //   Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        WebElement firstPicture = driver.findElement(By.xpath("(//img[@class=\"s-image\"])[1]"));
        firstPicture.click();

        // 2 sn bekletin ve browseri kapatın
        Thread.sleep(2000);
        driver.quit();




    }
}
