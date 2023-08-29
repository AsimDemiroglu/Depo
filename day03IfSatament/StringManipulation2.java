package day03IfSatament;

import java.util.Scanner;

public class StringManipulation2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
     //   System.out.println("lutfen adınızı girin");
       // char userName = input.next().charAt(0);
        //System.out.println("lutfen sifrenizi girin");
        //char userPasword = input.next().charAt(0);
        //System.out.println(""+userName+userPasword);



        // System.out.println("Lutfen isimnizi ve soyisminizi giriniz girer misiniz");
        //String name= input.nextLine();   //Hasan Yılmaz
        //char ilkHarf1=name.charAt(0);
        //char ikiniciHarf=name.split(" ")[1].charAt(0);
        //System.out.println(""+ilkHarf1+ikiniciHarf);


        String user1 = "ali";
        String user2 = "Ali";
      //  System.out.println(user1.equals(user2));
        //boolean sonuc2 = user2.equals(user1);
        //System.out.println(sonuc2);

       // String user3 ="ali";
       // System.out.println(user3.equalsIgnoreCase(user1));

        int sayi1 = 100;
        int sayi2 = 150;
        System.out.println(sayi1==sayi2);
        System.out.println(sayi1==sayi2-50);
        boolean result1 = sayi1 == sayi2;
        System.out.println(result1);

        boolean result2 ;
        System.out.println(result2=sayi1+50==sayi2);
        System.out.println("result2:" + result2);

         int deneme1 =10;
         int  deneme2=20;

         //boolean sonuc2=10!=20;
       // System.out.println(sonuc2);

     //   int randomsayi = 4222;
   //     System.out.println(randomsayi%10);

 //       System.out.println(randomsayi%100-randomsayi%10);

        System.out.println("bir harf giriniz");
        char harf = input.next().charAt(0);
        boolean resultHarf = harf>='A' && harf<='Z';
        System.out.println(resultHarf);
       //boolean resulSayi = sayi>=1 && sayi<=9;
      // System.out.println(sayi);

        System.out.println("sayi giriniz");
       int sayi = input.nextInt();
      //  System.out.println(sayi<50||sayi>100);










    }






}
