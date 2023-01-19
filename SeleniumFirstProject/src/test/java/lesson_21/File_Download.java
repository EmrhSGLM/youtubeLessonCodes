package lesson_21;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Files;
import java.nio.file.Paths;

public class File_Download {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // https://the-internet.herokuapp.com/download URL'e gidin
        String url = "https://the-internet.herokuapp.com/download";
        driver.get(url);
        Thread.sleep(2000);
        // resume.docx dosyasını indirin
        WebElement resumeElement = driver.findElement(By.xpath("//a[.='resume.docx']"));
        resumeElement.click();
        Thread.sleep(3000);
        // resume.docx dosyasının indirildigini kontrol edin
        // C:\Users\derdi\Downloads\resume.docx
        String dosyaYolu = System.getProperty("user.home")+"\\Downloads\\resume.docx";
        Boolean result = Files.exists(Paths.get(dosyaYolu));
        if(result){
            System.out.println("Test Passed ...");
        }else {
            System.out.println("Test Failed... ");
        }

        // Browser'i kapatin
        driver.close();

    }
}
