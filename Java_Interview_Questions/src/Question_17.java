import java.util.Arrays;

public class Question_17 {

    public static void main(String[] args) {
        /*
        Bir tamsayı dizisinde tüm sıfırları sona koyan bir program create ediniz.

        input : {3, 0, 4, 2, 0}
        output: {3, 4, 2, 0, 0}
         */

        int[] input = {3, 0, 4, 2, 0};
        int[] output = new int[input.length];

        int index = 0;
        int count = 0;
        int count1 = 1;

        while(index != input.length){

            if(input[index] != 0){
                output[count] = input[index];
                count++;
            }else {
                output[input.length-count1] = input[index];
                count1++;
            }
            index++;
        }
        System.out.println(Arrays.toString(output));






    }
}
