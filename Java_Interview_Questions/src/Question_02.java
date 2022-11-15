import java.util.Scanner;

public class Question_02 {

    public static void main(String[] args) {
        /*
             Kullanıcıdan alınan bir sayının Armstrong sayı olup olmadıgını kontrol edin. sonucu console yazdırın
             Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir

            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayı giriniz : ");
        int sayi = scan.nextInt();
        int sayi1=sayi;
        int toplamaKabi = 0;

        for(int i=1; i <= Integer.toString(sayi).length() ; i++){

            int birlerBasamagi  = sayi1%10;
            toplamaKabi += (birlerBasamagi*birlerBasamagi*birlerBasamagi);
            sayi1 = sayi1/10;

        }

        if(toplamaKabi == sayi){
            System.out.println("Sayi bir armstrong sayidir.");
        }else {
            System.out.println("Sayi bir armstrong sayi degildir.");
        }





    }
}
