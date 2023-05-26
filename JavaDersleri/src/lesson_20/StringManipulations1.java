package lesson_20;

public class StringManipulations1 {
    public static void main(String[] args) {
        // length() - equals() - equalsIgnoreCase() - indexOf()

        // length => String variable'in uzunlugunu ifade eder. 1'den baslayarak sayma islemi yapar
        // index => String variable indexleme isleme yaparken 0'dan baslanır
        // ve bu indexe gore bizim karakteri cagırmamiz gerekir
        String str = "JAvaJ candIr";
        String str1 = "Java cAndır";

        //boolean result = str.equals(str1);
        //boolean result = str.equalsIgnoreCase(str1);
        //System.out.println(result);
        // equals()=> iki string'i index index karsilastirir eger tum indexler aynı karakteri
        //            iceriyor ise bize true doner, aksi halde false return eder.
        // equalsIgnoreCase() => iki string'i index index karsilastirir ama karakterler arasinda
        //            buyuk kucuk harf duyarlılıgını goz ardı eder, tum indexler aynı karakteri
        //           iceriyor ise bize true doner, aksi halde false return eder.

        System.out.println(str.indexOf("J"));
        // indexOf() => İstenen karakteri String icinde 0. indexden baslayarak arama islemi yapar.
        //              ilk buldugu indexdeki index degerini bize doner

    }

}
