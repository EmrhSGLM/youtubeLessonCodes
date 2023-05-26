package lesson_21;

public class StringManipulations2 {

    public static void main(String[] args) {

        String str = "Java candır ";

        // lastIndexOf() - contains() - startsWith() - endsWith()

        //lastIndexOf() => verilen karakterin kontrolune sondan baslar ve
        //                ilk buldugu yerdeki indexin degerini bize doner

        // contains("   ")=> sorgulanan degerin String deger icerisinde olup olmadıgını
        //             kontrol eder

        // startsWith("deger") => Girilen deger ile variable'ın degerinin baslayıp
        //              baslamadigini kontrol eder

        // endsWith("deger") => Girilen deger ile variable'ın degerinin bitip
        //              bitmedigini kontrol eder


//        System.out.println(str.indexOf("a"));
//        System.out.println(str.lastIndexOf("a"));
//        System.out.println(str.contains("and"));
        System.out.println(str.startsWith("Jav"));
        System.out.println(str.endsWith(" "));

    }


}
