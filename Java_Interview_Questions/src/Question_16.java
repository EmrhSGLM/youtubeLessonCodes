public class Question_16 {

    public static void main(String[] args) {
        /*
        Farklı güçleri olan atlarla bir at yarışı düzenleniyor.
        Atların gücü bir tamsayı dizi assign  edilirse.
        bir birine yakın güçlere sahip at çiftlerini bulunuz.

        For example : {3, 67, 9, 46, 55, 48}
        output 		: 48,46
         */

        int[] arr = {3, 67, 9, 46, 55, 48};
        int count = arr[1]-arr[0];
        int sayi1=0 , sayi2=0;

        for(int i = arr.length-1 ; i > 0 ; i--){

            for(int j = i-1 ; j >= 0 ; j--){

                int count1 = arr[i] - arr[j];
                if(count1<0) count1 *= -1;

                if(count1 < count){
                    count = count1;
                    sayi1 = arr[i];
                    sayi2 = arr[j];
                }

            }
        }

        System.out.println(sayi1+","+sayi2);




    }
}
