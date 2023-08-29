package homework09;

import java.util.Arrays;

public class homework3 {
    public static void main(String[] args) {
        String cumle[][] = {{"Ali", "süt", "ic"}, {"Muhammed Ali", "aferin"}, {"Hasan", "tatilde", "ödevlerini", "bitir"}};
        String uzun = cumle[0][0];
        String kısa = cumle[0][0];
        for (String w[] : cumle) {
            for (String k : w) {
                if (k.length() < kısa.length()) {
                    kısa = k;
                }
                if (k.length() > uzun.length()) {
                    uzun = k;
                }
            }
        }
        System.out.println(uzun + " " + uzun.length() + " karakter");
        System.out.println(kısa + " " + kısa.length() + " karakter");

    }
}
//3.
//String cumle[][]={{"Ali", "süt", "ic"},{"Muhammed Ali",
//"aferin"},{"Hasan", "tatilde", "ödevlerini", "bitir"}};
//        //multidimentional Array'in en uzun ve en kısa
//kelimelerin character sayisini bulunuz.
//        // en uzun ve en kısa kelimeyi bulunuz