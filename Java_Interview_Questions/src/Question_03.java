import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_03 {

    public static void main(String[] args) {
        /*
         * Girilen bir String'deki kelimeleri tek tek saydiran ve sonucu console örnekde oldugu gibi yazdıran java code create ediniz.
         *
         * For Example: Input : String is "Ali came to school and Ayse came to school"
         * Output : Ali=1, came=2, to=2, school=2, and=1, Ayse=1
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz : ");
        String cumle = scan.nextLine();

        String[] arr = cumle.split(" ");
        List<String> list = new ArrayList<>();
        int sayac = 0;

        for(int i=0 ; i< arr.length ; i++){
            sayac = 0;
            for(int j=0 ; j< arr.length ; j++){

                if(arr[i].equals(arr[j])){

                    sayac++;
                }
            }

            if(!list.contains(arr[i]+"="+sayac)){
                list.add(arr[i]+"="+sayac);
            }
        }

        for(int i=0 ; i<list.size() ; i++){
            if(i<list.size()-1) {
                System.out.print(list.get(i) + ", ");
            }else{
                System.out.print(list.get(i));
            }
        }

    }
}
