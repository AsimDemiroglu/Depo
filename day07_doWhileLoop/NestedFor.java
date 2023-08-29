package day07_doWhileLoop;

import java.util.Scanner;

public class NestedFor {
    public static void main(String[] args) {

//her ay icin 4 hafta olmalı bunu loop ile 3 ay icin yazdiralim

//        for (int i = 1; i < 4; i++) {
//            System.out.println("ay" + i);
//            for (int k = 1; k < 5; k++){
//                System.out.println("hafta" + k);}
//        }
//        /*Asagıdaki sekli ekrana yazdırınız.
//
//         ***
//         ***
//         ***
//         ***
//         */
//        for (int i =1 ; i<5 ; i++){
//            for (int x=1; x<4 ; x++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//        for (int i = 1 ; i<5 ; i++){
//            for (int k = 1 ; k<=i ; k++){
//                System.out.print(k+" ");
//            }
//                System.out.println();
//        }
//        // Asagidaki sekli cizen kodu yazınız.
//        // &&&&&
//        // &&&&
//        // &&&
//        // &&
//        // &

        for (int i = 1 ; i<6 ; i++){
            for (int k = 5 ; k>=i ; k--){
                System.out.print("&");
            }
            System.out.println();
        }
        Scanner input = new Scanner(System.in);
//        System.out.println("lütfen satır sayısı gir");
//
//        int sayi = input.nextInt();
//        for (int i=1 ; i<=sayi ; i++){
//            for (int k =sayi ; k>=i ; k --){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }






    }
}
