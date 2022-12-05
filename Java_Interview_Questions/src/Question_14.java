import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_14 {

    public static void main(String[] args) {
        /*
         * Fibonacci dizisi create ediniz.
         *
         */
        fibonacci();
    }

    public static void fibonacci(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sinir degeri giriniz : ");
        int sinir = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        int toplam = 0;
        for(int i=1 ; i>0 ; i++){
            toplam = list.get(list.size()-2)+list.get(list.size()-1);
            if(toplam>sinir){
                break;
            }else {
                list.add(toplam);
            }
        }

        System.out.println("Fibonacci Dizisi : " + list);


    }







}
