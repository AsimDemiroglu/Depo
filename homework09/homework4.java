package homework09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        //Kullanıcıdan hasta isimlerini kayıt altına
        //almasını saglayın ArrayList olusturun
        //        a) Kullanıcı sadece bosluk ve hiçlik
        //girerse ise isim bosluk veya hiçlik
        //girilemez kontrol edip tekrar girer misiniz
        //yazdıran isim bilgisini tekrar aldıran
        //        b) kullanıcı kayıt işleminden çıkması
        //gerektiginde q’a basarak kayıt işlemini
        //sonlardırmasını sağlayın
        Scanner input = new Scanner(System.in);
        ArrayList<String> sayı = new ArrayList<String>();
        int sayı1 = 0;
        while (true) {
            System.out.println("lutfen " + (sayı1 + 1) + ". hasta ismini gir Cikmak icin \"q\" harfine bas");
            String isim = input.nextLine();
            sayı1++;
            if (isim.equalsIgnoreCase("q")) {
                break;
            }
            if (isim.trim().isBlank()) {
                System.out.println("Isim bosluk veya hiclik girilemez kontrol edip tekrar gir");
                sayı1--;
                continue;
            }
            sayı.add(isim);
        }
        System.out.println("hasta isimleri: " + sayı);
    }
}
