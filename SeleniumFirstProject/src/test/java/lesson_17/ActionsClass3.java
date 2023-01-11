package lesson_17;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass3 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html";
        driver.get(url);

        // Locate the element C ve Element D.
        WebElement titleC = driver.findElement(By.xpath("//li[@name='C']"));
        WebElement titleD = driver.findElement(By.xpath("//li[@name='D']"));
        // C elementini D elementinin uzerinde bekletin
        Actions actions = new Actions(driver);
        actions.clickAndHold(titleC).moveToElement(titleD).perform();
        driver.close();
        System.out.println("Test Passed !!!");
    }
}
