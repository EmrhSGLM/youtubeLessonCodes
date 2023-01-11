package lesson_17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // https://demoqa.com/droppable adresine gidelim
        String url = "https://demoqa.com/droppable";
        driver.get(url);

        // “Drag me” butonunu tutup “Drop here” kutusunun ustune birakalim
        WebElement tasinacakElement = driver.findElement(By.id("draggable"));
        WebElement tasinacakHedefElement = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(tasinacakElement,tasinacakHedefElement).perform();
        Thread.sleep(2000);

        // “Drop here” yazisi yerine “Dropped!” oldugunu test edin
        String expectedResult = "Dropped!";
        String actualResult = tasinacakHedefElement.getText();
        if(expectedResult.equals(actualResult)){
            System.out.println("actualResult = " + actualResult);
            System.out.println("Test Passed ...");
        }
        driver.close();
    }
}
