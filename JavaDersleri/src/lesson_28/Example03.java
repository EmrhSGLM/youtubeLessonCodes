package lesson_28;

public class Example03 {

    //  Size verilen String'de tekrarsiz karakterleri ekrana yazdirin
    //     "Merhaba Mehmet" => rb mt

    public static void main(String[] args) {
        String str = "Merhaba Mehmet";
        for(int i=0 ; i < str.length() ; i++){
            char karakter = str.charAt(i);
            if (str.indexOf(karakter) == str.lastIndexOf(karakter)) {
                System.out.print(karakter);
            }
        }

    }

}
