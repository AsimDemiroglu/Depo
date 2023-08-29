package day04Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gün = input.nextInt();
//        if (gün == 1) {
//            System.out.println("pazar");
//        } else if (gün == 2) {
//            System.out.println("pazartesi");
//        } else if (gün == 3) {
//            System.out.println("carsamba");
//        } else if (gün == 4) {
//            System.out.println("persembe");
//        } else if (gün == 5) {
//            System.out.println("cuma");
//        } else if (gün == 6) {
//            System.out.println("cumartesi");
//        } else if (gün == 6) {
//            System.out.println("pazar");
//        }
        switch (gün) {
            case 1:
                System.out.println("pazartesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("carsamba");
                break;
            case 4 :
                System.out.println("persembe");
                break;
            case 5 :
                System.out.println("cuma");
                break;
            case 6 :
                System.out.println("cumartesi");
                break;
            case 7 :
                System.out.println("pazar");
                break;
            default:
                System.out.println("gecerli numara girin");
        }
    }

}

