import java.util.Scanner;

public class Question_09 {

    public static void main(String[] args) {

        /*
         * Kullanıcıdan bir sayı girmesini isteyin, sayının asal olup olmadığını
         * kontrol eden ve sonucu console yazdıran java code nu yazınız
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz : ");
        int sayi = scan.nextInt();
        boolean control = true;

        if(sayi>=2){

            for(int i=2 ; i<sayi ; i++){

                if(sayi % i == 0){
                    control = false;
                    break;
                }
            }

        } else {
            control = false;
        }
        if(control){
            System.out.println(sayi + " Asal Sayidir.");
        } else {
            System.out.println(sayi + " Asal Sayi Degildir.");
        }




    }


}
