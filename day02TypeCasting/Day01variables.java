package day02TypeCasting;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Day01variables {

    public static int  sayi1=5;

    public static int number1=5;

    //public static void main(String[] args){


       // Car esyam=new Car();                //Honda güvenli bir sekilde durur
        //esyam.dur();
       // System.out.println(esyam.price);    //10000


//        String name="Yunus";
//        String surName="Deneme";
//        String bosluk=" ";
//        System.out.println(name+" "+surName);    //Yunus Deneme
//        System.out.println("    ");
//
//        System.out.println("\"Yunus\"");        //"Yunus"
//
//        System.out.println("*************************************************");
//
//        System.out.println("\"Yunus\"\bYunus");     //"YunusYunus
//
//        System.out.println("*************************************************");
//
//        System.out.println("\"Yunus\"\nYunus");     //"Yunus"
//                                                    //Yunus
//
//        System.out.println(number1);

      //  System.out.println(ilkIkiSayiToplaUcuncuIleCap(2,6,5));

        //System.out.println(ikiSayininCarpimi(3.0,5.0));

        //System.out.println(ikiSayiToplama(2, 5));




        //int a = 2;
       // double yenia = a;
        //int b = 3;
        //double yenib = b;

    //}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    //hesap makinesi yapımı bölme için
        System.out.println("birinci sayı gir");
        int sayi1=input.nextInt();
                double yenisayi1=sayi1;
        System.out.println("ikinci sayı gir");
        int sayi2= input.nextInt();
        double yenisayi2=sayi2;
        double sayi3=yenisayi1/yenisayi2;
        System.out.println(sayi3);

    }






    }





 //   private static int ilkIkiSayiToplaUcuncuIleCap(int a, int b, int sayi) {
   //     return (a+b)*sayi;
   // }

    //public static int ikiSayiToplama(int a, int b){


      //  a=a+1;
        //int sonuc= a+b;
       // return sonuc;


    //}

    //public static double ikiSayininCarpimi(double a, double b){
      //  return a*b;
    //}








//}












