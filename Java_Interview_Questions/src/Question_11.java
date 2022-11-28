import java.util.Arrays;
import java.util.Scanner;

public class Question_11 {

    public static void main(String[] args) {
        /*
         * kullanıcının girdigi bir array'in en buyuk elemani ile en kucuk elemanının
         * farkını bulan ve console yazdıran bir program yaziniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Yazacak oldugunuz array uzunlugunu giriniz : ");
        int elemanSayisi = scan.nextInt();
        int [] arr = new int[elemanSayisi];

        for(int i=0 ; i<arr.length ; i++){
            System.out.print((i+1) + ". elemani giriniz : ");
            arr[i] = scan.nextInt();
        }
        System.out.println("Array => " + Arrays.toString(arr));
        // Array => [8, 0, -2, 10, 15, -15]

        int max = arr[0];
        int min = arr[0];

        for(int i=1 ; i<arr.length ; i++){

            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Max ve Min elemanları Farkı : " + (max-min));


    }



}
