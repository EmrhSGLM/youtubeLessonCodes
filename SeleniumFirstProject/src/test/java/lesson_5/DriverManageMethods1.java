package lesson_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManageMethods1 {


    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // 1. Youtube sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        // 2. Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Sayfanın Konumu : " + driver.manage().window().getPosition());
        System.out.println("Sayfanın Boyutları : " + driver.manage().window().getSize());

        // 3. Sayfayi simge durumuna getirin
        driver.manage().window().minimize();


        // 4. simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();

        // 5. Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Max Sayfanın Konumu : " + driver.manage().window().getPosition());
        System.out.println("Max Sayfanın Boyutları : " + driver.manage().window().getSize());

        // 6. Sayfayi fullscreen yapin
        driver.manage().window().fullscreen();

        // 7. Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("FullScreen Sayfanın Konumu : " + driver.manage().window().getPosition());
        System.out.println("FullScreen Max Sayfanın Boyutları : " + driver.manage().window().getSize());
        Thread.sleep(3000);

        // 8. Sayfayi kapatin
        driver.close();




    }
}
