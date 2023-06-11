package lesson_25;

import java.util.Scanner;

public class Practise01 {

    /*
        Kullanicini girmis oldugu 2 tane tamsayinin hangisinin büyük oldugunu bulan ve
        sonucu konsola yazdiran java kodunu yaziniz
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk tamsayiyi giriniz ...");
        int a = input.nextInt();

        System.out.print("İkinci tamsayiyi giriniz ...");
        int b = input.nextInt();

        if(a > b){
            System.out.println(a + " tamsayisi " + b + "'den buyuktur");
        }else {
            System.out.println(b + " tamsayisi " + a + "'den buyuktur");
        }


    }


}
