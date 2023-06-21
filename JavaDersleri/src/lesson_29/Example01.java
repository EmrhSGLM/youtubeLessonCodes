package lesson_29;

public class Example01 {

    //  71 den 183'e kadar tum tek sayilari yazdiriniz

    public static void main(String[] args) {

        int i = 71;
        while(i < 184){

            if(i % 2 != 0){
                System.out.print(i+" ");
            }
            i++;
        }

    }

}
