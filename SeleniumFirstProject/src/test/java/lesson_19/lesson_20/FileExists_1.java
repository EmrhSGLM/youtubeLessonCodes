package lesson_19.lesson_20;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExists_1 {

    public static void main(String[] args) {

        // Masaustunde Test klasoru icerisinde deneme.txt isminde bir dosya olusturun
        // Daha sonra bu dosyanın bilgisayarınızda oldugunu test edin

        // C:\Users\derdi\OneDrive\Masaüstü\Test\deneme.txt
        String dosyaYolu = System.getProperty("user.home")+"\\OneDrive\\Masaüstü\\Test\\deneme.txt";
        Boolean result = Files.exists(Paths.get(dosyaYolu));
        if(result){
            System.out.println("Test Passed ...");
        }else{
            System.out.println("Test Failed ...");
        }

        // System.out.println(System.getProperty("user.dir")); // D:\youtubeVideoDersCodes\SeleniumFirstProject
        // System.out.println(System.getProperty("user.home")); // C:\Users\derdi



    }
}
