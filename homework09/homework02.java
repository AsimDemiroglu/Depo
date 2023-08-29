package homework09;

import java.util.ArrayList;

public class homework02 {
    public static void main(String[] args) {

        String kelime = "Java";
        ArrayList<Long> yeni = carpma(kelime, 2, 3, 5);
        System.out.println("Girdiginiz " + yeni.get(0) + " adet sayi ile " + kelime + " kelimesinin"
                + " character sayisinin çarpım sonucu ..." + yeni.get(1));
    }

    public static ArrayList<Long> carpma(String kelime, int... k) {
        ArrayList<Long> liste = new ArrayList<>();
        int uzunluk = kelime.length();
        int carpım = 1;
        int sayıAdedi = 0;
        for (int w : k) {
            sayıAdedi++;
            carpım = carpım * w;
        }
        System.out.println(sayıAdedi);
        liste.add((long) sayıAdedi);
        liste.add((long) carpım * uzunluk);
        return liste;
    }
}





