package lesson_10;

public class Artirma_Azaltma_Operatoru {

    public static void main(String[] args) {
        // ++ -- > ilgili sayiyi bir artırmak için kullanılır
        // -- -- > ilgili sayiyi bir azaltmak için kullanılır

        int sayi = 5;

        int sayi2 = sayi--;
        int sayi3 = --sayi;
        System.out.println("sayi :" + sayi);
        System.out.println("sayi2 : " + sayi2);
        System.out.println("sayi3 : " + sayi3);
    }
}
