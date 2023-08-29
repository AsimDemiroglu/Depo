package Homework;

import java.util.Scanner;

public class Homework624 {

    //Kullanicidan 4 basamakli pozitif bir tamsayi alip rakamlar toplamini bulalim
    //4 basamaklı değil ise sayi dort basamaklı değil yazan kodu olusturun

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("4 basamaklı bir sayı giriniz");
        int sayi = input.nextInt();
        int absoluteValue = Math.abs(sayi);
        if (absoluteValue>999&& absoluteValue<10000){
        int birler = absoluteValue%10;
        int onlar = (absoluteValue/10)%10;
        int yuzler = (absoluteValue/100)%10;
        int binler = (absoluteValue/1000)%10;
        int toplam = birler+onlar+yuzler+binler;
            System.out.println(toplam);
        }
//        if (sayi < -999) {
//
//            System.out.println(absoluteValue);
//        } else if (sayi>999) {
//            System.out.println(sayi);
//        } else if (!(sayi<-999&&sayi>999)) {
//            System.out.println("sayı dört basamaklı değil");
//
//        }else{
//            System.out.println("girdiginiz data kurallara uygunsuzdur tekrar giriniz");
//        }
    }

}
