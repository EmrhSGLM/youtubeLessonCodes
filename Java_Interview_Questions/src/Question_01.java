import java.util.Scanner;

public class Question_01 {

    public static void main(String[] args) {

        // Kullanıcıdan alınan String'i tersten yazdiran bir method create ediniz£>£

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir ifade giriniz");
        String str = scan.nextLine();
        reverse(str);

    }

    public static void reverse(String ifade){
        for(int i=ifade.length()-1 ; i >= 0 ; i--){
            //System.out.print(ifade.charAt(i));
            System.out.print(ifade.substring(i,i+1));
        }
    }


}
