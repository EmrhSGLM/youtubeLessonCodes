package lesson_14;

public class Example01 {
    /*
    int bir degiskenin degerinin aralıklarını kontrol eden bir program yaziniz
        int sayi = 82;

        0 - 50 ve çift : false
        50 - 100 ve çift : true

        0 - 50 ve tek : false
        50 - 100 ve tek : false
     */
    public static void main(String[] args) {

        int a = 98;
        boolean  s1 = 0 < a && a < 50 && a % 2 == 0 ;
        boolean  s2 = 50 < a && a < 100 && a % 2 == 0 ;

        boolean  s3 = 0 < a && a < 50 && a % 2 == 1 ;
        boolean  s4 = 50 < a && a < 100 && a % 2 == 1 ;

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);

    }

}
