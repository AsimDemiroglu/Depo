package homework3;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        //kullanıcıdan
        //a) Sıfır dışında 3 un kati cift sayi sayi
        //girmesini isteyiniz
        //b) Kullanıcı dogru girdikce
        //“dogru sayı tekrar giriniz  ya da çıkmak
        //için sıfıra basınız”
        //deyiniz
        //c) yanlış girerse
        //“kaybettiniz hatalı giriş yaptınız”
        // yazdırınız ve
        //d) girdiği her dogru deger için 100 puan alsın
        //ve hata yaptıgında veya cıktıgında toplam
        //puanları ekrana yazdırsın
        Scanner input = new Scanner(System.in);
        System.out.println("Sıfır dışında 3 un kati cift sayi sayi girin");
        int sayac = 0;
        while (true) {
            int sayi = input.nextInt();
            if (sayi % 3 == 0 && sayi != 0) {
                System.out.println("dogru girdiniz tekrar yada cıkmak icin 0");
            } else if (sayi == 0) {
                break;
            } else {
                System.out.println("kaybettin");
            }
            sayac=sayac+100;
        }
        System.out.println(sayac);
    }
}


