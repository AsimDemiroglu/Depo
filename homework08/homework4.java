package homework08;

import java.util.Arrays;
import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        //Kullanıcıdan hasta yaşlarının kayıt altına
        //almasını saglayın
        //a) Kullanıcıdan kayıt edilecek hasta sayisini
        //alınız.
        //b) Kullanıcı eksi yas girer ise yas eksi
        //girilemez kontrol edip tekrar girer misiniz
        //yazdıran yas bilgisini tekrar aldıran
        //c) kullanıcı kayıt işleminden çıkması
        //gerektiginde 0’a basarak kayıt işlemini
        //sonlardırmasını sağlayın.
        //Scanner input = new Scanner(System.in);
//        System.out.println("\nlutfen kac hasta kayıdı yapcagınızı yazın");
//        int sayı = input.nextInt();
//
//
//        int sayılar[] = new int[sayı];
////
//        for (int i = 0; i < sayı; i++) {
//            System.out.println("\nlütfen " + (i + 1) + " . hasta yaşlarını giriniz");
//            int yaşlar1 = input.nextInt();
//            if (yaşlar1<0){
//                System.out.println("yaş eksi girilemez tekrar giriniz");
//            }
//
//            System.out.println("cıkmak istiyorsanız 0 a istemiyorsanız sayıya basın");
//            int exit = input.nextInt();
//            if (exit == 0) {
//                break;
//            }
//            sayılar[i] = yaşlar1;
//
//        }
//        System.out.println("\nkaydedilen hasta yaşları;");
//        for (int i = 0; i < sayı; i++) {
//            System.out.print(sayılar[i]+ " ");
//        }
        //WHİLE İLE YAP
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen kaç hasta yaşı girişi yapacağınızı yazınız ve çıkmak istediğinizde '0' a basınız");
        int sayi = input.nextInt();


        int hastaSayisi[] = new int[sayi];
        for (int i = 0; i < sayi; i++) {
            System.out.println("lütfen kayıt edilecek" + " " + (i + 1) + ".hasta yaşını giriniz");
            int hastaYasi = input.nextInt();
            if (hastaYasi < 0) {
                System.out.println("yas eksi girilemez kontrol edip tekrara giriniz");
                i--;
                continue;

            }

            hastaSayisi[i] = hastaYasi;


            if (hastaYasi == 0) {
                break;
            }


        }
        System.out.println(Arrays.toString(hastaSayisi));

    }
}

