package lesson_32;

public class NestedLoops02 {

    /*
            Asagidaki sekli ekrana yazdiran kodu ekrana yazdiriniz

                      *
                     ***
                    *****
                   *******
                  *********
                 ***********
                  *********
                   *******
                    *****
                     ***
                      *

     */

    public static void main(String[] args) {
        for(int satir = 1 ; satir < 7 ; satir++){
            for(int bosluk = 1 ; bosluk < (7-satir) ; bosluk++){
                System.out.print(" ");
            }
            for(int yildiz = 1 ; yildiz <= (2*satir-1) ; yildiz++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int satir = 5 ; satir > 0 ; satir --){
            for(int bosluk = 1 ; bosluk < (7-satir) ; bosluk++){
                System.out.print(" ");
            }
            for(int yildiz = 1 ; yildiz <= (2*satir-1) ; yildiz++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
