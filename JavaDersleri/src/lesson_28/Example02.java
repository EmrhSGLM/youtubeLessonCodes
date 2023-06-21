package lesson_28;

public class Example02 {

    // "Java" String'ini "J*a*v*a*" String'ine ceviren kodu yaziniz ve
    // sonucu consalda gosteriniz

    public static void main(String[] args) {
        String str = "Java";
        for (int i=0 ; i < str.length() ; i++){
            System.out.print(str.charAt(i)+"*");
        }

    }

}
