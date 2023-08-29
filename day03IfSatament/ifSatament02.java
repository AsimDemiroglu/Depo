package day03IfSatament;

import java.util.Scanner;

public class ifSatament02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      //  System.out.println("gün numarasını giriniz");
//        byte numara = input.nextByte();
  //      if(numara==1){
    //        System.out.println("pazar");
  //     }  else if(numara==2){
    //         System.out.println("pazartersi");
      //  } else if(numara==3){
   //         System.out.println("salı");
 //       } else if(numara==4){
     //       System.out.println("carsamba");
       // } else if(numara==5){
      //      System.out.println("persembe");
//        } else if(numara==6){
  //          System.out.println("cuma");
    //    } else if(numara==7){
      //      System.out.println("cumartesi");
        //} else {
         //   System.out.println("girmeniz gereken sayı aralıgının icinde bir değer giriniz. Değerler 1,2,3,4,5,6,7");
       // }

        System.out.println("bir gün giriniz");
        String gun = input.next();
        if(gun.equalsIgnoreCase("Pazartesi")){
            System.out.println("hafta ici");
        } else if (gun.equalsIgnoreCase("Salı")){
            System.out.println("hafta ici");
        } else if (gun.equalsIgnoreCase("Carsamba")){
            System.out.println("hafta ici");
        }
        else if (gun.equalsIgnoreCase("Persembe")){
            System.out.println("hafta ici");
        }
        else if (gun.equalsIgnoreCase("Cuma")){
            System.out.println("hafta ici");
        } else if (gun.equalsIgnoreCase("Cumartesi")){
            System.out.println("hafta sonu");
        }
        else if (gun.equalsIgnoreCase("Pazar")){
            System.out.println("hafta sonu");
        } else {
            System.out.println("girdiginiz data gün ismi değildir");
        }



     boolean haftaici =gun.equalsIgnoreCase("Pazartesi")
             ||gun.equalsIgnoreCase("Salı")
             ||gun.equalsIgnoreCase("Carsamba")
             ||gun.equalsIgnoreCase("Persembe")
             ||gun.equalsIgnoreCase("Cuma");
        boolean haftasonu = gun.equalsIgnoreCase("cumartesi")
                ||gun.equalsIgnoreCase("pazar");
        if(haftaici){
            System.out.println("haftaici");
        } else if(haftasonu){
            System.out.println("haftasonu");
        } else{
            System.out.println("girdiginiz data gün deil");
        }


        /*
        ilk gün
        1pazar
        2pazartesi
         */



    }

}
