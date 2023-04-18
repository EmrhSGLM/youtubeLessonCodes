package lesson_13;

public class LogicalOperator {

    public static void main(String[] args) {
        //  && --> Tum ihtimallerin saglanmasi gerekmektedir.Bir tanesi bile saglanmasa sonuc False olur
        //  || --> Tum ihtimallerden herhangi birinin dogru olması ya da saglamasi sonucu True yapar
        //   ! --> Sonucun zıttını dondurur !false ==> true  !true ==> false
        int a = 5;
        int b = 2;
        int c = 10;

        //boolean sonuc = a > 3 && b < 5 && c > 20;

        boolean sonuc = a > 20 || b < 1 || c > 12;

        System.out.println(!sonuc);
    }
}
