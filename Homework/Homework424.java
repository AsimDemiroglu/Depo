package Homework;

import java.util.Scanner;

public class Homework424 {

    //Kullanicidan iki sayi alin ve buyuk olmayan sayiyi ekrana yazdirin
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int numara1 = input.nextInt();
        System.out.println("lütfen bir sayı giriniz");
        int numara2= input.nextInt();
        if(numara1<numara2){
            System.out.println(numara1);
        } else if (numara2<numara1) {
            System.out.println(numara2);

        }else{
            System.out.println("lütfen tekrar giriniz");
        }

    }




}
