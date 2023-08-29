package homework3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        //Bir ile 100 alasında bir  sayi belirleyiniz
        //kullanıcının bu sayiyi bulmasını saglayınız
        //a) girdiği sayi belirledğinizden kucuk ise
        //“bulamadınız sayiyi buyutun “
        //b) girdiği sayi belirlediğinizden buyuk ise
        //“bulamadınız sayiyi kucultun “
        //c) sayiyi tuturursa “kazandınız” yazdirin
        //hatalı giriş şansı 5 olsun beşten fazla
        //hatali girerse hakkınız bitti deyip oyunu
        //sonlandırın
        //6) Kullanıcıdan satır sayısını alarak asagıdakı
        int cevap = 67;
        Scanner input = new Scanner(System.in);
        System.out.println("1 ile 100 arasında bir sayı tuttum bul bakalım");

        int tahminTekrarı =5 ;
        int tahminSayısı = 0;
        while (tahminTekrarı>0){
            int tahmin = input.nextInt();
            if (tahmin==cevap){
                System.out.println("kazandın");
                break;
            }
            else if (tahmin<cevap){
                System.out.println("sayı cevaptan kucuk, büyüt sayıyı");
            }else if (tahmin>cevap){
                System.out.println("sayı cevaptan büyükk. kücült");
            } else {
                System.out.println("sayı giriniz");
            }
            tahminTekrarı--;

        }
        System.out.println("hakkın bitti");
    }
}
