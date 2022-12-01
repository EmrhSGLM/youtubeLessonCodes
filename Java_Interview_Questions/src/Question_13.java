public class Question_13 {

    public static void main(String[] args) {
        /*
         * Write a Java Program to swap two numbers
         *
         * Swap (takas) islemini --> a=3, b=5 iken a=5, b=3 degerlerini alması
         * islemidir. iki yoldan yaptiginiz java kodunu yaziniz.
         *
         *  1.Yol: 3. degisken kullanarak
         *  2.Yol: 3. degisken kullanmadan
         */

       //System.out.println("1. Yol");
       //int a=3;
       //int b=5;
       //System.out.println("İlk Degerleri => "+" a="+a+" b="+b);
       //int c = a; // c=3
       //a = b; // a = 5
       //b = c ; //b=3
       //System.out.println("Son Degerleri => "+" a="+a+" b="+b);

        System.out.println("2.Yol");
        int a=3;
        int b=5;
        System.out.println("İlk Degerleri => "+" a="+a+" b="+b);
        a = a-b;
        b = a+b;
        a = b-a;
        System.out.println("Son Degerleri => "+" a="+a+" b="+b);


    }
}
