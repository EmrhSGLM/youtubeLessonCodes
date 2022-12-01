import java.util.Scanner;

public class Question_12 {

    public static void main(String[] args) {
        /*
		Kulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
		Palindrome :tersten okunuşu  aynı olan cümleler
		ornek1 : Ey edip Adanada pide ye
		Örnek2:  Traş niçin şart
		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz : ");
        String str = scan.nextLine();
        palindromeControl(str);

    }

    public static void palindromeControl(String cumle){
        String kova="";
        for(int i=cumle.length()-1; i>=0; i--){
            kova += cumle.substring(i,i+1);
        }

        if(cumle.equalsIgnoreCase(kova)){
            System.out.println("Girilen cumle PALİNDROME");
        }else {
            System.out.println("Girilen cumle PALİNDROME degildir.");
        }


    }
}
