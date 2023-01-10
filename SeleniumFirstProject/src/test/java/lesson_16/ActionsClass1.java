package lesson_16;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass1 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // amazon ana sayfa ya gidin
        driver.get("https://www.amazon.com");

        // sag ustte :Hello,sign in elementinin uzerinde mouse'u bekletin
        Actions actions = new Actions(driver);
        WebElement helloTextElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        actions.moveToElement(helloTextElement).perform();

        Thread.sleep(3000);

        // acilan menu de Create a list linkine tiklayin
        WebElement creatAListText = driver.findElement(By.xpath("//span[.='Create a List']"));
        actions.click(creatAListText).perform();
        // ve Create a list sayfasini acildigini test edin
        String expectedResult = "https://www.amazon.com/hz/wishlist/intro";
        String actualResult = driver.getCurrentUrl();
        if(expectedResult.equals(actualResult)){
            System.out.println("Test Passed !!!!");
        }
        Thread.sleep(1000);
        driver.close();

    }
}
