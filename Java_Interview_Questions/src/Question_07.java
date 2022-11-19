import java.util.Arrays;
import java.util.Scanner;

public class Question_07 {

    public static void main(String[] args) {

		 /*
		Verilen bir arayın elemanlarının ardışık artan toplamını hesaplayıp
		yeni bir array'a atayan bir program create ediniz..

		input : { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }

		output : [ 3, 5+1, 2+7+9, 2+3+5+7 ]
		         [3, 6, 18, 17]
       */

        // statikCozum();
        // dinamikCozum();


    }
    public static void statikCozum(){
        int [] arr = { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 };
        int [] arrYeni = new int[4];
        int sayac = 0;
        int indexBul = 1;

        do{
            int toplam = 0;

            for(int i=0 ; i<=sayac ; i++){
                toplam += arr[indexBul - 1 + i];
            }
            arrYeni[sayac] = toplam;
            sayac++;
            indexBul += sayac;

        }while(sayac < arrYeni.length);

        System.out.println("Ardışık Artan Toplamı : " + Arrays.toString(arrYeni));
    }

    public static void dinamikCozum(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Array uzunlugunuzu giriniz : ");
        int arrUzunluk = scan.nextInt();
        boolean result = true;
        int arrYeniUz = 0;

        for(int i=1 ; i>0; i++){
            if(i*(i+1)/2 == arrUzunluk){
                arrYeniUz = i;
                break;
            }else if(i*(i+1)/2 > arrUzunluk){
                result = false;
                System.out.println("Array uzunlugu ardışık artmıyor.");
                break;
            }
        }
        if(result){
            int arr[] = new int[arrUzunluk];
            for(int i=1 ; i <= arrUzunluk ; i++){
                System.out.print(i + ". elemanı giriniz : ");
                int eleman = scan.nextInt();
                arr[i-1] = eleman;

            }
            int [] arrYeni = new int[arrYeniUz];
            int sayac = 0;
            int indexBul = 1;

            do{
                int toplam = 0;

                for(int i=0 ; i<=sayac ; i++){
                    toplam += arr[indexBul - 1 + i];
                }
                arrYeni[sayac] = toplam;
                sayac++;
                indexBul += sayac;

            }while(sayac < arrYeni.length);

            System.out.println("Ardışık Artan Toplamı : " + Arrays.toString(arrYeni));

        }
    }


}
