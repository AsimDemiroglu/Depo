package Homework;

import java.util.Scanner;

public class Homework5 {
    //Ternary
    //Kullanıcıdan alınan sayının 3 basamaklı ise sayı 3 basamaklı değil ise sayı 3 basamaklı değil
    //yazan codu yazınız
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("üç basamaklı bir sayı giriniz");
        int sayi= input.nextInt();


        String result = (sayi >= 100 && sayi <= 999) ? "3 basamaklı" : "3 basamaklı değil";
        System.out.println(result);


    }
}
