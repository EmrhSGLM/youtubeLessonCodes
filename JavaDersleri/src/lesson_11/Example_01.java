package lesson_11;

public class Example_01 {
    /*
		 	Kenar uzunlukları 5 ve 3 olan
		 	Dikdortgenin alanini ve cevresini hesaplayan java kodunu yaziniz.

			Ornek Cikti:
			Dikdortgenin Cevresi : 16
			Dikdortgenin Alani : 15
	*/

    public static void main(String[] args) {
        int A = 5;
        int B = 3;
        int dikdortgeninCevresi = 2 * ( A + B);
        int dikdortgeninAlani = A * B ;

        System.out.println("Dikdortgenin Cevresi : " + dikdortgeninCevresi);
        System.out.println("Dikdortgenin Alani : " + dikdortgeninAlani);
    }

}
