package lesson_20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExists_2 {


    public static void main(String[] args) {

        // ***** Projenizde pom.xml oldugunu test edin ******
        // D:\youtubeVideoDersCodes\SeleniumFirstProject\pom.xml
        String dosyaYolu = System.getProperty("user.dir") + "//pomm.xml";
        Boolean result = Files.exists(Paths.get(dosyaYolu));
        if(result){
            System.out.println("Test Passed ...");
        }else {
            System.out.println("TEst Failed ....");
        }

    }
}
