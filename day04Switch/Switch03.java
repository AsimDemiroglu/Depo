package day04Switch;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
        double sayi2= input.nextDouble();
        System.out.println("4 işlem girin");
        char islem = input.next().charAt(0);
        System.out.println("lütfen sayı giriniz");
        double sayi1= input.nextDouble();

        switch (islem){
            case '+':
                System.out.println("sonuc :" +(sayi2+sayi1));
                break;
                case '-':
                System.out.println("sonuc :" +(sayi2-sayi1));
                break;
                case '/':
                System.out.println("sonuc :" +(sayi2/sayi1));
                break;
                case '*':
                System.out.println("sonuc :" +(sayi2*sayi1));
                break;
                default:
                    System.out.println("lütfen dogru giriniz");
        }


      }
}
