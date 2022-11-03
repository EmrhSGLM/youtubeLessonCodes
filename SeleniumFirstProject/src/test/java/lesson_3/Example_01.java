package lesson_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_01 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");

        // 2. Sayfa basligini(title) yazdirin
        System.out.println("Sayfanin Title : " + driver.getTitle());
        String actualTitle = driver.getTitle();

        // 3. Sayfa basliginin Amazon icerdigini test edin
        String expectedTitle = "Amazon";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title Testi PASSED");
        } else  {
            System.out.println("Title Testi FAILED");
        }

        // 4. Sayfa adresini(url) yazdirin
        System.out.println("Sayafanin URL : " + driver.getCurrentUrl());

        // 5. Sayfa url’inin “amazon” icerdigini test edin.
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "amazon";
        if(actualURL.contains(expectedURL)){
            System.out.println("URL TESTI PASSED");
        } else {
            System.out.println("URL TESTI FAILED");
        }

        // 6. Sayfa handle degerini yazdirin
        System.out.println("Sayfanin Handle Degeri : " + driver.getWindowHandle());

        // 7. Sayfa HTML kodlarinda "shopping" kelimesi gectigini test edin
        String pageSource = driver.getPageSource();
        String expected = "shopping";
        if(pageSource.contains(expected)){
            System.out.println("HTML TESTI PASSED");
        } else {
            System.out.println("HTML TESTI FAILED");
        }

        // 8. Sayfayi kapatin.
        Thread.sleep(2000);
        driver.close();

    }


}
