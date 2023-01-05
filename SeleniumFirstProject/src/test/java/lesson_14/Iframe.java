package lesson_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //         https://the-internet.herokuapp.com/iframe URL gidin
        String url = "https://the-internet.herokuapp.com/iframe";
        driver.get(url);


        //         “An IFrame containing….” textinin erisilebilir oldugunu test edin ve  konsolda    yazdirin.
        WebElement baslikText = driver.findElement(By.xpath("//div//h3"));
        String expectedResult = "An iFrame containing the TinyMCE WYSIWYG Editor";
        String actualResult = baslikText.getText();

        if(actualResult.equals(expectedResult)){
            System.out.println("Baslik Testi : Passed");
            System.out.println(actualResult);
        }

        //         Text Box’a “Merhaba Dunya!” yazin.
        // 1- İframe'i locate etme islemi
        Thread.sleep(2000);
        WebElement iframe =driver.findElement(By.tagName("iframe"));
        // driver'i iframe icerisine gonderecegiz
        driver.switchTo().frame(iframe);
        Thread.sleep(2000);
        WebElement textElement = driver.findElement(By.tagName("p"));
        Thread.sleep(2000);
        textElement.clear();
        Thread.sleep(2000);
        textElement.sendKeys("Merhaba Dunya!");
        Thread.sleep(2000);

        // 3- driver'i iframe icerisinden cıkarma islemi
        driver.switchTo().parentFrame(); // -> 1 ust seviyedeki frame cikarir
        //driver.switchTo().defaultContent(); // -> En ust frame cıkar
        driver.close();





    }
}
