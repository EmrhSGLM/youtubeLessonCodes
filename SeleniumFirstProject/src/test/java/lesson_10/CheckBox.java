package lesson_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //https://the-internet.herokuapp.com/checkboxes
        String url = "https://the-internet.herokuapp.com/checkboxes";
        driver.get(url);

        //b. Checkbox1 ve checkbox2 elementlerini locate edin.
        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));


        //c. Checkbox1 seçili değilse onay kutusunu tıklayın
        if(!checkBox1.isSelected()){
            Thread.sleep(2000);
           checkBox1.click();
        }

        //d. Checkbox2 seçili değilse onay kutusunu tıklayın
        Thread.sleep(2000);
        if(!checkBox2.isSelected()){
            checkBox2.click();
        }

        driver.close();



    }

}
