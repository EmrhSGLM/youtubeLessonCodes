package lesson_29;

public class Example03 {

    //  Size verilen String'de tekrarsiz karakterleri ekrana yazdirin
    //     "Merhaba Mehmet" => rb mt

    public static void main(String[] args) {
        String str = "Merhaba Mehmet";
        int i = 0;
        while(i < str.length()){
            char karakter = str.charAt(i);
            if(str.indexOf(karakter) == str.lastIndexOf(karakter)){
                System.out.print(karakter);
            }
            i++;
        }
    }

}
