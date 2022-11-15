import java.util.ArrayList;
import java.util.List;

public class Question_04 {

    public static void main(String[] args) {
        /*
         * Verilen bir arraydeki, toplamı belirli bir sayı olan tüm çiftleri bulup, console yazdıran Java code'nu yazın
         *
         *  For example;
         * input : {4, 6, 5, -10, 8, 5, 20} ==> 10
         * Output : 4 + 6 = 10, 5 + 5 = 10, -10+ 20 = 10
         *
         */

        int arr[] = {4, 6, 5, -10, 8, 5, 20};
        List<String> list = new ArrayList<>();

        for(int i=0 ; i<arr.length ; i++){

            for(int j=i+1 ; j<arr.length ; j++){

                if(arr[i]+arr[j] == 10){

                    String bir = Integer.toString(arr[i]);
                    String iki = Integer.toString(arr[j]);
                    list.add(bir+" + "+iki+" = 10");

                }
            }
        }

        for(int i=0 ; i<list.size() ; i++){
            if(i<list.size()-1){
                System.out.print(list.get(i)+", ");
            }else {
                System.out.print(list.get(i));
            }
        }




    }
}
