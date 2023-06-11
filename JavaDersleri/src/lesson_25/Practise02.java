package lesson_25;

import java.util.Scanner;

public class Practise02 {

    /*
        Kullanicini girmis oldugu 3 tamsayinin hangisinin büyük oldugunu bulan ve
        sonucu konsola yazdiran java kodunu yaziniz
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("İlk tamsayiyi giriniz : ");
        int a = input.nextInt();
        System.out.print("İkinci tamsayiyi giriniz : ");
        int b = input.nextInt();
        System.out.print("Ucuncu tamsayiyi giriniz : ");
        int c = input.nextInt();

        if(a > b && a > c){
            System.out.println("En buyuk tamsayi degeri : "+a);

        }else if(b > a && b > c){
            System.out.println("En buyuk tamsayi degeri : "+b);
        }else {
            System.out.println("En buyuk tamsayi degeri : "+c);
        }
    }

}
