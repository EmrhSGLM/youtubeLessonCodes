package lesson_25;

import java.util.Scanner;

public class Practise03 {
    /*
    Kullanicinin girmis oldugu vize ve final sınav notlarını kullanarak
    harf notunu hesaplayan ve sonucu console yazdiran java kodunu yaziniz
    Note : Vize notunun %40 - Final notunu %60 alınarak ortalama not hesaplanacak
            0 - 35 -> FF
            35 - 50 -> DD
            50 - 70 -> CC
            70 - 80 -> BB
            80 - 100 -> AA
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Vize notunuzu giriniz : ");
        double vize = input.nextDouble();
        System.out.print("Final notunuzu giriniz : ");
        double fnl = input.nextDouble();

        double ortNot = (vize*0.4) + (fnl*0.6);
        System.out.println("ortNot = " + ortNot);
        if(ortNot < 35){
            System.out.println("FF");
        } else if (ortNot < 50) {
            System.out.println("DD");
        } else if (ortNot < 70) {
            System.out.println("CC");
        } else if (ortNot < 80) {
            System.out.println("BB");
        } else {
            System.out.println("AA");
        }
    }

}
