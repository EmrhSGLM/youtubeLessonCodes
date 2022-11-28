import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan aldıgınız elemanlardan oluşan bir listede
        tekrarlanan elemanları silen bir program yaziniz.
        */

        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        int islem = 1 ;

        while(islem == 1){
            scan = new Scanner(System.in);
            System.out.println("Eklemek istediginiz elemani giriniz : ");
            String eleman = scan.nextLine();
            list.add(eleman);
            System.out.println("Devam etmek icin 1'e, cikis icin 2'ye basiniz : ");
            islem = scan.nextInt();
        }

        System.out.println("Listenin İlk Hali : " + list);
        // [Ali, Ahmet, Hakan, Ali, Ali, Hakan]

        for(int i=0 ; i<list.size() ; i++){
            for(int j=i+1 ; j<list.size() ; j++){

                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println("\nTekrar Eden Elemanlar Silindi.\n");
        System.out.println("Listenin Son Hali : " + list);
        // [Ali, Ahmet, Hakan]



    }
}
