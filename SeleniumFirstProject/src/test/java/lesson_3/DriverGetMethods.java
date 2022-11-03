package lesson_3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com"); // get : Belirtilen URL'e gider

        System.out.println("Amazon URL : " + driver.getCurrentUrl()); // CurrentURL tarayıcıdaki o andaki URL getirir

        System.out.println("Amazon Title : " + driver.getTitle()); // Sayafaını title getirir .(Amazon.com. Spend less. Smile more.)

        driver.getPageSource(); // Tüm HTML kodlarını getirir

        System.out.println(driver.getWindowHandle()); // CDwindow-CDEEE0561B8D7BE179A1A0915F23FDCE
                                                      // CDwindow-92D5B860D33689D5899B421B9B793068

        System.out.println("Driver class type : " + driver.getClass()); // org.openqa.selenium.chrome.ChromeDriver


    }


}
