package lesson_30;

public class Ex01 {

    // "Java" String'ini karakter indexi cift ise "**" tek ise "-" sembolu yazılarak
    // "J**a-v**a-" String'ine ceviren kodu yaziniz

    public static void main(String[] args) {
        String str = "Java";

        int i = 0;

        do{
          char karakter = str.charAt(i);

          if(i % 2 == 0){
              System.out.print(karakter+"**");
          }else{
              System.out.print(karakter+"-");
          }

          i++;

        } while(i < str.length());

    }



}
