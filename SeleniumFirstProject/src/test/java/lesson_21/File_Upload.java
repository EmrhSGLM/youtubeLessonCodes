package lesson_21;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class File_Upload {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\project\\chromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //https://the-internet.herokuapp.com/upload adresine gidelim
        String url = "https://the-internet.herokuapp.com/upload";
        driver.get(url);

        //Dosya Sec butonuna basalim
        WebElement fileSecButton = driver.findElement(By.id("file-upload"));

        //Yuklemek istediginiz dosyayi secelim.
        Thread.sleep(2000);
        String dosyaYolu = System.getProperty("user.home")+"\\Downloads\\resume.docx";
        fileSecButton.sendKeys(dosyaYolu);
        Thread.sleep(3000);

        //Upload butonuna basalim.
        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();
        Thread.sleep(3000);
        //“File Uploaded!” textinin goruntulendigini test edelim
        WebElement fileUploadedText = driver.findElement(By.xpath("//h3[.='File Uploaded!']"));
        if(fileUploadedText.isEnabled()){
            System.out.println("Test PAssed");
        }else {
            System.out.println("Test Failed");
        }
        driver.close();
    }
}
