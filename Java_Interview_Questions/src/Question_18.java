import java.util.Scanner;

public class Question_18 {

    public static void main(String[] args) {

        /*
        Verilen sayıdan küçük veya ona eşit olan asal sayıları yazdırınız.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz : ");
        int sayi = scan.nextInt();
        boolean control = true;

        for(int i=sayi ; i>1 ; i--){
            for(int j=2; j<i ; j++){
                if(i%j == 0){
                   control=false;
                   break;
                }
            }
            if(control){
                System.out.print(i+" ");
            }
            control = true;
        }




    }
}
