package lesson_18;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        // Scanner Kullanimi
        // 1.Adim : Scanner classından bir obje olusturuyoruz
        Scanner input = new Scanner(System.in);

        // 2.Adim : Kullaniciya mesaj verme - bilgilendirme islemi
        System.out.println("Yasinizi giriniz ...");

        // 3.Adim : Kullanicidan alinan degeri bir variable'a assign etme islemi
        byte age = input.nextByte();

        System.out.println("Yasiniz : " + age);
    }

}
