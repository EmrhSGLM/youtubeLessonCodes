package lesson_12;

public class RelationalOperator {

    public static void main(String[] args) {
        // ==  --> 2 degerin birbirine esit olup olmadıgını kontrol eder
        // !=  --> 2 degerin birbirine esit olmadigini kontrol eder
        // >   --> bir sayinin diger sayidan buyuk olup olmadigini kontrol eder
        // <   --> bir sayinin diger sayidan kucuk olup olmadigini kontrol eder
        // >=  --> bir sayinin diger sayidan buyuk veya esit olup olmadigini kontrol eder
        // <=  --> bir sayinin diger sayidan kucuk veya esit olup olmadigini kontrol eder

        int sayi1 = 10;
        int sayi2 = 20;
        //boolean sonuc = sayi1 == sayi2;
        //boolean sonuc = sayi1 != sayi2;
        //boolean sonuc = sayi1 > sayi2;
        //boolean sonuc = sayi1 < sayi2;
        //boolean sonuc = sayi1 >= sayi2;
        boolean sonuc = sayi1 <= sayi2;

        System.out.println(sonuc);

    }
}
