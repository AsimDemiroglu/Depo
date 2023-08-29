package day03IfSatament;

import java.util.Scanner;

public class ifSatament01 {

    private static String[] args;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      //  System.out.println("bir sayı girin");
        //int sayi1= input.nextInt();
        //if(sayi1%2==0){
           // System.out.println("girdiginiz sayi cift sayidir");


      //  System.out.println("bir sayi giriniz");
        //int sayi2 = input.nextInt();
      // int sayi3 = Math.abs(sayi2);
        //if(sayi3>=100&&sayi3<=1000){
        //    System.out.println("girdiginiz : "+ sayi2+ "sayisi 3 basamaklıdır");

     //   }

      //  System.out.println("bir sayı gir");
       // int sayi1= input.nextInt();
       // if(sayi1%2==0){
        //System.out.println("girdiginiz sayi cift sayidir");










        //else {
          //  System.out.println("girdiginiz sayi tektir");
       // }


        System.out.println("bir sayı gir");
       int sayi1=input.nextInt();
       if(sayi1<0){
           System.out.println("sayı negatif");
       } else if (sayi1>0){
           System.out.println("sayı pozitif");
       }else {
           System.out.println("sayı sıfır");
       }
         if (sayi1<0){
             System.out.println("sayı negatif");
         } else if (sayi1 ==0){
             System.out.println("sayı sıfırdır");
         }else{
             System.out.println("sayı pozitif");
         }

       }

    }




