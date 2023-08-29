package day07_doWhileLoop;

import java.util.Scanner;

public class DoWhile01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi=0;

        do {
            System.out.println("lutfen sayı gir");
            System.out.println("afferim kazandın");
            sayi = input.nextInt();

        }while (sayi<100);
        System.out.println("kaybettin keriz");
        }
    }

