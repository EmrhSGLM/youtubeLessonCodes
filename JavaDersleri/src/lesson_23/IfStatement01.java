package lesson_23;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {
        // if
        // if - else

        // Basvuru yapabilmesi icin 15 yasindan buyuk olmasi gerekmektedir
//        int age = 14;
//
//
//        if(age > 15) {
//            System.out.println("Basvuru yapabilirsiniz ...");
//        }else {
//            System.out.println("Basvuru sartını saglamiyorsunuz !...");
//        }

        // Kullanicinin girmiş oldugu degerin cift sayi olup olmadigini kontrol eden code yaziniz...
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz ...");

        int sayi = input.nextInt();

        if(sayi % 2 == 0) {
            System.out.println(sayi + " bir cift sayidir ...");
        }else {
            System.out.println(sayi + " bir tek sayidir ...");
        }




    }

}
