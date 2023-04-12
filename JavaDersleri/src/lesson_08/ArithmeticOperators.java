package lesson_08;

public class ArithmeticOperators {

    public static void main(String[] args) {
        // + , - , * , / , %
        int sayi1 = 20 ;
        int sayi2 = 3 ;

        int toplam = sayi1 + sayi2 ;
        int cikarma = sayi1 - sayi2 ;
        int carpma = sayi1 * sayi2 ;
        int bolum = sayi1 / sayi2 ;
        int modulus = sayi1 % sayi2 ;
        // % => Bir sayinin baska bir sayi ile bolumunden kalan degeri bize verir.

        System.out.println("toplam = " + toplam);
        System.out.println("cikarma = " + cikarma);
        System.out.println("carpma = " + carpma);
        System.out.println("bolum = " + bolum);
        System.out.println("modulus = " + modulus);
    }
}
