package Homework;

import java.util.Scanner;

public class Homework524 {


//    Kullanicidan artik yil olup olmadigini kontrol
//    etmek icin yil girmesini isteyin.
//            Kural 1: 4 ile bolunemeyen yillar artik yil
//            degildir
//    Kural 2: 4 ile bolunup 100 ile bolunemeyen
//    yillar artik yildir
//    Kural 3: 4’un kati olmasina ragmen 100 ile
//    bolunebilen yillardan sadece
//400’un kati olan yillar artik yildi

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir yıl giriniz");
        int yil = input.nextInt();
//        if (!(yil % 4 == 0)) {
//            System.out.println("artik yıl değildir");
//        } else if (!(yil % 100==0) ||yil % 4 == 0 ) {
//            System.out.println("artik yıldır");
//        } else if ( yil%4==0 && yil%100==0 && yil%400==0) {
//            System.out.println("artik yıldır");
//        } else{
//            System.out.println("girdiğiniz data hatalıdır tekrar deneyiniz");
//        }
        if (yil % 400 == 0) {
            System.out.println("artik yıldır");
        } else if ((yil % 100) == 0) {
            System.out.println("artık yıl değildir");
        } else if (yil % 4 == 0) {
            System.out.println("artık yıldır");
        }
        System.out.println("yeni");
        if ((yil % 400 == 0) || (yil % 4 == 0 && yil % 100 != 0)) {
            System.out.println("artık yıldır");
        } else {
            System.out.println("artık yıl değildir");
        }

    }
}


