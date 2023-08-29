package day04Switch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int gün = input.nextInt();
        switch (gün){
            case 1:
                System.out.println("ocak");
            case 2:
                System.out.println("subat");
            case 3:
                System.out.println("mart");
            case 4:
                System.out.println("nisan");
            case 5:
                System.out.println("mayıs");
            case 6:
                System.out.println("haziran");
            case 7:
                System.out.println("temmuz");
            case 8:
                System.out.println("agustos");
            case 9:
                System.out.println("eylul");
            case 10:
                System.out.println("ekim");
            case 11:
                System.out.println("kasım");
            case 12:
                System.out.println("aralık");
                break;
            default:
                System.out.println("lütfen gecerli bir ay gir ");
        }




    }
}
