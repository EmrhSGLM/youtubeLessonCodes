package lesson_24;

public class IfStatement03 {

    public static void main(String[] args) {
        // Nested if
        /*
               Bilet numarasi cift ise ;
                      "10" a bolunebiliyorsa Sansli kisi
               Bilet numarasi tek ise ;
                      "9" a bolunebiliyorsa Sansli kisi
         */
        int biletNo = 95;

        if(biletNo % 2 == 0){
           if(biletNo % 10 == 0){
               System.out.println("Sansli kisi ...");
           }else {
               System.out.println("Sansiniz tekrar deneyiniz");
           }
        }else {
            if(biletNo % 9 == 0){
                System.out.println("Sansli kisi ...");
            }else {
                System.out.println("Sansiniz tekrar deneyiniz");
            }
        }


    }

}
