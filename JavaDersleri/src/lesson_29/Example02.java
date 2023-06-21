package lesson_29;

public class Example02 {

    // "Java" String'ini "J*a*v*a*" String'ine ceviren kodu yaziniz ve
    // sonucu consalda gosteriniz

    public static void main(String[] args) {
        String str = "Java";
        int i = 0;
        while(i < str.length()){

            System.out.print(str.charAt(i)+"*");

            i++;
        }
    }


}
