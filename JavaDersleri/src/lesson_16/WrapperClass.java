package lesson_16;

public class WrapperClass {

    // Wrapper (Sarmalayıcı) primitive data type'larından birer nesne olarak kullanmak icin olusturulmustur
    // Wrapper class lar non-primitive data type lardir
    // Non-primitive : Hem value(degerini) hem de method lar barındırır
    // Java 5 ile beraber kullanıma baslanmıstır

    public static void main(String[] args) {
        byte minByte = Byte.MIN_VALUE; // -128
        byte maxByte = Byte.MAX_VALUE; // 127

        int minInt = Integer.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;

        long minLong = Long.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;

        // byte => Byte
        // short => Short
        // boolean => Boolean
        // char => Charcter

        System.out.println("minByte = " + minByte);
        System.out.println("maxByte = " + maxByte);

        System.out.println("minInt = " + minInt);
        System.out.println("maxInt = " + maxInt);

        System.out.println("minLong = " + minLong);
        System.out.println("maxLong = " + maxLong);


    }


}
