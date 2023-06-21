package lesson_30;

public class Ex02 {

    // 20'den 0'a kadar olan sayılari console yazdirin
    // increment(++) kullanarak gercekleştirin

    public static void main(String[] args) {
        int i = -20;

        do{
            System.out.print((i*(-1))+" ");

            i++;

        } while(i < 1);
    }



}
