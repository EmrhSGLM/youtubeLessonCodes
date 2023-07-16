package lesson_31;

public class NestedLoops03 {
    /*
         Example 3:Asagidaki sekli cizen kodu yaziniz
                    * * * *
                    * * *
                    * *
                    *

                    1 2 3 4
                    1 2 3
                    1 2
                    1

     */
    public static void main(String[] args) {
            for(int i = 4 ; i > 0 ; i--){
                for(int j = 1 ; j <= i ; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }

            for(int i = 4 ; i > 0 ; i--){
                for(int j = 1 ; j <= i ; j++){
                    System.out.print(j+" ");
                }
                System.out.println();
            }

    }

}
