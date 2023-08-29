package homework3;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int sayi = input.nextInt();

        int tekrar = 0;

        System.out.println("Bu sayıyı bölen sayılar: ");
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                System.out.print(i + " ");
                tekrar++;
            }
        }

        System.out.println("\nBölen sayısı: " + tekrar);
    }
}
//Kullanicidan bir sayi alin
////          ve bu sayiyi tam bolen sayilari
////          ve toplam kac tane olduklarini
//ekranda yazdirin
//
//Ekran Cıktsıı : 1 3 5 15
//15 sayisi için 4 tane tam bölen vardır