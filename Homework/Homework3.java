package Homework;

import java.util.Scanner;

public class Homework3 {
    //if ve Ternary ile (Lütfen 2 yolla da cözün)
    //Kullanicidan üçgenin kenar uzunluklarını alıp eşkenar, ikizkenar veya çeşit kenardan hangisi
    //oldugunu ekrana yazdıran kodu yazınız
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ücgenin bir kenar uzunlugunu girin");
        int kenar1 = input.nextInt();
        System.out.println("ücgenin bir kenar uzunlugunu girin");
        int kenar2 = input.nextInt();
        System.out.println("ücgenin bir kenar uzunlugunu girin");
        int kenar3 = input.nextInt();
        if(kenar1==kenar2 && kenar1==kenar3){
            System.out.println("Bu bir eskenar ucgendir");
        }
        else if (kenar1==kenar2 || kenar1==kenar3 || kenar2==kenar3){
            System.out.println("Bu bir ikizkenar ucgendir");
        }
        else {
            System.out.println("Bu bir cesitkenar ucgendir");
        }
        String sonuc = kenar1==kenar2 && kenar1==kenar3 ? "bu bir eşkanardır" :
                kenar1==kenar2||kenar1==kenar3||kenar2==kenar3 ? "bu bir ikizkenar ücgendir" : "bu bir cesitkenardır";
        System.out.println(sonuc);

    }
}
