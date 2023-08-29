package Homework;

import java.util.Scanner;

public class Homework2 {


    //Kullanicidan gunu ismini girmesini isteyin, girilen gun hafta ici bir gun ise
    //“Simdi calisma zamani tatile .. gun var” seklinde hafta sonu tatiline kac
    //gun kaldigini yazdirin, girilen gun hafta sonu ise “Simdi dinlenme
    //zamani” yazdirin
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("gün ismi giriniz");
        String gün = input.next();
        int sayi = 7;
        if (gün.equalsIgnoreCase("pazartesi")) {
            System.out.println(sayi - 2 + "gün sonra tatildir simdi calısma vakti");
        } else if (gün.equalsIgnoreCase("salı")) {
            System.out.println(sayi - 3 + "gün sonra tatildir simdi calısma vakti");
        } else if (gün.equalsIgnoreCase("carsamba")) {
            System.out.println(sayi - 4 + "gün sonra tatildir simdi calısma vakti");
        } else if (gün.equalsIgnoreCase("persembe")) {
            System.out.println(sayi - 5 + "gün sonra tatildir simdi calısma vakti");
        } else if (gün.equalsIgnoreCase("cuma")) {
            System.out.println(sayi - 6 + "gün sonra tatildir simdi calısma vakti");
        } else if (gün.equalsIgnoreCase("cumartesi")) {
            System.out.println("simdi tatil dinlenme vakti");
        } else if (gün.equalsIgnoreCase("pazar")) {
            System.out.println("simdi tatil dinlenme vakti");
        } else {
            System.out.println("girilen bilgi yanlıstır");
        }


    }
}
