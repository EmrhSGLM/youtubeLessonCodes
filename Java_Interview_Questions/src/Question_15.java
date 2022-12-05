public class Question_15 {

    public static void main(String[] args) {
        /*
       verilen bir string'deki tekrarlayan character'leri ve tekrar sayisini console yazdırınız.
       input : "aaabbccccddddd"
       output : a3b2c4d5
      */

        String input = "aaabbccccddddd";
        String output = "";
        int sayac = 0 ;

        for(int i=0 ; i<input.length() ; i++){
            sayac = 0 ;

            for(int j=0; j<input.length() ; j++){

                if(input.charAt(i) == input.charAt(j)){
                    sayac++;
                }
            }

            if(!output.contains(input.substring(i,i+1))){
                output += input.substring(i,i+1) + sayac;
            }
        }

        System.out.println("output : " + output);

    }
}
