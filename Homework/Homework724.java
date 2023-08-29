package Homework;

import java.util.Scanner;

//Kullanıcıdan 6 karakterli arasında “_” olan iki kelimelik bir password olusturmasını isteyin
//Password ilk kelimesinin ve ilk  harf Buyuk harf ve ikini kelimenin ilk harfi kucuk harf ise
//“password başarı ile olusturuldu yazan”
//Değil ise password kriterlere uymuyor yazan code yazdırını

public class Homework724 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" 6 karakterli arasında “_” olan iki kelimelik bir password olusturunuz");
        while (true) {
            String psw = input.nextLine();
            char word1 = psw.charAt(0);

            if (psw.contains("_")) {
                char word2 = psw.split("_")[1].charAt(0);
                if (Character.isUpperCase(word1) && Character.isLowerCase(word2)) {
                    System.out.println("password başarı ile olusturuldu ");
                    break;
                } else if (!(Character.isUpperCase(word1) && Character.isLowerCase(word2))) {
                    System.out.println("password kriterlere uymuyor, tekrar giriniz");
                }
            }
            System.out.println("dogru giriniz");
        }
    }
}

