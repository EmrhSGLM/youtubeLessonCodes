import java.util.Arrays;

public class Question_05 {

    public static void main(String[] args) {

        /*
         * Verilen bir array'in mountain array olup olmadıgını kontrol eden ve sonucu consola yazdıran bir method create ediniz
         *
         * int input1[] = {0, 2, 5, 3, 1};
         * int input2[] = {5, 2, 7, 1, 4};
         *
         * Bir array elemanlari en buyuk degerine kadar surekli artan, en buyuk  degerinden sonra surekli azalan deger aliyorsa Mountain Array'dir
         */
        int input1[] = {0, 2, 5, 3, 1};
        int input2[] = {5, 2, 7, 1, 4};

        mountainArrayControl(input1);
        mountainArrayControl(input2);


    }

    public static void mountainArrayControl(int []arr){

        int max = arr[0]; int index = 0; boolean result = true;

        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }

        for(int i=0 ; i < index ; i++){
            if(arr[i] < arr[i+1]){
                continue;
            }else {
                result=false;
                break;
            }
        }
        if(result){
           for(int i = index ; i < arr.length-1 ; i++){
               if(arr[i] > arr[i+1]){
                   continue;
               }else {
                   result = false;
                   break;
               }
           }
        }
        if(result){
            System.out.println(Arrays.toString(arr) + " => Mountain Arraydir.");
        } else {
            System.out.println(Arrays.toString(arr) + " => Mountain Array Degildir.");
        }




    }




}
