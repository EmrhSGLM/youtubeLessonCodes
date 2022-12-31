package lesson_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com");


        //https://www.facebook.com adresine gidin
        String url = "https://www.facebook.com";
        driver.get(url);

        //“Yeni Hesap Oluşturun” button’una basin
        WebElement yeniHesapOlustur_Button = driver.findElement(By.xpath("//a[.='Yeni Hesap Oluştur']"));;
        yeniHesapOlustur_Button.click();

        //“radio buttons” elementlerini locate edin
        Thread.sleep(2000);
        WebElement erkek_RadioButton = driver.findElement(By.xpath("//input[@value=\"2\"]"));

        //Secili degilse cinsiyet butonundan size uygun olani secin
        if(!erkek_RadioButton.isSelected()){
            //Thread.sleep(2000);
            erkek_RadioButton.click();
            //Thread.sleep(2000);
        }

        driver.close();





    }
}
