import java.util.Scanner;

public class Question_08 {

    public static void main(String[] args) {
        /*

		Kullanıcıdan 2 String girmesini isteyin. String'lerin buyuk-kucuk harf duyarliligi olmadan
		karakterleri ve karakter sayıları aynıysa console girilen karakterler "Anagram" ,
		aksi takdirde console "Anagram Değil" yazdırın.
		Ornek : "Pide" ve"EDİP" anagram ifadelerdir..
		        "Mary" and "army" and "RAMY" are Anagrams

		 */
        Scanner scan = new Scanner(System.in);
        System.out.print("1. String ifadeyi giriniz :");
        String str1 = scan.next();
        System.out.print("2. String ifadeyi giriniz :");
        String str2 = scan.next();
        Boolean result = true;

        if(str1.length() == str2.length()){

            for(int i=0 ; i<str1.length() ;i++){

                if(str1.toLowerCase().contains(str2.toLowerCase().substring(i,i+1))){
                    continue;
                }else{
                    result = false;
                    break;
                }
            }


        }else {
            result = false;
        }

        if(result){
            System.out.println("İfadeler Anagram dır.");
        }else {
            System.out.println("İfadeler Anagram Degildir.");
        }





    }
}
