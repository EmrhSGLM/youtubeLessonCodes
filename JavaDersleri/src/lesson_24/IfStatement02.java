package lesson_24;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {
        // if - else if
        //Kullanicidan basari notunu alin ve  tabloya gore basari derecesini ekrana yaziniz
        //0 - 30 ==> FF
        //31 - 45 ==> CC
        //46 - 65 ==> CB
        //66 - 85 ==> BB
        //86 - 100 ==> AA
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen basari notunuzu giriniz ... ");
        int not = input.nextInt();

        if(not < 31) {
            System.out.println("FF");
        }else if(not < 46 ){
            System.out.println("CC");
        }else if(not < 66 ){
            System.out.println("CB");
        }else if(not < 86 ){
            System.out.println("BB");
        }else {
            System.out.println("AA");
        }






    }

}
