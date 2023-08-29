package homework09;

import java.time.Duration;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Scanner;

public class homework0 {
    ////0
//    public static void main(String[] args) {
//        LocalTime japanTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
//        System.out.println(japanTokyo);
//        LocalTime swedenTime = LocalTime.now(ZoneId.of("Europe/Stockholm"));
//        System.out.println(swedenTime);
//        Duration timeDiffrence = Duration.between(japanTokyo, swedenTime);
//        System.out.println(timeDiffrence);
//        System.out.println("----------------");
//        //// Soru 2
//        ////     Kullanicidan bir sayi alin.
//        ////  a ) Bu sayinin tek mi cift mi
//        //oldugunu,
//        ////  b ) sifirdan buyuk mu kucuk mu
//        //oldugunu,
//        // //  c )    ayrica ve 100’den buyukse
//        //birler,onlar ve yuzler basamagindaki
//        //rakamlarin toplamini,
//        ////       100’den kucukse sadece 1’ler
//        //basamagini ekrana yazdiran  3 farklı method
//        //olusturun.





    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayı = input.nextInt();
        System.out.println(sayı);

        if (sayı % 2 == 0) {
            System.out.println("Sayı çifttir.");
        } else {
            System.out.println("Sayı tektir.");
        }

        if (sayı > 0) {
            System.out.println("Sıfırdan büyük.");
        } else {
            System.out.println("Sıfırdan küçük veya eşittir.");
        }

        if (sayı > 100) {
            int total = calculateSumOfDigits(sayı);
            System.out.println("Basamakların toplamı: " + total);
        } else {
            printDigits(sayı);
        }
    }

    public static int calculateSumOfDigits(int number) {
        int toplam = 0;
        while (number != 0) {
            int rakam = number % 10;
            toplam += rakam;
            number /= 10;
        }
        return toplam;
    }

    public static void printDigits(int number) {
        int birler = number % 10;
        number /= 10;
        int onlar = number % 10;
        number /= 10;
        int yüzler = number % 10;

        System.out.println("Birler basamağı: " + birler);
        System.out.println("Onlar basamağı: " + onlar);
        System.out.println("Yüzler basamağı: " + yüzler);
    }
}

