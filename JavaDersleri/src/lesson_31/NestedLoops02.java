package lesson_31;

public class NestedLoops02 {

    /* Example 2:Asagidaki sekli cizen kodu yaziniz
                1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5
         */

    public static void main(String[] args) {
            for(int i = 1 ; i < 6 ; i++){

                for(int j = 1 ; j <= i ; j++){

                    System.out.print(j+" ");
                }
                System.out.println();
            }
    }
}
