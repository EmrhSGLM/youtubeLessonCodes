import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_06 {


        public static void main(String[] args) {

	     /*
         Kullanıcının girmiş oldugu bir String'de tekrarlanan karakterleri(birden fazla olan karakterler) bulan ve console yazdıran method create ediniz
         Ör : İnput : "Java biraz bizi yordu."
         Output : Tekrar eden karakterler : a, b, i, r, z
         */

            Scanner s = new Scanner(System.in);
            System.out.println("Lutfen bir cumle giriniz : ");
            String cumle = s.nextLine();

            tekrarEdenKarakterleriBulanMethod(cumle);



        }

        public static void tekrarEdenKarakterleriBulanMethod(String str){
            List<String> list = new ArrayList<>();
            int sayac = 0;
            for(int i=0 ; i < str.length() ; i++ ){

                for(int j = i+1 ; j < str.length() ; j++){
                    if(str.charAt(i) == str.charAt(j)){
                       sayac++;
                       break;
                    }
                }
                if(sayac > 0 && !list.contains(str.substring(i,i+1))
                        && !str.substring(i,i+1).contains(" ")){
                   list.add(str.substring(i,i+1));
                }
                sayac = 0;

            }
            System.out.println("Tekrar Eden Karakterler : " + list);



        }





}
