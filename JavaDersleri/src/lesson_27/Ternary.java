package lesson_27;

import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {

        // Kullanıcımızın girmis oldugu sayinin tek mi çift mi oldugunu kontrol edin ve sonucu consola yazdırın
        // KOŞUL  ? TRUE  :  FALSE ;
//        Scanner input = new Scanner(System.in);
//        System.out.print("Bir tamsayi giriniz : ");
//        int a = input.nextInt();
//
//        if(a % 2 == 0){
//            System.out.println("Çift sayidir ...");
//        }else {
//            System.out.println("Tek sayidir ...");
//        }
//        System.out.println("Ternary Kullanımı");
//
//
//
//        String result = a % 2 == 0 ? "Çift sayidir ..." : "Tek sayidir ...";
//        System.out.println(result);

        int sayi = 120 ;
        // 100 den kucuk ve cift sayi olacak ise konsola sartı saglıyorsunuz

        String result = sayi < 100 ? sayi % 2 == 0 ? "Şartı sağlıyorsunuz" :  "Şartı sağlamıyorsunuz ... "   : "Şartı sağlamıyorsunuz ... "  ;
        System.out.println(result);






    }

}
